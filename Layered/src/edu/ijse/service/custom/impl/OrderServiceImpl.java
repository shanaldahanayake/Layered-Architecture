/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import edu.ijse.Dto.OrderDetailDto;
import edu.ijse.Dto.OrderDto;
import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.ItemDao;
import edu.ijse.dao.custom.OrderDao;
import edu.ijse.dao.custom.OrderDetailDao;
import edu.ijse.db.DBConnection;
import edu.ijse.entity.ItemEntity;
import edu.ijse.entity.OrderDetailEntity;
import edu.ijse.entity.OrderEntity;
import edu.ijse.service.custom.OrderService;
import java.sql.Connection;

/**
 *
 * @author Dahanayake
 */
public class OrderServiceImpl implements OrderService{

    private OrderDao orderDao=(OrderDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ORDER);
    private OrderDetailDao orderDetailDao=(OrderDetailDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ORDER_DETAIL);
    private ItemDao itemDao=(ItemDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    @Override
    public String placeOrder(OrderDto dto) throws Exception {
        Connection connection=DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);
            OrderEntity orderEntity=new OrderEntity(dto.getOrderId(),dto.getCustID(),dto.getDate());
            if(orderDao.create(orderEntity)){
                boolean isOrderDetailSaved=true;
                for(OrderDetailDto orderDetailDto:dto.getOrderDetailDtos()){
                    OrderDetailEntity orderDetailEntity=new OrderDetailEntity(
                            dto.getOrderId(),
                            orderDetailDto.getItemCode(),
                            orderDetailDto.getQty(),
                            orderDetailDto.getDiscount());
                    if(!orderDetailDao.create(orderDetailEntity)){
                        isOrderDetailSaved=false;
                    }
                }
                if(isOrderDetailSaved){
                    boolean isItemUpdated=true;
                    
                    for(OrderDetailDto orderDetailDto: dto.getOrderDetailDtos()){
                        ItemEntity itemEntity=itemDao.get(orderDetailDto.getItemCode());
                        if(itemEntity!=null){
                            itemEntity.setQoh(itemEntity.getQoh()-orderDetailDto.getQty());
                            if(!itemDao.update(itemEntity)){
                                isItemUpdated=false;
                            }
                        }
                    }
                    if(isItemUpdated){
                        connection.commit();
                        return "Success";
                    }else{
                        connection.rollback();
                        return "Item Update Error";
                    }
                }else{
                    connection.rollback();
                    return "Order Detail Save Error";
                }
                
            }else{
                connection.rollback();
                return "Order Save Error";
            }
            
        } catch (Exception e) {
            connection.rollback();
            System.out.println(e);
           
        } finally {
            connection.setAutoCommit(true);
        }
        
       return "";
    }
    
}

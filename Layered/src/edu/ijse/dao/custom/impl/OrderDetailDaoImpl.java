/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.CrudUtil;
import edu.ijse.dao.custom.OrderDetailDao;
import edu.ijse.entity.OrderDetailEntity;
import java.util.ArrayList;

/**
 *
 * @author Dahanayake
 */
public class OrderDetailDaoImpl implements OrderDetailDao{

    @Override
    public boolean create(OrderDetailEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO OrderDetail VALUES(?,?,?,?)",t.getOrderId(),t.getItemCode(),t.getQty(),t.getDiscount());
    }

    @Override
    public boolean update(OrderDetailEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Object id) throws Exception {
        return false;
    }

    @Override
    public OrderDetailEntity get(Object id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<OrderDetailEntity> getAll() throws Exception {
        return null;
    }
    
}

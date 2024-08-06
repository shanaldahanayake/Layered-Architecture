/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.Controller;

import edu.ijse.Dto.OrderDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.OrderService;

/**
 *
 * @author Dahanayake
 */
public class OrderController {
    private OrderService orderSerive=(OrderService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ORDER);
    
    public String placeOrder(OrderDto dto) throws Exception{
        return orderSerive.placeOrder(dto);
    }
}

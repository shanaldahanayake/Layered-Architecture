/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.service.custom;

import edu.ijse.Dto.OrderDto;
import edu.ijse.service.SuperService;

/**
 *
 * @author Dahanayake
 */
public interface OrderService extends SuperService{
    public String placeOrder(OrderDto dto) throws Exception;
}

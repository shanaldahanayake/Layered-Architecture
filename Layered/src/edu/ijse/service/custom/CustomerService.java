/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.service.custom;

import edu.ijse.Dto.CustomerDto;
import edu.ijse.service.SuperService;

/**
 *
 * @author Dahanayake
 */
public interface CustomerService extends SuperService{
    public CustomerDto getCustomer(String cusId) throws Exception;
}

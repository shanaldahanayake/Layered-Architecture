/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.Controller;

import edu.ijse.Dto.CustomerDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.CustomerService;

/**
 *
 * @author Dahanayake
 */
public class CustomerController {
    private CustomerService customerService=(CustomerService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);
    public CustomerDto getCustomer(String cusId) throws Exception{
        return customerService.getCustomer(cusId);
    }
}

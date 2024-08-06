/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import edu.ijse.Dto.CustomerDto;
import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.CustomerDao;
import edu.ijse.entity.CustomerEntity;
import edu.ijse.service.custom.CustomerService;

/**
 *
 * @author Dahanayake
 */
public class CustomerServiceImpl implements CustomerService{

    private CustomerDao customerDao=(CustomerDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);
    @Override
    public CustomerDto getCustomer(String cusId) throws Exception {
        
        CustomerEntity entity=customerDao.get(cusId);
        if(entity!=null){
            CustomerDto dto=new CustomerDto(
                    entity.getCustId(),
                    entity.getCustTitle(),
                    entity.getCustName(),
                    entity.getdOB(),
                    entity.getSalary(),
                    entity.getAddress(),
                    entity.getCity(),
                    entity.getProvince(),
                    entity.getPostalCode());
            return dto;
        }
        return null; 
    }
    
}

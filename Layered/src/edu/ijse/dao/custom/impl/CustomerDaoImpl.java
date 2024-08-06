/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.CrudUtil;
import edu.ijse.dao.custom.CustomerDao;
import edu.ijse.entity.CustomerEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Dahanayake
 */
public class CustomerDaoImpl implements CustomerDao{

    @Override
    public boolean create(CustomerEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst= CrudUtil.executeQuery("SELECT * FROM customer WHERE CustID=?", id);
        if(rst.next()){
            CustomerEntity customerEntity=new CustomerEntity(
                    rst.getString("CustID"),
                    rst.getString("CustTitle"),
                    rst.getString("CustName"),
                    rst.getString("DOB"),
                    rst.getDouble("salary"),
                    rst.getString("CustAddress"),
                    rst.getString("City"),
                    rst.getString("Province"),
                    rst.getString("PostalCode"));
            return customerEntity;
        }
        return null;
    }

    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
        return null;
    }
    
}

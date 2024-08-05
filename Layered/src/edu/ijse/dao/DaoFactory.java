/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao;

import edu.ijse.dao.custom.impl.ItemDaoImpl;

/**
 *
 * @author Dahanayake
 */
public class DaoFactory {
    private static DaoFactory daoFactory;
    
    private DaoFactory(){
        
    }
    public static DaoFactory getInstance(){
        if(daoFactory==null){
            daoFactory=new DaoFactory();
        }
        return daoFactory;
    }
    public SuperDao getDao(DaoTypes type){
        switch (type) {
            case ITEM:
                return new ItemDaoImpl();
                
            default:
                return null;
        }
    }
    
    public enum DaoTypes{
        ITEM,CUSTOMER,ORDER,ORDER_DETAIL;
    }
}

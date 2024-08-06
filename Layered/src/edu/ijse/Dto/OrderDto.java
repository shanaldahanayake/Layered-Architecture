/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.Dto;

import java.util.ArrayList;

/**
 *
 * @author Dahanayake
 */
public class OrderDto {
    private String orderId;
    private String custID;
    private String date;

    private ArrayList<OrderDetailDto> orderDetailDtos;

    public ArrayList<OrderDetailDto> getOrderDetailDtos() {
        return orderDetailDtos;
    }

    public void setOrderDetailDtos(ArrayList<OrderDetailDto> orderDetailDtos) {
        this.orderDetailDtos = orderDetailDtos;
    }
    
    public OrderDto() {
    }

    public OrderDto(String orderId, String custID, String date) {
        this.orderId = orderId;
        this.custID = custID;
        this.date = date;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the custID
     */
    public String getCustID() {
        return custID;
    }

    /**
     * @param custID the custID to set
     */
    public void setCustID(String custID) {
        this.custID = custID;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "OrderDto{" + "orderId=" + orderId + ", custID=" + custID + ", date=" + date + '}';
    }

    
}

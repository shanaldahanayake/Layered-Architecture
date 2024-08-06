/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.Dto;

/**
 *
 * @author Dahanayake
 */
public class CustomerDto {
    private String custId;
    private String custTitle;
    private String custName;
    private String dOB;
    private double salary;
    private String address;
    private String city;
    private String province;
    private String postalCode;

    public CustomerDto() {
    }

    public CustomerDto(String custId, String custTitle, String custName, String dOB, double salary, String address, String city, String province, String postalCode) {
        this.custId = custId;
        this.custTitle = custTitle;
        this.custName = custName;
        this.dOB = dOB;
        this.salary = salary;
        this.address = address;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * @return the custTitle
     */
    public String getCustTitle() {
        return custTitle;
    }

    /**
     * @param custTitle the custTitle to set
     */
    public void setCustTitle(String custTitle) {
        this.custTitle = custTitle;
    }

    /**
     * @return the custName
     */
    public String getCustName() {
        return custName;
    }

    /**
     * @param custName the custName to set
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * @return the dOB
     */
    public String getdOB() {
        return dOB;
    }

    /**
     * @param dOB the dOB to set
     */
    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "CustomerDto{" + "custId=" + custId + ", custTitle=" + custTitle + ", custName=" + custName + ", dOB=" + dOB + ", salary=" + salary + ", address=" + address + ", city=" + city + ", province=" + province + ", postalCode=" + postalCode + '}';
    }
    
}

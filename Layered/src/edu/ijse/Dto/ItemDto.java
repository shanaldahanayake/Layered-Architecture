/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.Dto;

/**
 *
 * @author Dahanayake
 */
public class ItemDto {
    private String itemCode;
    private String description;
    private String pack;
    private Integer qoh;
    private Double unitPrice;

    public ItemDto() {
    }

    public ItemDto(String itemCode, String description, String pack, Integer qoh, Double unitPrice) {
        this.itemCode = itemCode;
        this.description = description;
        this.pack = pack;
        this.qoh = qoh;
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "ItemDto{" + "itemCode=" + itemCode + ", description=" + description + ", pack=" + pack + ", qoh=" + qoh + ", unitPrice=" + unitPrice + '}';
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the pack
     */
    public String getPack() {
        return pack;
    }

    /**
     * @param pack the pack to set
     */
    public void setPack(String pack) {
        this.pack = pack;
    }

    /**
     * @return the qoh
     */
    public Integer getQoh() {
        return qoh;
    }

    /**
     * @param qoh the qoh to set
     */
    public void setQoh(Integer qoh) {
        this.qoh = qoh;
    }

    /**
     * @return the unitPrice
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    
}

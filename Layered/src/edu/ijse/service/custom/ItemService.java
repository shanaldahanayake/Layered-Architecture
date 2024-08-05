/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.service.custom;

import edu.ijse.Dto.ItemDto;
import edu.ijse.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Dahanayake
 */
public interface ItemService extends SuperService{
    String save(ItemDto dto) throws Exception;
    String update(ItemDto dto) throws Exception;
    String delete(String itemCode) throws Exception;
    ItemDto get(String itemCode) throws Exception;
    ArrayList<ItemDto> getAll() throws Exception;
}

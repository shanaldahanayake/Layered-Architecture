/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.Controller;

import edu.ijse.Dto.ItemDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.ItemService;
import java.util.ArrayList;

/**
 *
 * @author Dahanayake
 */
public class ItemController {

    private ItemService itemService=(ItemService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);
            
    public String save(ItemDto dto) throws Exception{
        return itemService.save(dto);
    }
    public String update(ItemDto dto) throws Exception{
        return itemService.update(dto);
    }
    public String delete(String itemCode) throws Exception{
        return itemService.delete(itemCode);
    }
    public ArrayList<ItemDto> getAll() throws Exception{
        return itemService.getAll();
    }
    public ItemDto get(String itemCode) throws Exception{
        return itemService.get(itemCode);
    }
}

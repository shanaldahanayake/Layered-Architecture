/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import edu.ijse.Dto.ItemDto;
import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.ItemDao;
import edu.ijse.entity.ItemEntity;
import edu.ijse.service.custom.ItemService;
import java.util.ArrayList;

/**
 *
 * @author Dahanayake
 */
public class ItemServiceImpl implements ItemService{

    private ItemDao itemDao=(ItemDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);
    @Override
    public String save(ItemDto dto) throws Exception {
        ItemEntity entity=getItemEntity(dto);
        return itemDao.create(entity)?"Success":"Fail";
    }

    @Override
    public String update(ItemDto dto) throws Exception {
        ItemEntity entity=getItemEntity(dto);
        return itemDao.update(entity)?"Success":"Fail";
    }

    @Override
    public String delete(String itemCode) throws Exception {
        return itemDao.delete(itemCode)?"Success":"Fail";
    }

    @Override
    public ItemDto get(String itemCode) throws Exception {
        ItemEntity entity=itemDao.get(itemCode);
        if(entity!=null){
            return getItemDto(entity);
        }
        return null;
    }

    @Override
    public ArrayList<ItemDto> getAll() throws Exception {
        ArrayList<ItemEntity> itemEntities=itemDao.getAll();
        if(itemEntities!=null && !itemEntities.isEmpty()){
            ArrayList<ItemDto> itemDtos=new ArrayList<>();
            
            for(ItemEntity itemEntity:itemEntities){
                itemDtos.add(getItemDto(itemEntity));
            }
            return itemDtos;
        }
        return null;
    }
    private ItemEntity getItemEntity(ItemDto dto){
        ItemEntity entity=new ItemEntity(dto.getItemCode(), 
                dto.getDescription(), 
                dto.getPack(), 
                dto.getQoh(), 
                dto.getUnitPrice());
        return entity;
    }
    private ItemDto getItemDto(ItemEntity entity){
        return new ItemDto(
                entity.getItemCode(),
                entity.getDescription(),
                entity.getPack(),
                entity.getQoh(),
                entity.getUnitPrice());
    }
}

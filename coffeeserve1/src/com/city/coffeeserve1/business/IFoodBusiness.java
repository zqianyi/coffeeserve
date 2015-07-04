package com.city.coffeeserve1.business;

import java.io.File;
import java.io.InputStream;
import java.util.List;

import com.city.coffeeserve1.note.value.FoodValue;

public interface IFoodBusiness {
	public List getList(int pageNo,int rows) throws Exception;
	public int getPageAcount(int rows) throws Exception;
    public void savePhoto(int id, File photo, String fileName,String contentType) throws Exception ;
	public void add(FoodValue fv) throws Exception;
	public InputStream getPhoto(int id) throws Exception; 
	public List<FoodValue> getList() throws Exception ;
}

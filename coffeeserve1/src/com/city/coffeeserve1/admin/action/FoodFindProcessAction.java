package com.city.coffeeserve1.admin.action;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.city.coffeeserve1.business.IFoodBusiness;
import com.city.coffeeserve1.business.impl.FoodBusinessImpl;
import com.city.coffeeserve1.note.value.FoodValue;


public class FoodFindProcessAction {
	private IFoodBusiness fb=null;
	private FoodValue fv=null;
	private List<FoodValue> foodlist=null;
	
	public IFoodBusiness getFb() {
		return fb;
	}
	public void setFb(IFoodBusiness fb) {
		this.fb = fb;
	}
	public FoodValue getFv() {
		return fv;
	}
	public void setFv(FoodValue fv) {
		this.fv = fv;
	}
	public List<FoodValue> getFoodlist() {
		return foodlist;
	}
	public void setFoodlist(List<FoodValue> foodlist) {
		this.foodlist = foodlist;
	}
	public String tofoodfind() throws Exception
	{
		//ApplicationContext ac=new ClassPathXmlApplicationContext("appcontext.xml");
	//	FoodBusinessImpl fi=(FoodBusinessImpl)ac.getBean("FoodBusinessImpl");
		foodlist=fb.getList();
		return "success";
	}
	
	
}

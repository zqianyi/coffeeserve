package com.city.coffeeserve1.admin.action;

import java.io.InputStream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.city.coffeeserve1.business.IFoodBusiness;
import com.city.coffeeserve1.business.impl.FoodBusinessImpl;
import com.city.coffeeserve1.note.value.FoodValue;


public class FoodPhotoShowAction {
	private IFoodBusiness fb=null;
	private int fid=0;
	private FoodValue fv=null;
	
	public IFoodBusiness getFb() {
		return fb;
	}
	public void setFb(IFoodBusiness fb) {
		this.fb = fb;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public FoodValue getFv() {
		return fv;
	}
	public void setFv(FoodValue fv) {
		this.fv = fv;
	}
	public InputStream getInputStream() throws Exception
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("appcontext.xml");
		FoodBusinessImpl fi=(FoodBusinessImpl)ac.getBean("FoodBusinessImpl");
			
		return fi.getPhoto(fid);
		
	}
	
	
	
	public String show() throws Exception
	{
		//IEmployeeBusiness eb=new EmployeeBusinessImpl();
		//ApplicationContext ac=new ClassPathXmlApplicationContext("appcontext.xml");
		//FoodBusinessImpl fi=(FoodBusinessImpl)ac.getBean("FoodBusinessImpl");
		System.out.println("okkk");
			InputStream in=fb.getPhoto(fid);
	
		
		
		return "success";
	}

}

package com.city.coffeeserve1.admin.action;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.city.coffeeserve1.business.IFoodBusiness;
import com.city.coffeeserve1.business.impl.FoodBusinessImpl;
import com.city.coffeeserve1.business.impl.FoodkindBusinessImpl;
import com.city.coffeeserve1.note.value.FoodValue;

public class FoodProcessAction {
	private IFoodBusiness fb=null;
	private FoodValue fv=null;
	
	private File photo=null;
	private String fileName=null;
	private String contentType=null;
	
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
	public File getPhoto() {
		return photo;
	}
	public void setPhoto(File photo) {
		this.photo = photo;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
public String add() throws Exception{
		
		System.out.println("Add方法工作。。");
		//ApplicationContext ac=new ClassPathXmlApplicationContext("appcontext.xml");
	//	FoodBusinessImpl fi=(FoodBusinessImpl)ac.getBean("FoodBusinessImpl");
	
		fb.add(fv);
		
		//保存员工图片
		//if(fileName!=null&&fileName.trim().length()>0)
	//	{
			fb.savePhoto(fv.getFid(), photo, fileName, contentType);
	//	}
		
		
		return "success";
	
	
	}
}

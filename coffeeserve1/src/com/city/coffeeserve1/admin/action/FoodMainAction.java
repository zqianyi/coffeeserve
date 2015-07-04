package com.city.coffeeserve1.admin.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.city.coffeeserve1.business.IFoodBusiness;
import com.city.coffeeserve1.business.impl.FoodBusinessImpl;
import com.city.coffeeserve1.note.value.FoodValue;
import com.jspsmart.upload.SmartUpload;
import com.opensymphony.xwork2.ActionSupport;

public class FoodMainAction extends ActionSupport 
{
	private IFoodBusiness fb=null;
	private FoodValue fv=null;
	private double total=0;
	private int pageno=0;
	private int rows=2;
	private int pageCount=0;
	private List<FoodValue> foodList=null;
	
	public IFoodBusiness getFb() {
		return fb;
	}
	public void setFb(IFoodBusiness fb) {
		this.fb = fb;
	}
	public FoodValue getFv() {
		return fv;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getPageno() {
		return pageno;
	}
	public void setPageno(int pageno) {
		this.pageno = pageno;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public List<FoodValue> getFoodList() {
		return foodList;
	}
	public void setFoodList(List<FoodValue> foodList) {
		this.foodList = foodList;
	}
	public void setFv(FoodValue fv) {
		this.fv = fv;
	}


	
	public String show() throws Exception{
	//ApplicationContext ac=new ClassPathXmlApplicationContext("appcontext.xml");
	//FoodBusinessImpl fi=(FoodBusinessImpl)ac.getBean("FoodBusinessImpl");
			rows=6;
	pageCount=fb.getPageAcount(rows);
	
	
	if(pageno<1){
		pageno=1;
	}
	if(pageno>pageCount)
	{
		pageno=pageCount;
	}
	
	foodList=fb.getList(pageno,rows);
	System.out.println("ok03");
	return "success";
	}
	
}
	
	
	



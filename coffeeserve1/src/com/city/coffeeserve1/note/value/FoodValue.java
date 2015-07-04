package com.city.coffeeserve1.note.value;

import java.io.File;
import java.sql.Blob;









public class FoodValue {

	private int fid=0;
	private String fname=null;
	private String fkind=null;
	private String fstock=null;
	private Double fprice=0.0;
	private Blob photo=null;
	private String fileName=null;
	private String contentType=null;
	
	
	public Blob getPhoto() {
		return photo;
	}
	public void setPhoto(Blob photo) {
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
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFkind() {
		return fkind;
	}
	public void setFkind(String fkind) {
		this.fkind = fkind;
	}
	public String getFstock() {
		return fstock;
	}
	public void setFstock(String fstock) {
		this.fstock = fstock;
	}
	public Double getFprice() {
		return fprice;
	}
	public void setFprice(Double fprice) {
		this.fprice = fprice;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	
	
	
	
	

}

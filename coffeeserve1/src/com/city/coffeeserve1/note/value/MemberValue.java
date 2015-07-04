package com.city.coffeeserve1.note.value;

import java.util.Set;






public class MemberValue {
	private int mid=0;
	private String mname=null;
	private String mpassword=null;
	private String memail=null;
	private String msex=null;

	private FoodkindValue fk=null;
	private Set<BehaveValue> behaves=null;
	
	public Set<BehaveValue> getBehaves() {
		return behaves;
	}
	public void setBehaves(Set<BehaveValue> behaves) {
		this.behaves = behaves;
	}
	public FoodkindValue getFk() {
		return fk;
	}
	public void setFk(FoodkindValue fk) {
		this.fk = fk;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMpassword() {
		return mpassword;
	}
	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public String getMsex() {
		return msex;
	}
	public void setMsex(String msex) {
		this.msex = msex;
	}
	
	

}

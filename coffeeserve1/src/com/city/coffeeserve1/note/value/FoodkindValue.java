package com.city.coffeeserve1.note.value;

import java.util.Set;




public class FoodkindValue {
	private String fkid=null;
	private String fkname=null;
	private Set<FoodValue> fvs=null;
	private Set<MemberValue> mvs=null;
	
	public Set<MemberValue> getMvs() {
		return mvs;
	}
	public void setMvs(Set<MemberValue> mvs) {
		this.mvs = mvs;
	}
	public String getFkid() {
		return fkid;
	}
	public void setFkid(String fkid) {
		this.fkid = fkid;
	}
	public String getFkname() {
		return fkname;
	}
	public void setFkname(String fkname) {
		this.fkname = fkname;
	}
	public Set<FoodValue> getFvs() {
		return fvs;
	}
	public void setFvs(Set<FoodValue> fvs) {
		this.fvs = fvs;
	}
	

}

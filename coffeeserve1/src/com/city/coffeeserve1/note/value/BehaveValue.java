package com.city.coffeeserve1.note.value;

import java.util.Set;



public class BehaveValue {
	private int no=0;
	private String name=null;
	private Set<MemberValue> members=null;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<MemberValue> getMembers() {
		return members;
	}
	public void setMembers(Set<MemberValue> members) {
		this.members = members;
	}
	
}

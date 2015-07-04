package com.city.coffeeserve1.admin.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

//用户登录处理Action
public class UserLoginProcessAction {

	private String userid=null;
	private String password=null;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String login() throws Exception
	{
	
		Map session=ActionContext.getContext().getSession();
		session.put("userid", userid);
		
		return "success";
		
	}
	
}

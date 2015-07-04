package com.city.coffeeserve1.admin.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.city.coffeeserve1.business.IMemberBusiness;
import com.city.coffeeserve1.business.impl.MemberBusinessImpl;
import com.city.coffeeserve1.note.value.MemberValue;
import com.opensymphony.xwork2.ActionSupport;


public class MemberProcessAction extends ActionSupport{
	private IMemberBusiness mb=null;
	 private MemberValue mv=null;
	 private int[] behaves=null;
	 
	public IMemberBusiness getMb() {
		return mb;
	}

	public void setMb(IMemberBusiness mb) {
		this.mb = mb;
	}

	public int[] getBehaves() {
		return behaves;
	}

	public void setBehaves(int[] behaves) {
		this.behaves = behaves;
	}

	public MemberValue getMv() {
		return mv;
	}

	public void setMv(MemberValue mv) {
		this.mv = mv;
	}

  	public void validate()
 
	{
		
		if(mv.getMname()==null||mv.getMname().trim().length()<2)
		{
			this.addFieldError("mname", "账号为空");
			this.addActionError("员工账号为空");
					
		}
		if(mv.getMpassword()==null||mv.getMpassword().trim().length()<2)
		{
			this.addFieldError("mpassword", "密码为空");
			this.addActionError("员工密码为空");
		}

		
		
	}

	public String add() throws Exception
	{
		//ApplicationContext ac=new ClassPathXmlApplicationContext("appcontext.xml");
		//MemberBusinessImpl mi=(MemberBusinessImpl)ac.getBean("MemberBusinessImpl");
		mb.add(mv);
		
	/*	if(behaves!=null){
			mi.addBehaves(mv.getId(), behaves);
		}*/
		
		return "success";
		
	}

}

package com.city.coffeeserve1.admin.action;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.city.coffeeserve1.business.IBehaveBusiness;
import com.city.coffeeserve1.business.IFoodkindBusiness;
import com.city.coffeeserve1.business.impl.BehaveBusinessImpl;
import com.city.coffeeserve1.business.impl.FoodkindBusinessImpl;
import com.city.coffeeserve1.business.impl.MemberBusinessImpl;
import com.city.coffeeserve1.note.value.BehaveValue;
import com.city.coffeeserve1.note.value.FoodkindValue;




public class MemberMainAction {
	private IFoodkindBusiness fk=null;
	private IBehaveBusiness bb=null;
	private List<FoodkindValue> foodkindList=null;
	private List<BehaveValue> behaveList=null;
	
	public IFoodkindBusiness getFk() {
		return fk;
	}

	public void setFk(IFoodkindBusiness fk) {
		this.fk = fk;
	}

	public IBehaveBusiness getBb() {
		return bb;
	}

	public void setBb(IBehaveBusiness bb) {
		this.bb = bb;
	}

	public List<BehaveValue> getBehaveList() {
		return behaveList;
	}

	public void setBehaveList(List<BehaveValue> behaveList) {
		this.behaveList = behaveList;
	}

	public List<FoodkindValue> getFoodkindList() {
		return foodkindList;
	}

	public void setFoodkindList(List<FoodkindValue> foodkindList) {
		this.foodkindList = foodkindList;
	}
	public String toadd() throws Exception
	{
	//	ApplicationContext ac=new ClassPathXmlApplicationContext("appcontext.xml");
	//	FoodkindBusinessImpl fi=(FoodkindBusinessImpl)ac.getBean("FoodkindBusinessImpl");
	//	BehaveBusinessImpl bi=(BehaveBusinessImpl)ac.getBean("BehaveBusinessImpl");
		foodkindList=fk.getList();
		behaveList=bb.getList();
		System.out.println(behaveList.size());
		
		return "toadd";
	}
}

package com.city.coffeeserve1.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.city.coffeeserve1.business.IFoodkindBusiness;
import com.city.coffeeserve1.note.value.FoodValue;
import com.city.coffeeserve1.note.value.FoodkindValue;



public class FoodkindBusinessImpl implements IFoodkindBusiness{
	
	private SessionFactory sf=null;
	FoodkindValue fk=null;
	
	
	public SessionFactory getSf() {
		return sf;
	}


	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}


	public FoodkindValue getFk() {
		return fk;
	}


	public void setFk(FoodkindValue fk) {
		this.fk = fk;
	}


	public List<FoodkindValue> getList() throws Exception {
		// TODO Auto-generated method stub
		List<FoodkindValue> list=new ArrayList<FoodkindValue>();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
	String hql="from FoodkindValue fk";
		Query q=session.createQuery(hql);
       list=q.list();
		tx.commit();
		session.close();
		return list;
	}
}

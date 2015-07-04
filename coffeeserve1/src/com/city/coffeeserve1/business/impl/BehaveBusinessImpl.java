package com.city.coffeeserve1.business.impl;

import java.util.ArrayList;
import java.util.List;






import org.hibernate.Query;
import org.hibernate.Session;

import com.city.coffeeserve1.business.IBehaveBusiness;
import com.city.coffeeserve1.note.value.BehaveValue;
import com.city.coffeeserve1.note.value.FoodValue;



public class BehaveBusinessImpl implements IBehaveBusiness{

     Session session=null;
	
	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}
/*	public List<BehaveValue> getList() throws Exception {*/
		
	public List<BehaveValue> getList() throws Exception{
		
		String hql="from BehaveValue  bv";
		List<BehaveValue> list=new ArrayList<BehaveValue>();
	//	Session session=sf.openSession();
	//	Transaction tx=session.beginTransaction();
		Query query=session.createQuery(hql);
		list=query.list();
	//	tx.commit();
	//	session.close();
		return list;
	}

}

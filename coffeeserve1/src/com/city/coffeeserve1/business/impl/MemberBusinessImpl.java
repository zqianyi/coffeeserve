package com.city.coffeeserve1.business.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.city.coffeeserve1.business.IMemberBusiness;
import com.city.coffeeserve1.note.value.BehaveValue;
import com.city.coffeeserve1.note.value.MemberValue;


public class MemberBusinessImpl implements IMemberBusiness{
	private SessionFactory sf=null;

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	public void add(MemberValue mv) throws Exception{
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(mv);
		
		tx.commit();
		session.close();
	}
	public void addBehaves(String id, int[] behaveNos) throws Exception {
		Session session=sf.getCurrentSession();
		MemberValue mv=(MemberValue)session.get(MemberValue.class, id);
		for(int bno:behaveNos){
			BehaveValue bv=(BehaveValue)session.get(BehaveValue.class, bno);
			mv.getBehaves().add(bv);
		}

	}
}

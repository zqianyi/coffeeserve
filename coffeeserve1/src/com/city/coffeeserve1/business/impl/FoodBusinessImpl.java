package com.city.coffeeserve1.business.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.commons.io.FileUtils;
import org.hibernate.LobHelper;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.city.coffeeserve1.business.IFoodBusiness;
import com.city.coffeeserve1.note.value.BehaveValue;
import com.city.coffeeserve1.note.value.FoodValue;
import com.city.coffeeserve1.note.value.MemberValue;





public class FoodBusinessImpl implements IFoodBusiness{

	
	
	private SessionFactory sf=null;
	FoodValue fv=null;
	
	public SessionFactory getSf() {
		return sf;
	}
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	
	public FoodValue getFv() {
		return fv;
	}
	public void setFv(FoodValue fv) {
		this.fv = fv;
	}
	public List getList(int pageNo,int rows) throws Exception
	{
	
		String hql="from FoodValue  fv";
		List<FoodValue> list=new ArrayList<FoodValue>();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Query q=session.createQuery(hql);
	
		q.setMaxResults(rows);
		q.setFirstResult((pageNo-1)*rows);
		list=q.list();
		tx.commit();
		session.close();
		return list;
		
	}
	public int getPageAcount(int rows) throws Exception
	{
		int pageCount=0;
		
		List<FoodValue> list=new ArrayList<FoodValue>();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		
		//SessionFactory sf=HibernateFactory.getSessionFactory();
		//Session session=sf.openSession();
		//Transaction tx=session.beginTransaction();
		String hql="select count(fv.fid) from FoodValue fv";
		Query q=session.createQuery(hql);
	//	q.setDouble(0, low);
	//	q.setDouble(1, high);
		
		int productCount=((Long)q.uniqueResult()).intValue();
		if(productCount%rows==0){
			pageCount=productCount/rows;
		}
		else
		{
			pageCount=productCount/rows+1;
		}
		
		tx.commit();
		session.close();
		
		return pageCount;
		
	}
	
	
	
	public void savePhoto(int id, File photo, String fileName,
			String contentType) throws Exception {
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		FoodValue fv=(FoodValue)session.get(FoodValue.class, id);
		
		LobHelper lh=session.getLobHelper();
		InputStream iphoto=new FileInputStream(photo);
		Blob bphoto=lh.createBlob(iphoto, iphoto.available());
		
		fv.setPhoto(bphoto);
		fv.setFileName(fileName);
		fv.setContentType(contentType);
		
	    session.save(fv);
		
		tx.commit();
		session.close();
	}
	
public void add(FoodValue fv) throws Exception{
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(fv);
		
		tx.commit();
		session.close();
	}
	
public InputStream getPhoto(int id) throws Exception {
	
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	FoodValue fv=(FoodValue)session.get(FoodValue.class, id);
	InputStream in=fv.getPhoto().getBinaryStream();
	System.out.println("ok");
	tx.commit();
	session.close();
	return in;
}
public List<FoodValue> getList() throws Exception {
	
	
	
	String hql="from FoodValue  fv";
	List<FoodValue> list=new ArrayList<FoodValue>();
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	Query query=session.createQuery(hql);
	list=query.list();
	tx.commit();
	session.close();
	return list;
}
	
	
}

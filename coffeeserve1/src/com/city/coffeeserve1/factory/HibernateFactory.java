package com.city.coffeeserve1.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateFactory {
	public static SessionFactory getSessionFactory() throws Exception
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		
		return sf;
		
	}
}

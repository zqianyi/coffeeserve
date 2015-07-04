package com.city.coffeeserve1.advice;

import java.lang.reflect.Method;
import java.util.List;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.city.coffeeserve1.business.impl.BehaveBusinessImpl;



public class BusinessTransactionAdvice  implements MethodInterceptor{

private SessionFactory sf=null;
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public Object  invoke(MethodInvocation mi) throws Throwable {
		//方法前代码处
				System.out.println("事务处理方法前...");
				Session session=sf.openSession();
				Transaction tx=session.beginTransaction();
				BehaveBusinessImpl dbi=(BehaveBusinessImpl)mi.getThis();
				dbi.setSession(session);
					
				Object result=mi.proceed();
				//方法后代码处
				tx.commit();
				session.close();
				System.out.println("事务处理方法后...");
				return result;
	}

	
}

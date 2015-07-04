package com.city.coffeeserve1.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class UserLoginCheckInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		
		System.out.println("登录拦截器。。。");
		Map session=ActionContext.getContext().getSession();
		if(session.get("userid")==null)
		{
			return "login";
		}
		String result=ai.invoke();
		
		return result;
	}

}

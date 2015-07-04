package com.city.coffeeserve1.business;

import com.city.coffeeserve1.note.value.MemberValue;



public interface IMemberBusiness {
	public void add(MemberValue mv) throws Exception;
    public void addBehaves(String id, int[] behaveNos) throws Exception;
}

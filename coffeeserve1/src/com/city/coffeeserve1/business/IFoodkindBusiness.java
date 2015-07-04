package com.city.coffeeserve1.business;

import java.util.List;

import com.city.coffeeserve1.note.value.FoodkindValue;

public interface IFoodkindBusiness {
	public List<FoodkindValue> getList() throws Exception;
}

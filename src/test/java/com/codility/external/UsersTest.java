package com.codility.external;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.codility.external.impl.OrdersServiceImpl;

public class UsersTest {
	
	private OrdersServiceImpl ordersService;


	@Test
	public void test() {
		ordersService=new OrdersServiceImpl();

		assertTrue(ordersService.itemsBought("").isEmpty());
	}

}

package com.codility.external;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.codility.external.impl.UsersServiceImpl;



public class OrdersTest {
	
	
	@InjectMocks
	private UsersServiceImpl usersService;
	
	@Mock
	private OrdersService ordersService;


	@Test
	public void test() {
		MockitoAnnotations.initMocks(this);

		usersService=new UsersServiceImpl(ordersService);
		
		List<String> list=List.of("a");
		Mockito.when(ordersService.itemsBought(Mockito.any())).thenReturn(list);
		
		
		assertEquals(usersService.getNumberOfItemsBought("Jhon"),1);
	}
}

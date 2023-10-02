package com.codility.external.web;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.codility.app.web.impl.UsersController;
import com.codility.external.impl.UsersServiceImpl;

public class UsersControllerTest {
	
	@Mock
	private UsersServiceImpl usersService;
	
	@InjectMocks
	private UsersController usersController;


	@Test
	public void test() {
		MockitoAnnotations.initMocks(this);

		usersController=new UsersController(usersService);
		
		Mockito.when(usersService.getNumberOfItemsBought(Mockito.any())).thenReturn(10);
		
		
		assertEquals(usersController.totalItemsBought(""),10);
	}

}

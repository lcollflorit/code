/* * evelb 19 sept 2023 * Coll Luis * UsersService.java */
package com.codility.external.impl;

import org.springframework.stereotype.Service;

import com.codility.external.OrdersService;
import com.codility.external.UsersService;

/**
 * The Class UsersService.
 */
@Service
public class UsersServiceImpl implements UsersService{

	/**
	 * Instantiates a new users service.
	 *
	 * @param ordersService the orders service
	 */
	public UsersServiceImpl(OrdersService ordersService) {
		this.ordersService=ordersService;
	}
    
    /** The orders service. */
    private OrdersService ordersService;

    /**
     * Gets the number of items bought.
     *
     * @param username the username
     * @return the number of items bought
     */
    public int getNumberOfItemsBought(String username) {
        return ordersService.itemsBought(username).size();
    }
}
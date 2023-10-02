/* * evelb 19 sept 2023 * Coll Luis * OrdersServiceImpl.java */
package com.codility.external.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.codility.external.OrdersService;

/**
 * The Class OrdersServiceImpl.
 */
@Service
public class OrdersServiceImpl implements OrdersService{

	/**
	 * Items bought.
	 *
	 * @param username the username
	 * @return the list
	 */
	@Override
	public List<String> itemsBought(String username) {
		return new ArrayList<>();
	}

}

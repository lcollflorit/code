package com.codility.app.web.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codility.external.UsersService;

@Controller
public class UsersController {

    private UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService=usersService;
    }

    @RequestMapping(
    		  value = "/ex/foos", 
    		  method = RequestMethod.GET)
    public Map<String, Integer> totalItemsBought(@PathVariable("username") String username) {
        Integer items= usersService.getNumberOfItemsBought(username);
        Map<String, Integer> result=new HashMap<>();
        result.put("totalItemsBought", items);
		return result;

    }
}
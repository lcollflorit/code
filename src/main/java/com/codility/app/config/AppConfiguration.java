package com.codility.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.codility.external.OrdersService;
import com.codility.external.impl.OrdersServiceImpl;
import com.codility.external.impl.UsersServiceImpl;

@ComponentScan(basePackages = {"com.codility.external"})
@Configuration
public class AppConfiguration {


 @Bean
 public OrdersService getOrdersService() {
  return new OrdersServiceImpl();
 }
 
 @Bean
 public UsersServiceImpl getUsersService() {
  return new UsersServiceImpl(getOrdersService());
 }
}

package com.fastcart.application.service;

import java.util.List;

import com.fastcart.application.model.CustomerAccountEntity;
import com.fastcart.application.model.OrderDetailsInfo;

public interface FastCartOrderService {

	public void orderDetailsSave(OrderDetailsInfo orderDetails);
 
	public List<OrderDetailsInfo> getAllOrders();

	public List<OrderDetailsInfo> getOrderByCustId(String custId);  
	
	public void customerAccDetails(CustomerAccountEntity accoutInfo);
}


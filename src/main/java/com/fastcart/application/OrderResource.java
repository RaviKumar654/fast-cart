package com.fastcart.application;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fastcart.application.model.CustomerAccountEntity;
import com.fastcart.application.model.OrderDetailsInfo;
import com.fastcart.application.service.FastCartOrderService;

@RestController
@RequestMapping("/orders")
public class OrderResource {
	
	@Autowired
	public FastCartOrderService service;

	/**
	 * To save all the orders
	 * @param orderDetails
	 */
	@RequestMapping(value="/orderReq", method=RequestMethod.POST)
	public void orderSave(@Valid @RequestBody OrderDetailsInfo orderDetails) {
			 service.orderDetailsSave(orderDetails); 
	}
	
	/**
	 * To get all the orders.
	 * @return
	 */
	@RequestMapping(value="getAllOrders", method=RequestMethod.GET) 
	public List<OrderDetailsInfo> getAllOrders() {
		return service.getAllOrders();
	}
	/**
	 * To get Order by customer Id.
	 * @return
	 */
	@GetMapping(value="getOrderByCustId/{id}") 
	public List<OrderDetailsInfo> getOrderByCustId(@PathVariable("id") String custId) {
		return service.getOrderByCustId(custId);
		
	}
	
	@RequestMapping(value="customerAccReq", method=RequestMethod.POST)
	public void customerAccReq(@RequestBody CustomerAccountEntity customerAccInfo ) {
		
		service.customerAccDetails(customerAccInfo);
	}
	
}


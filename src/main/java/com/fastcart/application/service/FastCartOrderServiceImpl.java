package com.fastcart.application.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fastcart.application.model.CustomerAccountEntity;
import com.fastcart.application.model.ListOfOrderDetailsInfo;
import com.fastcart.application.model.OrderDetailsInfo;
import com.fastcart.application.repository.CustomerAccoutRepository;
import com.fastcart.application.repository.OrderDetailsRepository;

@Transactional
@Service
public class FastCartOrderServiceImpl implements FastCartOrderService{

	@Autowired
	private  OrderDetailsRepository orderDetailsRepo;
	
	@Autowired
	private CustomerAccoutRepository userAccRepo;

	OrderDetailsInfo orderDetls;
	
	/**
	 * save all the orders
	 */
	@Override
	public void orderDetailsSave(OrderDetailsInfo orderDetails) {
		orderDetails.setOrderDate(new Date().toString());
		if(orderDetails.getOrderName()!=null && !orderDetails.getOrderName().isEmpty()) {
			orderDetailsRepo.save(orderDetails);
		}else {
			throw new NullPointerException("NullPointerException");
		}
	}
	
	@PostConstruct
	public void setUp(){
		orderDetailsRepo.save(new OrderDetailsInfo("ravi@nisum.com",new Date().toString(),"Mobile","12000"));
		orderDetailsRepo.save(new OrderDetailsInfo("srinu@nisum.com",new Date().toString(),"PowerBank","1000"));
	}
	
	/**
	 * To get all the orders
	 */
	@Override
	public List<OrderDetailsInfo> getAllOrders() {
		List<OrderDetailsInfo> listOfOrders=new ArrayList<OrderDetailsInfo>();
		orderDetailsRepo.findAll().forEach(orders -> listOfOrders.add(orders)); 
		return listOfOrders;
	}
	/**
	 * getOrderDetails by CustomerId
	 */
	@Override
	public List<OrderDetailsInfo> getOrderByCustId(String custId) {
		return orderDetailsRepo
				.findAll()
				.stream()
				.filter(order-> order.getCustId().equals(custId))
				.collect(Collectors.toList());
	}

	@Override
	public void customerAccDetails(CustomerAccountEntity custAccountInfo) {

		
		  List<ListOfOrderDetailsInfo> listOfOrders= new ArrayList<ListOfOrderDetailsInfo>();
		  
		  ListOfOrderDetailsInfo listOfOrdrs1=new ListOfOrderDetailsInfo();
		  listOfOrdrs1.setItemName("Mobile"); 
		  listOfOrdrs1.setDate(new Date().toString());
		  listOfOrdrs1.setCustAccountInfo(custAccountInfo); 
		  
		  ListOfOrderDetailsInfo listOfOrdrs2=new ListOfOrderDetailsInfo();
		  listOfOrdrs2.setItemName("Laptop");
		  listOfOrdrs2.setDate(new Date().toString());
		  listOfOrdrs2.setCustAccountInfo(custAccountInfo);
		  
		  ListOfOrderDetailsInfo listOfOrdrs3=new ListOfOrderDetailsInfo();
		  listOfOrdrs3.setItemName("PowerBank");
		  listOfOrdrs3.setDate(new Date().toString());
		  listOfOrdrs3.setCustAccountInfo(custAccountInfo); 
		  
		  
		  listOfOrders.add(listOfOrdrs1);
		  listOfOrders.add(listOfOrdrs2);
		  listOfOrders.add(listOfOrdrs3);
		  
		  custAccountInfo.setListOfOrdrDetails(listOfOrders);
		  
		  userAccRepo.save(custAccountInfo);
		 
	}

}

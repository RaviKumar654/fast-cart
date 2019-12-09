package com.java.example.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.java.example.model.OrderDetailsInfo;

@Repository
public class UserDetailsDao {
	
	static HashMap<Integer, OrderDetailsInfo> usersMap = new HashMap<Integer, OrderDetailsInfo>();
	
	public  UserDetailsDao() {
		
		OrderDetailsInfo user1 = new OrderDetailsInfo();
	    user1.setId(1);
	    user1.setOrderName("ravi");
	    user1.setTotalAmount("1111");
	   
	    OrderDetailsInfo user2 = new OrderDetailsInfo();
	    user2.setId(2);
	    user2.setOrderName("asdas");
	    user2.setTotalAmount("4444");
	   
	    usersMap.put(1, user1);
	    usersMap.put(2, user2);
	}
	
	public OrderDetailsInfo createUser(OrderDetailsInfo user) {
        usersMap.put(user.getId(), user);
        return usersMap.get(user.getId());
    }
    
}

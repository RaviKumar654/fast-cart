package com.fastcart.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fastcart.application.model.OrderDetailsInfo;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetailsInfo,Integer>{

}

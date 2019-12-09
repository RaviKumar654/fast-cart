package com.fastcart.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fastcart.application.model.CustomerAccountEntity;

public interface CustomerAccoutRepository extends JpaRepository<CustomerAccountEntity, String> {

}
 
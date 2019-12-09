package com.fastcart.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fastcart.application.model.ListOfOrderDetailsInfo;

@Repository
public interface ListOfOrderDetailsRepository extends JpaRepository<ListOfOrderDetailsInfo, String> {


}

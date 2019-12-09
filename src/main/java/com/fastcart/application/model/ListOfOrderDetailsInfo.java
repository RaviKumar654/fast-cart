package com.fastcart.application.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="LISTOF_ORDERS")
@SequenceGenerator(name="ORDER_SEQ_ID", initialValue=1001, allocationSize=100)
public class ListOfOrderDetailsInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORDER_SEQ_ID")
	private int orderId;
	private String itemName;
	private String date;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ACC_ID",nullable=false)
	private CustomerAccountEntity custAccountInfo;

	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Column(name="custAccountInfo")
	public CustomerAccountEntity getCustAccountInfo() {
		return custAccountInfo;
	}
	public void setCustAccountInfo(CustomerAccountEntity custAccountInfo) {
		this.custAccountInfo = custAccountInfo;
	}
}

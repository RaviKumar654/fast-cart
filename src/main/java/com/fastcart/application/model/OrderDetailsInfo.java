package com.fastcart.application.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_DETAILS")
@SequenceGenerator(name="SEQ_ID", initialValue=1001, allocationSize=100)
public class OrderDetailsInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID")
	private int orderId;
	private String custId;
	private String orderDate;
	private String orderName;
	private String totalAmount;

	public OrderDetailsInfo(String custId, String orderDate, String orderName, String totalAmount) {

		this.custId=custId;
		this.orderDate=orderDate;
		this.orderName=orderName;
		this.totalAmount=totalAmount;
	}
	
	public OrderDetailsInfo() {
		System.out.println("default constructor");
	}
	
	 @Override
	    public String toString() {
	        return "OrderDetailsInfo{" +
	                "custId='" + custId + '\'' +
	                ", orderDate='" + orderDate + '\'' +
	                ", orderName=" + orderName +
	                ", totalAmount=" + totalAmount +
	                '}';
	    }
	 
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}

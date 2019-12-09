package com.fastcart.application.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER_ACCOUNT")
public class CustomerAccountEntity {
	
	@Id
	private String custId;
	private String custName;
	private String custPhone;
	private String custAddress;
	
	@OneToMany(mappedBy = "custAccountInfo", cascade =CascadeType.ALL)
	private List<ListOfOrderDetailsInfo> listOfOrdrDetails;

	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public List<ListOfOrderDetailsInfo> getListOfOrdrDetails() {
		return listOfOrdrDetails;
	}
	public void setListOfOrdrDetails(List<ListOfOrderDetailsInfo> listOfOrdrDetails) {
		this.listOfOrdrDetails = listOfOrdrDetails;
	}
}

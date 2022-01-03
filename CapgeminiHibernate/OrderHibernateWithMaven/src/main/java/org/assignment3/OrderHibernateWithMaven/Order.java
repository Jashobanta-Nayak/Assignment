package org.assignment3.OrderHibernateWithMaven;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order_details")
public class Order {

	
	//ID, Name,desc 
	@Id
	private int orderId;
	private String orderName;
	private String orderDesc;
	
	//parameterized constructor
	public Order(int orderId, String orderName, String orderDesc) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderDesc = orderDesc;
	}
	//zero-parameterized constructor

	public Order() {
		super();
	}
	//Setter & Getter
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderDesc() {
		return orderDesc;
	}
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", orderDesc=" + orderDesc + "]";
	}
	
	
}

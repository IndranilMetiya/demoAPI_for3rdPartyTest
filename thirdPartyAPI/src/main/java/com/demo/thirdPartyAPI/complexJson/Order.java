package com.demo.thirdPartyAPI.complexJson;

import java.util.List;

public class Order {
    private String orderId;
    private Customer customer;
    private List<Item> items;
    private PaymentDetails paymentDetails;
    private ShippingDetails shippingDetails;
    private String orderStatus;
    private String orderDate;
    private List<TrackingInfo> trackingInfo;
    private List<Comment> comments;
    private List<Alert> alerts;
    private List<ReturnRequest> returnRequests;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	public ShippingDetails getShippingDetails() {
		return shippingDetails;
	}
	public void setShippingDetails(ShippingDetails shippingDetails) {
		this.shippingDetails = shippingDetails;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public List<TrackingInfo> getTrackingInfo() {
		return trackingInfo;
	}
	public void setTrackingInfo(List<TrackingInfo> trackingInfo) {
		this.trackingInfo = trackingInfo;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public List<Alert> getAlerts() {
		return alerts;
	}
	public void setAlerts(List<Alert> alerts) {
		this.alerts = alerts;
	}
	public List<ReturnRequest> getReturnRequests() {
		return returnRequests;
	}
	public void setReturnRequests(List<ReturnRequest> returnRequests) {
		this.returnRequests = returnRequests;
	}
    
    

}


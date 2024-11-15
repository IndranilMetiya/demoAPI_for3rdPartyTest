package com.demo.thirdPartyAPI.complexJson;

import java.util.List;

public class ShippingDetails {
    private Address address;
    private String method;
    private String estimatedDelivery;
    private List<ShippingHistory> shippingHistory;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getEstimatedDelivery() {
		return estimatedDelivery;
	}
	public void setEstimatedDelivery(String estimatedDelivery) {
		this.estimatedDelivery = estimatedDelivery;
	}
	public List<ShippingHistory> getShippingHistory() {
		return shippingHistory;
	}
	public void setShippingHistory(List<ShippingHistory> shippingHistory) {
		this.shippingHistory = shippingHistory;
	}

    // Getters and Setterss
}
	
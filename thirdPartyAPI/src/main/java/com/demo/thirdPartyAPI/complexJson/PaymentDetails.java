package com.demo.thirdPartyAPI.complexJson;

import java.util.List;

public class PaymentDetails {
    private String method;
    private String transactionId;
    private double amount;
    private String status;
    private Address billingAddress;
    private List<PaymentHistory> paymentHistory;
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public List<PaymentHistory> getPaymentHistory() {
		return paymentHistory;
	}
	public void setPaymentHistory(List<PaymentHistory> paymentHistory) {
		this.paymentHistory = paymentHistory;
	}
    
    

}


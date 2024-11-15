package com.demo.thirdPartyAPI.cmplexJsonfiller;

import java.util.ArrayList;
import java.util.List;

import com.demo.thirdPartyAPI.complexJson.Address;
import com.demo.thirdPartyAPI.complexJson.Alert;
import com.demo.thirdPartyAPI.complexJson.Comment;
import com.demo.thirdPartyAPI.complexJson.ContactDetails;
import com.demo.thirdPartyAPI.complexJson.Customer;
import com.demo.thirdPartyAPI.complexJson.Item;
import com.demo.thirdPartyAPI.complexJson.Membership;
import com.demo.thirdPartyAPI.complexJson.Order;
import com.demo.thirdPartyAPI.complexJson.PaymentDetails;
import com.demo.thirdPartyAPI.complexJson.PaymentHistory;
import com.demo.thirdPartyAPI.complexJson.ReturnRequest;
import com.demo.thirdPartyAPI.complexJson.Review;
import com.demo.thirdPartyAPI.complexJson.Reward;
import com.demo.thirdPartyAPI.complexJson.ShippingDetails;
import com.demo.thirdPartyAPI.complexJson.ShippingHistory;
import com.demo.thirdPartyAPI.complexJson.Specifications;
import com.demo.thirdPartyAPI.complexJson.TrackingInfo;

public class OrderSetup {

    public  Order createOrder() {
        // Create Order
        Order order = new Order();
        order.setOrderId("12345");
        order.setOrderDate("2024-11-10");
        order.setOrderStatus("Processing");

        // Setting up Customer
        Customer customer = new Customer();
        customer.setId("c987");
        customer.setName("John Doe");

        ContactDetails contactDetails = new ContactDetails();
        contactDetails.setEmail("john.doe@example.com");
        contactDetails.setPhone("+1234567890");

        Address address = new Address();
        address.setStreet("123 Main St");
        address.setCity("Springfield");
        address.setState("IL");
        address.setZip("62701");
        address.setCountry("USA");

        contactDetails.setAddress(address);
        customer.setContactDetails(contactDetails);
        customer.setLoyaltyPoints(320);
        customer.setActive(true);

        // Setting up Membership and Rewards
        Membership membership = new Membership();
        membership.setLevel("Gold");
        membership.setValidUntil("2025-12-31");

        List<Reward> rewards = new ArrayList<>();
        Reward reward1 = new Reward();
        reward1.setRewardId("R001");
        reward1.setType("Discount");
        reward1.setValue(10);
        reward1.setValidity("2024-11-30");

        Reward reward2 = new Reward();
        reward2.setRewardId("R002");
        reward2.setType("Free Shipping");
        reward2.setValue("Unlimited");
        reward2.setValidity("2024-12-31");

        rewards.add(reward1);
        rewards.add(reward2);

        membership.setRewards(rewards);
        customer.setMembership(membership);
        order.setCustomer(customer);

        // Setting up Items
        List<Item> items = new ArrayList<>();

        Item item1 = new Item();
        item1.setItemId("p123");
        item1.setName("Laptop");
        item1.setQuantity(1);
        item1.setPrice(899.99);

        Specifications specs1 = new Specifications();
        specs1.setBrand("BrandX");
        specs1.setProcessor("Intel Core i7");
        specs1.setRam("16GB");
        specs1.setStorage("512GB SSD");
        item1.setSpecifications(specs1);

        List<Review> reviews1 = new ArrayList<>();
        Review review1 = new Review();
        review1.setReviewer("Alice");
        review1.setRating(5);
        review1.setComment("Great laptop for the price.");
        review1.setDate("2024-11-05");

        Review review2 = new Review();
        review2.setReviewer("Bob");
        review2.setRating(4);
        review2.setComment("Good performance but slightly heavy.");
        review2.setDate("2024-11-06");

        reviews1.add(review1);
        reviews1.add(review2);
        item1.setReviews(reviews1);

        items.add(item1);

        Item item2 = new Item();
        item2.setItemId("p124");
        item2.setName("Smartphone");
        item2.setQuantity(2);
        item2.setPrice(499.99);

        Specifications specs2 = new Specifications();
        specs2.setBrand("BrandY");
        specs2.setProcessor("Snapdragon 888");
        specs2.setRam("8GB");
        specs2.setStorage("128GB");
        item2.setSpecifications(specs2);

        List<Review> reviews2 = new ArrayList<>();
        Review review3 = new Review();
        review3.setReviewer("Charlie");
        review3.setRating(5);
        review3.setComment("Best value for the price!");
        review3.setDate("2024-11-07");

        reviews2.add(review3);
        item2.setReviews(reviews2);

        items.add(item2);

        // Set Items in Order
        order.setItems(items);

        // Setting up PaymentDetails
        PaymentDetails paymentDetails = new PaymentDetails();
        paymentDetails.setMethod("Credit Card");
        paymentDetails.setTransactionId("txn987654321");
        paymentDetails.setAmount(1899.97);
        paymentDetails.setStatus("Success");

        Address billingAddress = new Address();
        billingAddress.setStreet("123 Billing St");
        billingAddress.setCity("Chicago");
        billingAddress.setState("IL");
        billingAddress.setZip("60606");
        billingAddress.setCountry("USA");

        paymentDetails.setBillingAddress(billingAddress);

        List<PaymentHistory> paymentHistory = new ArrayList<>();
        PaymentHistory history1 = new PaymentHistory();
        history1.setTransactionId("txn987654321");
        history1.setDate("2024-11-10");
        history1.setAmount(1899.97);
        history1.setStatus("Success");

        PaymentHistory history2 = new PaymentHistory();
        history2.setTransactionId("txn987654320");
        history2.setDate("2024-11-09");
        history2.setAmount(200.00);
        history2.setStatus("Failed");

        paymentHistory.add(history1);
        paymentHistory.add(history2);

        paymentDetails.setPaymentHistory(paymentHistory);
        order.setPaymentDetails(paymentDetails);

        // Setting up ShippingDetails
        ShippingDetails shippingDetails = new ShippingDetails();
        Address shippingAddress = new Address();
        shippingAddress.setStreet("456 Shipping St");
        shippingAddress.setCity("Chicago");
        shippingAddress.setState("IL");
        shippingAddress.setZip("60606");
        shippingAddress.setCountry("USA");

        shippingDetails.setAddress(shippingAddress);
        shippingDetails.setMethod("Standard Shipping");
        shippingDetails.setEstimatedDelivery("2024-11-15");

        List<ShippingHistory> shippingHistory = new ArrayList<>();
        ShippingHistory history3 = new ShippingHistory();
        history3.setCarrier("FedEx");
        history3.setTrackingNumber("1234567890");
        history3.setStatus("In Transit");
        history3.setEstimatedArrival("2024-11-14");

        shippingHistory.add(history3);
        shippingDetails.setShippingHistory(shippingHistory);

        order.setShippingDetails(shippingDetails);

        // Setting up TrackingInfo
        List<TrackingInfo> trackingInfo = new ArrayList<>();
        TrackingInfo tracking = new TrackingInfo();
        tracking.setCarrier("FedEx");
        tracking.setTrackingNumber("1234567890");
        tracking.setStatus("In Transit");
        tracking.setEstimatedArrival("2024-11-14");

        trackingInfo.add(tracking);
        order.setTrackingInfo(trackingInfo);

        // Setting up Comments
        List<Comment> comments = new ArrayList<>();
        Comment comment1 = new Comment();
        comment1.setUserId("user1");
        comment1.setMessage("Great product!");
        comment1.setTimestamp("2024-11-10T10:00:00");

        Comment comment2 = new Comment();
        comment2.setUserId("user2");
        comment2.setMessage("Would recommend.");
        comment2.setTimestamp("2024-11-11T12:30:00");

        comments.add(comment1);
        comments.add(comment2);
        order.setComments(comments);

        // Setting up Alerts
        List<Alert> alerts = new ArrayList<>();
        Alert alert1 = new Alert();
        alert1.setAlertId("alert1");
        alert1.setMessage("Payment successful.");
        alert1.setDate("2024-11-10");

        Alert alert2 = new Alert();
        alert2.setAlertId("alert2");
        alert2.setMessage("Shipment in transit.");
        alert2.setDate("2024-11-11");

        alerts.add(alert1);
        alerts.add(alert2);
        order.setAlerts(alerts);

        // Setting up ReturnRequests
        List<ReturnRequest> returnRequests = new ArrayList<>();
        ReturnRequest returnRequest1 = new ReturnRequest();
        returnRequest1.setReturnId("r1");
        returnRequest1.setReason("Defective item");
        returnRequest1.setStatus("Pending");
        returnRequest1.setRequestedDate("2024-11-12");

        returnRequests.add(returnRequest1);
        order.setReturnRequests(returnRequests);

        return order;
    }
}

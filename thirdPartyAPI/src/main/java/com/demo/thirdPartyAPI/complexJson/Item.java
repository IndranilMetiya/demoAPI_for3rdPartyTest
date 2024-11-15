	package com.demo.thirdPartyAPI.complexJson;

	import java.util.List;

	public class Item {
	    private String itemId;
	    private String name;
	    private int quantity;
	    private double price;
	    private Specifications specifications;
	    private List<Review> reviews;
		public String getItemId() {
			return itemId;
		}
		public void setItemId(String itemId) {
			this.itemId = itemId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public Specifications getSpecifications() {
			return specifications;
		}
		public void setSpecifications(Specifications specifications) {
			this.specifications = specifications;
		}
		public List<Review> getReviews() {
			return reviews;
		}
		public void setReviews(List<Review> reviews) {
			this.reviews = reviews;
		}
	    
	    

	}


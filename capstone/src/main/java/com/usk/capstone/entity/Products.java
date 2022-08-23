package com.usk.capstone.entity;

import javax.persistence.Column;

public class Products {
	
	@Column(name = "product_id")
	private int productId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "prod_desc")
	private String productDescription;
	
	@Column(name = "prod_category")
	private String productCategory;
	
	@Column(name = "prod_upc")
	private int productUPC;
	
	@Column(name = "prod_count")
	private int productCount;
	
	@Column(name = "prod_image")
	private String productImage;
	
	@Column(name = "product_price")
	private float productPrice;
	
	@Column(name = "production_status")
	private Boolean productionStatus;
	
	public Products(int prodId, String prodName, String prodDesc, String prodCategory, String prodUPC, int prodCount,
			String prodImage, float prodPrice, Boolean prodStatus) {
		// TODO Auto-generated constructor stub
	}

	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getProductName(String productName) {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductDescription(String productDescription) {
		return productDescription;
	}
	
	public void setProductDescription (String productDescription) {
		this.productDescription = productDescription;
	}
	
	public String getProductCategory(String productCategory) {
		return productCategory;
	}
	
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	
	public int getProductUPC(int productUPC) {
		return productUPC;
	}
	
	public void setProductUPC(int productUPC) {
		this.productUPC = productUPC;
	}
	
	public int getProductCount(int productCount) {
		return productCount;
	}
	
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	
	public float getProductPrice(int productPrice) {
		return productPrice;
	}
	
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	public Boolean isProductionStatus() {
		return productionStatus;
	}
	
	public void setProductionStatus(boolean productionStatus) {
		this.productionStatus = productionStatus;
	}
	
	public String getProductImage(String productImage) {
		return productImage;
	}
	
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
}

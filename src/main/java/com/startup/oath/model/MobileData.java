package com.startup.oath.model;

import java.util.UUID;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("mobile")
public class MobileData {
	
	private static final long serialVersionUID = 1L;

       @PrimaryKey
       private UUID id;
       private String modelName;
       private String amount;
       private String currency;
       private String flipkartSellingPrice;
       private String flipkartSpecialPrice;
       private String size;
       private String color;
       private String storage;
       private String sizeUnit;
	   
	public MobileData() {
	    }
	public MobileData(String modelName) {
		this.modelName = modelName;
    }
	  
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getFlipkartSellingPrice() {
		return flipkartSellingPrice;
	}
	public void setFlipkartSellingPrice(String flipkartSellingPrice) {
		this.flipkartSellingPrice = flipkartSellingPrice;
	}
	public String getFlipkartSpecialPrice() {
		return flipkartSpecialPrice;
	}
	public void setFlipkartSpecialPrice(String flipkartSpecialPrice) {
		this.flipkartSpecialPrice = flipkartSpecialPrice;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public String getSizeUnit() {
		return sizeUnit;
	}
	public void setSizeUnit(String sizeUnit) {
		this.sizeUnit = sizeUnit;
	}
	public String getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}
	String displaySize;
	   
	  
	@Override
	public String toString() {
		return "MobileData [amount=" + amount + ", currency=" + currency + ", flipkartSellingPrice=" + flipkartSellingPrice
				+ ", flipkartSpecialPrice=" + flipkartSpecialPrice + ", size=" + size + ", color=" + color + ", storage="
				+ storage + ", sizeUnit=" + sizeUnit + ", displaySize=" + displaySize + "]";
	}

}

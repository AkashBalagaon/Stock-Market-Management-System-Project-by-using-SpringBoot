package com.akash.spring_org_project.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Stock {
	
	@Id
	private String ticker;
	private String companyName;
	private double price;
	private double changes;
	private double quantity;
	
	public String getTicker() {
		return ticker;
	}
	public String getCompanyName() {
		return companyName;
	}
	public double getPrice() {
		return price;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getChanges() {
		return changes;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setChanges(double changes) {
		this.changes = changes;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	
}

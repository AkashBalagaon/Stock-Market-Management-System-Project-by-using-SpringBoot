package com.akash.spring_org_project.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class AdminData {
	
	@Id
	private final int id=1;
	private double totalPlatformFee;
	private double platformFeePercentage;
	private double totalStocksBought;
	private double totalStocksSold;
	private double totalTransaction;
	
	public int getId() {
		return id;
	}
	public double getTotalPlatformFee() {
		return totalPlatformFee;
	}
	public double getPlatformFeePercentage() {
		return platformFeePercentage;
	}
	public double getTotalStocksBought() {
		return totalStocksBought;
	}
	public double getTotalStocksSold() {
		return totalStocksSold;
	}
	public double getTotalTransaction() {
		return totalTransaction;
	}
	public void setTotalPlatformFee(double totalPlatformFee) {
		this.totalPlatformFee = totalPlatformFee;
	}
	public void setPlatformFeePercentage(double platformFeePercentage) {
		this.platformFeePercentage = platformFeePercentage;
	}
	public void setTotalStocksBought(double totalStocksBought) {
		this.totalStocksBought = totalStocksBought;
	}
	public void setTotalStocksSold(double totalStocksSold) {
		this.totalStocksSold = totalStocksSold;
	}
	public void setTotalTransaction(double totalTransaction) {
		this.totalTransaction = totalTransaction;
	}
	
	

}

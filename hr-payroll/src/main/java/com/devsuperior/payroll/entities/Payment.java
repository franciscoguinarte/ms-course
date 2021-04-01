package com.devsuperior.payroll.entities;

import java.io.Serializable;

public class Payment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private double dailyIncome;
	private Integer days;
	
	public Payment() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Payment(String name, double dailyIncome, Integer days) {
		super();
		this.name = name;
		this.dailyIncome = dailyIncome;
		this.days = days;
	}

	public double getTotal() {
		
		return this.dailyIncome * this.days;
	}

	
}

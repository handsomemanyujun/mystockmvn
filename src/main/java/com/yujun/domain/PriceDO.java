package com.yujun.domain;

import java.text.DateFormat;
import java.util.Date;

import com.yujun.util.DateUtil;
import com.yujun.util.Money;

public class PriceDO {
	private Date date;
	private Money  openPrice;
	private Money highestPrice;
	private Money LowestPrice;
	private Money closingPrice;
	public Date getDate() {
		return date;
	}
	public String getDateStr() {
		return DateUtil.dateFormat.format(date);
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Money getOpenPrice() {
		return openPrice;
	}
	public void setOpenPrice(Money openPrice) {
		this.openPrice = openPrice;
	}
	public Money getHighestPrice() {
		return highestPrice;
	}
	public void setHighestPrice(Money highestPrice) {
		this.highestPrice = highestPrice;
	}
	public Money getLowestPrice() {
		return LowestPrice;
	}
	public void setLowestPrice(Money lowestPrice) {
		LowestPrice = lowestPrice;
	}
	public Money getClosingPrice() {
		return closingPrice;
	}
	public void setClosingPrice(Money closingPrice) {
		this.closingPrice = closingPrice;
	}
	
	public String toString() {
		DateFormat format =  new java.text.SimpleDateFormat("yyyyMMdd");
		return "date : " + format.format(date) + ",openPrice : " + openPrice + ",highestPrice : " + highestPrice
				+ ",LowestPrice : " + LowestPrice + ",closingPrice : " + closingPrice;
	}
}

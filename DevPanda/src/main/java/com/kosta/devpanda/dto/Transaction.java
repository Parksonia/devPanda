package com.kosta.devpanda.dto;

public class Transaction {
	
	private Integer transactionNum;   //auto_increment
	private String sellerId;		  
	private Integer auctionNum;       
	private Integer bidNum;           
	private String buyerId;           
	private String date; 			  //낙찰일
	private Integer price; 			  //낙찰액
	private String state; 			  //i:ing f:finished
	private String memType;    		  //person or company
	
	//TO-DO
	Auction auction;
	Person person;
	Company company;
	
	
	public Integer getTransactionNum() {
		return transactionNum;
	}
	public void setTransactionNum(Integer transactionNum) {
		this.transactionNum = transactionNum;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public Integer getAuctionNum() {
		return auctionNum;
	}
	public void setAuctionNum(Integer auctionNum) {
		this.auctionNum = auctionNum;
	}
	public Integer getBidNum() {
		return bidNum;
	}
	public void setBidNum(Integer bidNum) {
		this.bidNum = bidNum;
	}
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMemType() {
		return memType;
	}
	public void setMemType(String memType) {
		this.memType = memType;
	}
	
	public Auction getAuction() {
		return auction;
	}
	public void setAuction(Auction auction) {
		this.auction = auction;
	}
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	
	public Transaction(Integer transactionNum, String sellerId, Integer auctionNum, Integer bidNum, String buyerId,
			String date, Integer price, String state, String memType, Auction auction, Person person, Company company) {
		super();
		this.transactionNum = transactionNum;
		this.sellerId = sellerId;
		this.auctionNum = auctionNum;
		this.bidNum = bidNum;
		this.buyerId = buyerId;
		this.date = date;
		this.price = price;
		this.state = state;
		this.memType = memType;
		this.auction = auction;
		this.person = person;
		this.company = company;
	}
	public Transaction() {
		super();
	}
	
	@Override
	public String toString() {
		return "Transaction [transactionNum=" + transactionNum + ", sellerId=" + sellerId + ", auctionNum=" + auctionNum
				+ ", bidNum=" + bidNum + ", buyerId=" + buyerId + ", date=" + date + ", price=" + price + ", state="
				+ state + ", memType=" + memType + "]";
	}	
}

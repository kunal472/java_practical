package com.bank;

public record User(int accNo,long mobileNo , String name) {

public User(int accNo, long mobileNo, String  name) {
	this.accNo = accNo;
	this.mobileNo = mobileNo;
	this.name = name;
}
}
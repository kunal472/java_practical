package com.bank;

import java.util.Random;

public class Bank {
	Random rad = new Random(5000);
	private User user;
	
	public Bank(User user) {
		this.user=user;
	}
	
	public void fundTransfer(int senderAccNo, int receiverAccNo, float amt){
		System.out.println("Welcome to Net Banking");
		System.out.println("Sender Account No: "+senderAccNo);
		System.out.println("Receiver Account No: "+receiverAccNo);
		System.out.println("Transfer Amount: "+amt);
		System.out.println("Fund Transfer Successfully with net banking....transx id: "+rad.nextInt());
	}
	
	public void fundTransfer(int ddNo,float amt ,int receiverAccNo){
		System.out.println("Welcome to DD Banking");
		System.out.println("DD  No: "+ddNo);
		System.out.println("Receiver Account No: "+receiverAccNo);
		System.out.println("Transfer Amount: "+amt);
		System.out.println("Fund Transfer Successfully with DD banking....transx id: "+rad.nextInt());
	};
	
	public void fundTransfer(int chequeNo, String name, float amt){
		System.out.println("Welcome to Cheque Banking");
		System.out.println("Cheque Account No: "+chequeNo);
		System.out.println("Receiver name: "+name);
		System.out.println("Transfer Amount: "+amt);
		System.out.println("Fund Transfer Successfully with Cheque banking....transx id: "+rad.nextInt());
	};
	
	public void fundTransfer(long mobileNo, float amt){
		System.out.println("Welcome to UPI Banking");
		System.out.println("Mobile No: "+mobileNo);
//		System.out.println("Receiver name: "+name);
		System.out.println("Transfer Amount: "+amt);
		System.out.println("Fund Transfer Successfully with UPI banking....transx id: "+rad.nextInt());
	};
}
	

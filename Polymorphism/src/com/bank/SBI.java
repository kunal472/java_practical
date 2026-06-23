package com.bank;

import java.util.Scanner;

public class SBI {
	void main() {
		Scanner sc = new Scanner(System.in);
		int choice =0;
		Bank bank = new Bank(new User(100001,1234567890,"abcd"));
		do {
			choice=1;
			System.out.println("Welcome to SBI Banking we have below options");
			System.out.println("DDBank-->DDBanking");
			System.out.println("NetBank-->NetBanking");
			System.out.println("ChequeBank-->ChequeBanking");
			System.out.println("MobileBank-->MobileBanking");
			System.out.println("--------------");
			System.out.println("Enter yout options:");
			String ch = sc.next();
			
			switch(ch) {
			case"DDBank":{
				System.out.println("Enter DD number:");
				int ddNo=sc.nextInt();
				System.out.println("Enter Receiver Account number:");
				int receiverAccNo=sc.nextInt();
				System.out.println("Enter the amount: ");
				float amt =sc.nextFloat();
				bank.fundTransfer(ddNo, amt, receiverAccNo);
			}
			case"NetBank":{
				System.out.println("Enter sender Account number:");
				int senderAccNo=sc.nextInt();
				System.out.println("Enter Receiver Account number:");
				int receiverAccNo=sc.nextInt();
				System.out.println("Enter the amount: ");
				float amt =sc.nextFloat();
				bank.fundTransfer(senderAccNo,receiverAccNo,amt);
			}
			case"ChequeBank":{
				System.out.println("Enter Cheque number:");
				int chequeNo=sc.nextInt();
				System.out.println("Enter Receiver Account Name:");
				String name=sc.next();
				System.out.println("Enter the amount: ");
				float amt =sc.nextFloat();
				bank.fundTransfer(chequeNo, name, amt);
			}
			case"MobileBank":{
				System.out.println("Enter receiver mobile number:");
				long MobileNo=sc.nextInt();
				System.out.println("Enter the amount: ");
				float amt =sc.nextFloat();
				bank.fundTransfer(MobileNo, amt);
			}
			case"END":{
				choice=0;
			}
//			default:{
//				System.out.println("please give valid keywords");
//			}
			}
		}
		while(choice==1);
		sc.close();
	}
}

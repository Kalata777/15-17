package ggg;

import java.util.Scanner;

public class ATMt {
	static Account[] accounts= new Account[10];
	static int id=-9;
	static Scanner sc= new Scanner(System.in);
	
	public static void kalata1(int p) {
		int k;
switch(p){
	
		case 1:
			System.out.println("Balance:"+accounts[id].getbalance());
			id=-9;
			break;
		case 2:
			System.out.println("How much will you withdraw?");
			k = sc.nextInt();
	      if(k<=accounts[id].getbalance()) {
			accounts[id].withdraw(k);
			id=-9;
	      }else {
	    	  System.out.println("Not enough balance");
	    	  kalata1(2);
	      }
			break;
		case 3:
			System.out.println("How much will you deposit?");
			accounts[id].deposit(sc.nextDouble());
			id=-9;
			break;
		case 4:
			id=-9;
			break;
		}
while(id<0||id>9) {
	System.out.println("Please,enter an id:");	
id=sc.nextInt();
id--;
}
kalata();
	}
	public static void kalata() {
		System.out.println("Main Menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
		
		kalata1(sc.nextInt());
		
	}
	public static void main(String[] args) {
	
	 
	
	for(int i=0;i<10;i++) {
		accounts[i]=new Account();
		accounts[i].setbalance(100.00);
		accounts[i].setid(i);
	}
	while(id<0||id>9) {
		System.out.println("Please,enter an id:");	
	id=sc.nextInt();
	id--;
	}
	kalata();
	
	
	}

}

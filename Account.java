package ggg;

import java.util.Date;
public class Account {
private int id=0;
private double balance=0, yearInterestRate=0;	
private Date dateCreated=new Date();
Account(){}
 int getid() {
	return this.id;
}
 double getbalance() {
	return this.balance;
}
 double getYIR() {
	return this.yearInterestRate/100;
}
void setid(int id) {
	this.id=id;
}
 void setbalance(double b) {
	this.balance=b;
}
 void getbalance(double b) {
	this.balance=b;
}
 void getYIR(double a) {
	this.yearInterestRate=a;
}
 double getMonthlyInterestRate() {
	return this.yearInterestRate/12;
	
}
 double getMonthlyInterest() {
	return this.balance * this.getMonthlyInterestRate();
	
}
 void withdraw(double i) {
	if(i<=this.balance) {
		this.balance-=i;
	}
}
public void deposit(double i) {
		this.balance+=i;

}
}

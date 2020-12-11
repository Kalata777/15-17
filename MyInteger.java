package ggg;

public class MyInteger {
int value;
 MyInteger(int a){
	 this.value = a;
 }
	int get() {
		return this.value;
	}
public boolean isEven() {
	 if(this.value%2==0) {
		 return true;
	 }else {
		 return false;
	 }
 }
public boolean isOdd() {
	 if(this.value%2!=0) {
		 return true;
	 }else {
		 return false;
	 }
 }
public boolean isPrime() {
	 for(int i=0;i< (int) this.value/2;i++) {
		 if(this.value%i==0) {
			 return false;
		 }
	 }
	 return true;
 }
 
 
 static boolean isEven(MyInteger M) {
	 if(M.value%2==0) {
		 return true;
	 }else {
		 return false;
	 }
 }
 static boolean isOdd(MyInteger M) {
	 if(M.value%2!=0) {
		 return true;
	 }else {
		 return false;
	 }
 }
 static boolean isPrime(MyInteger M) {
	 for(int i=0;i< (int) M.value/2;i++) {
		 if(M.value%i==0) {
			 return false;
		 }
	 }
	 return true;
 }
 boolean equals(int a) {
	 if(this.value==a) {
		 return true;
	 }else {
		 return false;
	 }
 }
 boolean equals(MyInteger M) {
	 if(M.value==this.value) {
		 return true;
	 }else {
		 return false;
	 }
 }
 static int[] parseInt(char[] M) {
	 int[] K = new int[M.length];
	for(int i=0;i<M.length;i++) {
		K[i]=(int) Character.getNumericValue(M[i]);
		
	}
	return K;
 }
 static int parseInt(String string) {
		return Integer.parseInt(string);
	}
}

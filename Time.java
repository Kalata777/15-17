package ggg;

public class Time {
int m;
int h;
int s;
public long ms;

Time(int h, int m, int s){
	this.m=m;
	this.h=h;
	this.s=s;
	this.ms=h*60*60*1000*h+60*1000*m+1000*s;

}
Time(long ms){
this.ms=ms;

}
 Time() {
    ms =  System.currentTimeMillis();
}
 int getH(){
	return this.h;
	
}
 int getM(){
	return this.m;
	
}
 int getS(){
	return this.s;
	
}private void setHour(int h) {
	this.h=h;
}
private void setMinute(int m) {
	this.m=m;
}
private void setSecond(int s) {
	this.s=s;
}
 void setTime(long milliseconds) {
	milliseconds %= 86400000;
	setHour((int) (milliseconds / 3600000));
	milliseconds %= 3600000;
	setMinute((int) (milliseconds / 60000));
	milliseconds %= 60000;
	setSecond((int) (milliseconds / 1000));
}
}

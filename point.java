package ggg;
import java.lang.Math; 
public class point {
double x;
double y;
point(){
	x=0;
	y=0;
}
	
point(double x, double y){
	this.x=x;
	this.y=y;
}
	double getX(){
		return this.x;
	}
	double getY(){
		return this.y;
	}
double distance(point M){
	
	return Math.sqrt((this.x-M.x)*(this.x-M.x) +(this.y-M.y)*(this.y-M.y));
}

double distance(int x, int y){
	
	return Math.sqrt((this.x-x)*(this.x-x) +(this.y-y)*(this.y-y));
}
static double distance(point M, point N){
	
	return Math.sqrt((N.x-M.x)*(N.x-M.x) +(N.y-M.y)*(N.y-M.y));
}
}

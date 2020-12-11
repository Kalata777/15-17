package ggg;

public class Player {
int VehicleId=-1;
int hp=100;
int speed=3;
int damage=10;
String name;
int points;
public Inventory inv =new Inventory();
point p= new point(Math.random()*134.7,Math.random()*134.7);
Player(String name){
	this.name=name;
}
public void weapons() {
if(this.inv.gun==true) {
	this.damage+=Gun.gun.damage;
}
}
public String getName() {
	return this.name;
}
public void setName(String name) {
this.name=name;
}
}

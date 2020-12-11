package ggg;

public class Vehicle {
String name;
int speed, damage, hp;
String colour;
point v= new point(Math.random()*134.7,Math.random()*134.7);
	Vehicle(String name, int speed, int damage, int hp, String colour){
		this.name=name;
		this.speed=speed;
		this.damage=damage;
		this.hp=hp;
		this.colour=colour;
	}
}

package ggg;

import java.util.Scanner;

public class Game {
boolean game= true;
	//public static void main(String[] args) {
	static	Scanner scanner = new Scanner(System.in);
	static	Map map= new Map(23);
static String name;
		static int playerNumber=0;
	//}
		static int m=0;
		public static void main(String[] args) {
			map.main();
		while(playerNumber<8) {
	System.out.println("Welcome to the game. Please enter your name...");
	name=scanner.nextLine();
	for(int i=0;i<playerNumber;i++) {
		if(name.equals(map.Players[i].getName())){
			m--;
		//	System.out.println(m);
		}
	}
	if(m<0) {
		System.out.println("Name already taken. Please write a different name");
		m=0;
		
	}else {
		map.Players[playerNumber].setName(name);
		playerNumber++;
	}
		}
		for(int i=0;i<8;i++) {
			for(int j=0;j<23;j++) {
		if(map.Players[i].p.x==map.Vehicles[j].inv.v.x&&map.Players[i].p.y==map.Vehicles[j].inv.v.y) {
			map.Players[i].VehicleId=j;
			System.out.println(map.Players[i].name + "is in Vehicle number "+j);
		}
			}
		}
	}

}


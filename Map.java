package ggg;

public class Map {
public Vehicle1[] Vehicles= new Vehicle1[23];
public Player[] Players = new Player[8];
int i;

public Map(int i) {
	this.i=i;
}

public void main() {
	for(int t=0;t<this.i;t++) {
		Vehicles[t]= new Vehicle1();
	}
	for(int t=0;t<8;t++) {
		Players[t]= new Player("");
	}
}


}


package ggg;

public class Inventory {
boolean shotgun = false, axe = false, gun = false, minigun = false, blaster = false, pulseGun = false, rocketLauncher = false, shockRifle = false;
final static int Shotgun=1, Axe=2, Gun=3, Minigun=4, Blaster=5, Pulsegun=6, RocketLauncher=7,Shockrifle=8;
Inventory(){}
public void changeSomething(int i) {
	switch(i) {
	case 1:
		this.shotgun=!this.shotgun;
		break;
	case 2:
		this.axe=!this.axe;
		break;
	case 3:
		this.gun=!this.gun;
		break;
	case 4:
		this.minigun=!this.minigun;
		break;
	case 5:
		this.blaster=!this.blaster;
		break;
	case 6:
		this.pulseGun=!this.pulseGun;
		break;
	case 7:
		this.rocketLauncher=!this.rocketLauncher;
		break;
	case 8:
		this.shockRifle=!this.shockRifle;
		break;
	}
}
}

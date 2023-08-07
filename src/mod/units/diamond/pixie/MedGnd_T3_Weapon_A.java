


public class MedGnd_T3_Weapon_A extends Weapon {
	
	//---------------------------------------------------------------//
	//  Constructor                                                  //
	//---------------------------------------------------------------//
	public MedGnd_T3_Weapon_A() {
		
		name = "critter-zone-pixie-bolt";
		reload = 27;
		cooldownTime = 18;
		shoot.shots = 1;
		inaccuracy = 0;
		recoil = 0;
		x = 6;
		y = 6;
		shootCone = 2;
		rotateSpeed = 8;
		rotate = true;
		mirror = true;
		soundPitchMin = 0.67f;
		soundPitchMax = 0.83f;
		top = false;
		shootSound = Sounds.blaster;      //Was: Vars.tree.loadSound("blasterShot");
		
		bullet = new PixieBolt_X();
		
	} //Constructor
	
} //class

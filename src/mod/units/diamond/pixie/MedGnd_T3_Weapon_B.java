package mod.units.diamond.pixie;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;

import mindustry.ai.*;
import mindustry.ai.types.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import mindustry.type.unit.*;
import mindustry.type.weapons.*;
import mindustry.world.meta.*;

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;


public class MedGnd_T3_Weapon_B extends Weapon {
	
	//---------------------------------------------------------------//
	//  Constructor                                                  //
	//---------------------------------------------------------------//
	public MedGnd_T3_Weapon_B() {
		
		name = "critter-zone-pixie-bolt";
		reload = 27;
		cooldownTime = 18;
		shoot.shots = 1;
		inaccuracy = 0;
		recoil = 0;
		x = -6;
		y = -6;
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

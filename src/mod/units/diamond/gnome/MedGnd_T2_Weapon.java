package mod.units.diamond.gnome;

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


public class MedGnd_T2_Weapon extends Weapon {
	
	//---------------------------------------------------------------//
	//  Constructor                                                  //
	//---------------------------------------------------------------//
	public MedGnd_T2_Weapon() {
		
		name = "critter-zone-gnome-beam";
		reload = 20;
		cooldownTime = 18;
		shoot.shots = 1;
		inaccuracy = 0;
		recoil = 0;
		x = 0;
		y = 0;
		shootCone = 2;
		shootY = 4;
		rotateSpeed = 360;
		rotate = true;
		
		// continuous = true;
		
		mirror = false;
		soundPitchMin = 0.67f;
		soundPitchMax = 1.83f;
		top = false;
		shootSound = Sounds.beam;        //Was: Vars.tree.loadSound("medBeam2");
		
		bullet = new MedGnd_T2_Bullet_X();
		
	} //Constructor
	
} //class

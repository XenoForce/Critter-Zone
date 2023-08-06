package mod.units.diamond.goblin;

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


public class MedGnd_T5_Weapon_C extends Weapon {
	
	//---------------------------------------------------------------//
	//  Constructor                                                  //
	//---------------------------------------------------------------//
	public MedGnd_T5_Weapon_C() {
		
		name = "critter-zone-goblin-launcher";
		reload = 72;
		cooldownTime = 18;
		shoot.shots = 1;
		shootY = 5;
		inaccuracy = 0;
		recoil = 0;
		x = 22;
		y = 0;
		shootCone = 2;
		rotateSpeed = 4;
		rotate = true;
		mirror = true;
		soundPitchMin = 0.67f;
		soundPitchMax = 0.83f;
		top = false;
		shootSound = Sounds.railgun;
		
		bullet = new GoblinTorpedo_X();
		
	} //Constructor
	
} //class

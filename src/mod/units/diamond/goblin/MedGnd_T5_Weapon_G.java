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


public class MedGnd_T5_Weapon_G extends Weapon {
	
	//---------------------------------------------------------------//
	//  Constructor                                                  //
	//---------------------------------------------------------------//
	public MedGnd_T5_Weapon_G() {
		
		name = "critter-zone-goblin-bomb";
		reload = 275;
		cooldownTime = 275;
		heatColor = Color.valueOf("EDF3A9");
		shoot.shots = 1;
		inaccuracy = 0;
		recoil = 0;
		x = 0;
		y = 0;
		shootY = 0;
		shootCone = 1;
		rotateSpeed = 3;
		ignoreRotation = true;
		rotate = true;
		mirror = false;
		soundPitchMin = 0.57f;
		soundPitchMax = 0.63f;
		top = true;
		shootSound = Sounds.explosionbig;
		
		bullet = new GoblinBomb_X();
		
	} //Constructor
	
} //class

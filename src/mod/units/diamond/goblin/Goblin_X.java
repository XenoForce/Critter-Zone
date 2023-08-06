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


public class Goblin_X extends UnitType {
	
	//---------------------------------------------------------------//
	//  Constructor                                                  //
	//---------------------------------------------------------------//
	public Goblin_X() {
		
		super("goblin-x");
		
		localizedName = "Goblin X";
		constructor = EntityMapping.map("toxopid");
		
		speed = 0.87f;
		
		boostMultiplier = 0.95f;
		drag = 0.4f;
		accel = 0.5f;
		rotateSpeed = 0.75f;
		baseRotateSpeed = 1.25f;
		buildSpeed = 6;
		buildBeamOffset = 0;
		lightRadius = 60;
		lightColor = Color.valueOf("a2f32d");
		lightOpacity = 0.9f;
		
		health = 15000;
		armor = 220;
		
		aimDst = 0;
		range = 900;
		itemCapacity = 300;
		
		legCount = 8;
		rippleScale = 2.5f;
		legLength = 80;
		legForwardScl = 0.64f;
		legExtension = 7;
		legMoveSpace = 0.9f;
		legGroupSize = 3;
		shadowElevation = 0.55f;
		legMaxLength = 2.1f;
		legSpeed = 0.15f;
		hitSize = 35;
		legSplashDamage = 100;
		legSplashRange = 25;
		faceTarget = false;
		allowLegStep = true;
		engineOffset = 5;
		engineSize = 2;
		canBoost = false;
		hovering = true;
		
		// Weapons:
		
		weapons.add( new MedGnd_T5_Weapon_G() );
		weapons.add( new MedGnd_T5_Weapon_A() );
		weapons.add( new MedGnd_T5_Weapon_B() );
		weapons.add( new MedGnd_T5_Weapon_C() );
		weapons.add( new MedGnd_T5_Weapon_D() );
		weapons.add( new MedGnd_T5_Weapon_E() );
		
	} //Constructor
	
} //class

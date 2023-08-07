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


public class Pixie_X extends UnitType {
	
	//---------------------------------------------------------------//
	//  Constructor                                                  //
	//---------------------------------------------------------------//
	public Pixie_X() {
		
		super("pixie-x");
		
		localizedName = "Pixie X";
		constructor = EntityMapping.map("toxopid");
		
		speed = 0.45f;
		boostMultiplier = 2.25f;
		drag = 0.4f;
		accel = 0.5f;
		rotateSpeed = 3.5f;
		baseRotateSpeed = 4.2f;
		buildSpeed = 2;
		buildBeamOffset = 0;
		lightRadius = 45;
		lightColor = Color.valueOf("a2f32d");
		lightOpacity = 0.9f;
		
		health = 670;
		armor = 27;
		
		aimDst = 0;
		range = 172;
		itemCapacity = 90;
		
		legCount = 6;
		legGroupSize = 4;
		legLength = 30;
		
		// legExtension = 24;
		
		legForwardScl = 0.8f;
		legMoveSpace = 0.7f;
		shadowElevation = 0.25f;
		legMaxLength = 1.85f;
		legMoveSpace = 1.2f;
		legSpeed = 0.22f;
		hitSize = 17;
		faceTarget = false;
		allowLegStep = true;
		engineOffset = 7;
		engineSize = 3;
		canBoost = false;
		hovering = true;
		
		// Weapons:
		
		weapons.add( new MedGnd_T3_Weapon_A() );
		weapons.add( new MedGnd_T3_Weapon_B() );
		
	} //Constructor
	
} //class

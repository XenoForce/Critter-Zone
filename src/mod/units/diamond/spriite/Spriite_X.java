package mod.units.diamond.spriite;

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


public class Spriite_X extends UnitType {
	
	//---------------------------------------------------------------//
	//  Constructor                                                  //
	//---------------------------------------------------------------//
	public Spriite_X() {
		
		super("spriite-x");
		
		localizedName = "Sprite X";
		constructor = EntityMapping.map("toxopid");
		
		// Note: Internally named "spriite" as a variable conflict countermeasure.
		
		description = "";
		
		speed = 0.7f;
		
		boostMultiplier = 1.25f;
		drag = 0.4f;
		accel = 0.5f;
		rotateSpeed = 3.5f;
		baseRotateSpeed = 2.5f;
		lightRadius = 15;
		lightColor = Color.valueOf("a2f32d");
		lightOpacity = 0.9f;
		
		health = 100;
		armor = 9;
		
		range = 74;
		itemCapacity = 30;
		
		legCount = 4;
		legGroupSize = 3;
		legMoveSpace = 2.7f;
		legLength = 14;
		legForwardScl = 0.8f;
		legExtension = 0.6f;
		shadowElevation = 0.15f;
		legMaxLength = 1.1f;
		legSpeed = 0.33f;
		
		hitSize = 9;
		faceTarget = false;
		allowLegStep = true;
		engineOffset = 5;
		engineSize = 2;
		canBoost = false;
		hovering = true;
		
		// Weapons:
		
		weapons.add( new MedGnd_T1_Weapon() );
		
	} //Constructor
	
} //class

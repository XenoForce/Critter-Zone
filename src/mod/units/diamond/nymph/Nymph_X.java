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


public class Nymph_X extends UnitType {
	
	//---------------------------------------------------------------//
	//  Constructor                                                  //
	//---------------------------------------------------------------//
	public Nymph_X() {
		
		super("nymph-x");
		
		localizedName = "Nymph X";
		constructor = EntityMapping.map("toxopid");
		
		speed = 0.67f;
		
		boostMultiplier = 1.25f;
		drag = 0.4f;
		accel = 0.5f;
		rotateSpeed = 3.5f;
		baseRotateSpeed = 2.5f;
		buildSpeed = 4;
		buildBeamOffset = 0;
		lightRadius = 60;
		lightColor = Color.valueOf("a2f32d");
		lightOpacity = 0.9f;
		
		health = 8000;
		armor = 36;
		
		aimDst = 0;
		range = 80;
		itemCapacity = 150;
		rippleScale = 1.25f;
		legCount = 4;
		legForwardScl = 0.44f;
		legGroupSize = 2;
		legLength = 50;
		
		// legExtension = 40;
		
		legMoveSpace = 0.7f;
		shadowElevation = 0.35f;
		legSplashDamage = 60;
		legSplashRange = 6.25f;
		legMaxLength = 1.48f;
		legSpeed = 0.4f;
		hitSize = 26;
		faceTarget = false;
		targetAir = false;
		allowLegStep = true;
		engineOffset = 5;
		engineSize = 2;
		canBoost = false;
		hovering = true;
		
		// Weapons:
		
		
		
		
	} //Constructor
	
} //class

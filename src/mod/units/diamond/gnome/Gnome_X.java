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


public class Gnome_X extends UnitType {
	
	//---------------------------------------------------------------//
	//  Constructor                                                  //
	//---------------------------------------------------------------//
	public Gnome_X() {
		
		super("gnome-x");
		
		localizedName = "Gnome X";
		constructor = EntityMapping.map("toxopid");
		
		description = "";
		
		speed = 0.55f;
		
		boostMultiplier = 1.25f;
		drag = 0.4f;
		accel = 0.5f;
		rotateSpeed = 3.5f;
		baseRotateSpeed = 4.2f;
		buildSpeed = 1;
		buildBeamOffset = 0;
		lightRadius = 30;
		lightColor = Color.valueOf("a2f32d");
		lightOpacity = 0.9f;
		
		health = 250;
		armor = 18;
		
		range = 144;
		itemCapacity = 60;
		
		legCount = 4;
		legGroupSize = 2;
		legLength = 24;
		legForwardScl = 0.7f;
		legMoveSpace = 1.7f;
		shadowElevation = 0.21f;
		legMaxLength = 1.2f;
		legSpeed = 0.24f;
		
		hitSize = 14;
		faceTarget = false;
		allowLegStep = true;
		engineOffset = 7;
		engineSize = 3;
		canBoost = false;
		hovering = true;
		
		// Weapons:
		
		weapons.add( new MedGnd_T2_Weapon() );
		
	} //Constructor
	
} //class

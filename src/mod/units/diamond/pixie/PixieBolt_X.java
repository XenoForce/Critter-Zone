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


public class PixieBolt_X extends BasicBulletType {
	
	//---------------------------------------------------------------//
	//  Constructor                                                  //
	//---------------------------------------------------------------//
	public PixieBolt_X() {
		
		lifetime = 50;
		damage = 30;
		buildingDamageMultiplier = 0.5f;
		width = 8;
		height = 8;
		lightRadius = 8;
		lightOpacity = 1.15f;
		shrinkY = 0;
		shrinkX = 0;
		
		despawnEffect = Fx.heal;
		hitEffect     = Fx.smeltsmoke;
		trailEffect   = Fx.artilleryTrail;        //Was: pixieBoltTrail;
		shootEffect   = Fx.shootHeal;
		
		speed = 4;
		
		trailChance = 1;
		
		frontColor = Color.valueOf("EDF3A9");
		hitColor   = Color.valueOf("99dd55");
		backColor  = Color.valueOf("aaee77");
		lightColor = Color.valueOf("aaff77");
		
		pierce = true;
		pierceBuilding = true;
		reflectable = false;
		
		// hittable = false;
		// absorbable = false;
		// hitSound = Vars.tree.loadSound("tempestShockBullet");
		
		sprite = "circle-bullet";      //Was: "critter-zone-diamondbullet";
		
	} //Constructor
	
} //class

/*
	update(b) {
		this.super$update(b);
		Units.nearby(b.team, b.x, b.y, 8, cons(unit => {
			if(unit.healthf() < 1 && unit != b.owner && !unit.dead){
				unit.health += (1.0 + 7.0 * (1 - (unit.dst(b) / 8)));
				unit.clampHealth();
				if (unit.healthf() == 1){
					Fx.healWaveDynamic.at(unit.x, unit.y, unit.hitSize);
				}
			}
		}));
	}
*/

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


public class GoblinBomb_X extends ArtilleryBulletType {
	
	//---------------------------------------------------------------//
	//  Constructor                                                  //
	//---------------------------------------------------------------//
	public GoblinBomb_X() {
		
		lifetime = 200;
		damage = 300;
		splashDamage = 250;
		splashDamageRadius = 200;
		buildingDamageMultiplier = 0.5f;
		width = 20;
		height = 20;
		lightRadius = 17;
		lightOpacity = 1.15f;
		shrinkY = 0;
		shrinkX = 0.75f;
		
		despawnEffect = Fx.greenBomb;
		
		hitEffect = Fx.flakExplosion;      //Was: goblinBombExplosion;
		
		hitSound = Sounds.plasmaboom;      //Was: Vars.tree.loadSound("goblinPlasmaBoom");
		
		trailEffect = Fx.disperseTrail;    //Was: goblinBombTrail;
		
		shootEffect = Fx.healWave;
		smokeEffect = Fx.shootBigSmoke;
		
		speed = 3;
		
		// collidesAir = true;
		
		reflectable = false;
		trailChance = 1;
		
		frontColor = Color.valueOf("EDF3A9");
		hitColor   = Color.valueOf("66dd88");
		backColor  = Color.valueOf("44ee77");
		lightColor = Color.valueOf("aaff77");
		
		sprite = "critter-zone-diamondbullet";
		
	} //Constructor
	
} //class

/*
	update(b) {
		var airSlope = 0.5 - Math.abs(b.fin() - 0.5);
		var groundSlope = Math.abs(b.fin() - 0.5);
		Units.nearby(b.team, b.x, b.y, 15, cons(unit => {
			if(unit.healthf() < 1 && unit != b.owner && !unit.dead){
				unit.health += ((unit.isFlying() ? airSlope : groundSlope) * Math.max(0, (8.75 * (1 - (unit.dst(b) / 15)))));
				unit.clampHealth();
				if (unit.healthf() == 1){
					Fx.healWaveDynamic.at(unit.x, unit.y, unit.hitSize);
				}
			}
		}));
		this.super$update(b);
	}
	
	despawned(b) {
		Units.nearby(b.team, b.x, b.y, 64, cons(unit => {
			if(unit.healthf() < 1 && unit != b.owner && !unit.dead){
				unit.health += Math.max(5.0,(90.0 * (1 - (unit.dst(b) / (unit.isFlying() ? 64 : 32)))));
				unit.clampHealth();
				if (unit.healthf() == 1){
					Fx.healWaveDynamic.at(unit.x, unit.y, unit.hitSize);
				}
			}
		}));
		goblinBombHeal.create(b.owner, b.team, b.x, b.y, 0, 1, 1);
		this.super$despawned(b);
	}
*/

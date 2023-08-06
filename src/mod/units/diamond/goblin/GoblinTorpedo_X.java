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


public class GoblinTorpedo_X extends BasicBulletType {
	
	//---------------------------------------------------------------//
	//  Constructor                                                  //
	//---------------------------------------------------------------//
	public GoblinTorpedo_X() {
		
		lifetime = 55;
		damage = 20;
		splashDamage = 30;
		splashDamageRadius = 25;
		buildingDamageMultiplier = 0.5f;
		width = 16;
		height = 16;
		lightRadius = 17;
		lightOpacity = 1.15f;
		shrinkY = 0;
		shrinkX = 0.5f;
		
		despawnEffect = Fx.shockwave;
		hitEffect = Fx.flakExplosion;
		
		hitSound = Sounds.explosion;
		trailEffect = Fx.mine;
		
		speed = 6.7f;
		
		fragBullets = 8;
		
		fragBullet = new GoblinTorpedoFrag_X();
		
		fragLifeMin = 0.2f;
		fragVelocityMin = 1 / 7;
		fragVelocityMax = 11 / 6;
		
		//collidesAir = true;
		
		collides = true;
		reflectable = true;
		trailChance = 1;
		
		frontColor = Color.valueOf("EDF3A9");
		trailColor = Color.valueOf("EDF3A9");
		hitColor   = Color.valueOf("66dd88");
		backColor  = Color.valueOf("44ee77");
		lightColor = Color.valueOf("aaff77");
		
		sprite = "bullet";        //Was: "critter-zone-diamondbomb";
		
	} //Constructor
	
} //class

/*
	despawned(b) {
		Units.nearby(b.team, b.x, b.y, 30, cons(unit => {
			if(unit.healthf() < 1 && unit != b.owner && !unit.dead){
				unit.health += Math.max(5.0,(65.0 * (1 - (unit.dst(b) / 30))));
				unit.clampHealth();
				if (unit.healthf() == 1){
					Fx.healWaveDynamic.at(unit.x, unit.y, unit.hitSize);
				}
			}
		}));
		this.super$despawned(b);
	}
*/

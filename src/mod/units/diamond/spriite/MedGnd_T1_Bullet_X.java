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


public class MedGnd_T1_Bullet_X extends BasicBulletType {
	
	//---------------------------------------------------------------//
	//  Constructor                                                  //
	//---------------------------------------------------------------//
	public MedGnd_T1_Bullet_X() {
		
		damage   = 16;
		speed    = 2.4f;
		lifetime = 45;
		
		width    = 3;
		height   = 4;
		
		collides     = false;
		keepVelocity = false;
		
		buildingDamageMultiplier = 0.6f;
		
		trailEffect   = Fx.none;
		despawnEffect = Fx.none;
		smokeEffect   = Fx.none;
		shootEffect   = Fx.none;
		hitEffect     = Fx.none;
		
		// hitSound = Vars.tree.loadSound("strikeZap");
		
		sprite = "circle-bullet";
		
	} //Constructor
	
} //class

/*
	init(b) {
		if (b != undefined) {
			this.super$init(b);
			var px = b.x + b.lifetime * b.vel.x;
			var py = b.y + b.lifetime * b.vel.y;
			var rot = b.rotation();
			var healFound = false;
			b.time = b.lifetime;
			b.vel.setZero();
			//b.set(px, py);
			var healTar = Units.closestOverlap(b.team, px, py, 1, boolf(unit => {
				if(unit.healthf() < 1 && unit != b.owner && !unit.dead && !healFound){
					unit.health += Math.abs(b.damage / 60);
					unit.clampHealth();
					if (unit.healthf() == 1){
						Fx.healWaveDynamic.at(unit.x, unit.y, unit.hitSize);
					}
					healFound = true;
					return unit;
				}
			}));
			if(healFound){
				Geometry.iterateLine(0, b.x, b.y, healTar.x, healTar.y, 3, (x, y) => {
				medGndT1bulletTrail.at(x, y, rot);
				});
				//Lock player aim onto the unit being repaired; BROKEN
				//if (b.owner.isPlayer()) {
				//	b.isPlayer().mouseX = healTar.x;
				//	b.isPlayer().mouseY = healTar.y;
				//}
			}
			b.remove();
		}
	}
*/

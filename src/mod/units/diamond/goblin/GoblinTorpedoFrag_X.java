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


public class GoblinTorpedoFrag_X extends BasicBulletType {
	
	//---------------------------------------------------------------//
	//  Constructor                                                  //
	//---------------------------------------------------------------//
	public GoblinTorpedoFrag_X() {
		
		lifetime = 80;
		damage = 12;
		buildingDamageMultiplier = 0.5f;
		width = 4;
		height = 4;
		lightRadius = 4;
		lightOpacity = 1.15f;
		shrinkY = 0;
		shrinkX = 0;
		despawnEffect = Fx.pointHit;
		hitEffect = Fx.smeltsmoke;
		shootEffect = Fx.shootHeal;
		speed = 1.2f;
		drag = 0.01f;
		
		frontColor = Color.valueOf("EDF3A9");
		hitColor   = Color.valueOf("EDF3A9");
		backColor  = Color.valueOf("aaee77");
		lightColor = Color.valueOf("aaff77");
		
		pierce = true;
		pierceBuilding = true;
		
		//hittable = false;
		
		reflectable = false;
		
		//absorbable = false;
		
		sprite = "critter-zone-diamondbullet";
		
	} //Constructor
	
} //class

/*
	update(b){
		this.super$update(b);
		Units.nearby(b.team, b.x, b.y, 4, cons(unit => {
			if(unit.healthf() < 1 && unit != b.owner && !unit.dead){
				unit.health += (0.1 + 2.0 * (1 - (unit.dst(b) / 4)));
				unit.clampHealth();
				if (unit.healthf() == 1){
					Fx.healWaveDynamic.at(unit.x, unit.y, unit.hitSize);
				}
			}
		}));
	}
*/

package mod.units;

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


public class Strider_X extends UnitType {
	
	//---------------------------------------------------------------//
	//  Constructor                                                  //
	//---------------------------------------------------------------//
	public Strider_X() {
		
		super("strider-x");
		
		localizedName = "Strider X";
		constructor = EntityMapping.map("flare");
		
		speed = 2.7f;
		accel = 0.08f;
		drag = 0.04f;
		flying = true;
		health = 70;
		engineOffset = 5.75f;
		
		targetFlags = new BlockFlag[]{BlockFlag.generator, null};
		hitSize = 9;
		itemCapacity = 10;
		
		weapons.add(new Weapon(){{
			y = 0f;
			x = 2f;
			reload = 20f;
			ejectEffect = Fx.casing1;
			
			bullet = new BasicBulletType(2.5f, 9){{
				width = 7f;
				height = 9f;
				lifetime = 45f;
				shootEffect = Fx.shootSmall;
				smokeEffect = Fx.shootSmallSmoke;
				ammoMultiplier = 2;
			}};
			
			shootSound = Sounds.pew;
		}});
		
	} //Constructor
	
} //class

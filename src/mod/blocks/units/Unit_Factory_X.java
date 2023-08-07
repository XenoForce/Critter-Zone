package mod.blocks.units;

import arc.*;
import arc.graphics.*;
import arc.struct.*;
import arc.util.*;

import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;

import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.entities.units.*;

import mindustry.graphics.*;
import mindustry.type.*;

import mindustry.world.blocks.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

// import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

import mod.units.*;


public class Unit_Factory_X extends UnitFactory {
	
	//---------------------------------------------------------------//
	//  Constructor                                                  //
	//---------------------------------------------------------------//
	public Unit_Factory_X() {
		
		super("unit-factory-x");
		
		localizedName = "Unit Factory (Critter Zone)";
		
		var zeroItems = new ItemStack[0];
		
		ItemStack[] zero = {};
		
		requirements( Category.units, zeroItems );
		
		plans = Seq.with(
			new UnitPlan( X_Unit_Types.spriite_x        , 180f, zero ),
			new UnitPlan( X_Unit_Types.gnome_x          , 180f, zero ),
			new UnitPlan( X_Unit_Types.pixie_x          , 180f, zero ),
			new UnitPlan( X_Unit_Types.nymph_x          , 180f, zero ),
			new UnitPlan( X_Unit_Types.goblin_x         , 180f, zero ),
			
			new UnitPlan( X_Unit_Types.abolisher_x      , 180f, zero ),
			new UnitPlan( X_Unit_Types.annihilator_x    , 180f, zero ),
			new UnitPlan( X_Unit_Types.azathoth_x       , 180f, zero ),
			new UnitPlan( X_Unit_Types.claw_x           , 180f, zero ),
			new UnitPlan( X_Unit_Types.death_x          , 180f, zero ),
			new UnitPlan( X_Unit_Types.disintegrator_x  , 180f, zero ),
			new UnitPlan( X_Unit_Types.eliminator_x     , 180f, zero ),
			new UnitPlan( X_Unit_Types.famine_x         , 180f, zero ),
			new UnitPlan( X_Unit_Types.invader_x        , 180f, zero ),
			new UnitPlan( X_Unit_Types.pandora_x        , 180f, zero ),
			new UnitPlan( X_Unit_Types.pestilence_x     , 180f, zero ),
			new UnitPlan( X_Unit_Types.phoenix_x        , 180f, zero ),
			new UnitPlan( X_Unit_Types.queen_x          , 180f, zero ),
			new UnitPlan( X_Unit_Types.ravager_x        , 180f, zero ),
			new UnitPlan( X_Unit_Types.scourge_x        , 180f, zero ),
			new UnitPlan( X_Unit_Types.spike_x          , 180f, zero ),
			new UnitPlan( X_Unit_Types.storm_x          , 180f, zero ),
			new UnitPlan( X_Unit_Types.strider_x        , 180f, zero ),
			new UnitPlan( X_Unit_Types.thorn_x          , 180f, zero ),
			new UnitPlan( X_Unit_Types.war_x            , 180f, zero )
		);
		
		size = 3;
		
		// consumePower(1.2f);
		
	} //Constructor
	
} //class

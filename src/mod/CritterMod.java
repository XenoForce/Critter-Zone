package mod;

import java.util.*;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import mindustry.ctype.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import mindustry.type.unit.*;

// import mod.blocks.turrets.*;
import mod.blocks.units.*;
import mod.units.*;


public class CritterMod extends Mod {
	
	//---------------------------------------------------------------//
	//  Constructor                                                  //
	//---------------------------------------------------------------//
	public CritterMod() {
		
		Log.info("Loaded Critter-Zone (CritterMod class) constructor.");
		
		//listen for game load event
		Events.on( ClientLoadEvent.class, e -> {
			
			//Show dialog upon startup:
			Time.runTask(10f, () -> {
				// BaseDialog dialog = new BaseDialog("abc");
				// Note: Mod sprites are prefixed with the mod name.
			});
		});
	} //constructor
	
	
	//---------------------------------------------------------------//
	//  loadContent()                                                //
	//---------------------------------------------------------------//
	@Override
	public void loadContent() {
		
		Log.info("Loading content - (Critter-Zone mod).");
		
		List<UnlockableContent> arrContent = new ArrayList<>();
		
		// "Advance Content" Units:
		
		arrContent.add( X_Unit_Types.abolisher_x     );
		arrContent.add( X_Unit_Types.annihilator_x   );
		arrContent.add( X_Unit_Types.azathoth_x      );
		arrContent.add( X_Unit_Types.claw_x          );
		arrContent.add( X_Unit_Types.death_x         );
		arrContent.add( X_Unit_Types.disintegrator_x );
		arrContent.add( X_Unit_Types.eliminator_x    );
		arrContent.add( X_Unit_Types.famine_x        );
		arrContent.add( X_Unit_Types.invader_x       );
		arrContent.add( X_Unit_Types.pandora_x       );
		arrContent.add( X_Unit_Types.pestilence_x    );
		arrContent.add( X_Unit_Types.phoenix_x       );
		arrContent.add( X_Unit_Types.queen_x         );
		arrContent.add( X_Unit_Types.ravager_x       );
		arrContent.add( X_Unit_Types.scourge_x       );
		arrContent.add( X_Unit_Types.spike_x         );
		arrContent.add( X_Unit_Types.storm_x         );
		arrContent.add( X_Unit_Types.strider_x       );
		arrContent.add( X_Unit_Types.thorn_x         );
		arrContent.add( X_Unit_Types.war_x           );
		
		
		// Unit Factory:
		
		arrContent.add( new Unit_Factory_X() );
		
		// "Diamond Ore Mod" Units:
		
		arrContent.add( X_Unit_Types.pixie_x  );
		arrContent.add( X_Unit_Types.nymph_x  );
		arrContent.add( X_Unit_Types.goblin_x );
		
		
		// - - - - - - - - - - - - - - - - - - - - - -
		
		for (UnlockableContent uc : arrContent) {
			uc.alwaysUnlocked = true;
			uc.load();
			// uc.unlock();
		} //for
		
	} //loadContent()
	
	
} //class

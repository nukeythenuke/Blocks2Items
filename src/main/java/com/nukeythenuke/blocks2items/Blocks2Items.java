package com.nukeythenuke.blocks2items;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.modid, name=Reference.name, version=Reference.version)
public class Blocks2Items{

    @Instance(Reference.modid)
    public static Blocks2Items instance;

	// PreInit
	@EventHandler
	public static void preInit(FMLPreInitializationEvent e){
	}

	// Init
	@EventHandler
	public static void init(FMLInitializationEvent e){

		// Calls the addRecipes method
		Recipes.addRecipes();
	}

	// PostInit
	@EventHandler
	public static void postInit(FMLPostInitializationEvent e){
	}
}

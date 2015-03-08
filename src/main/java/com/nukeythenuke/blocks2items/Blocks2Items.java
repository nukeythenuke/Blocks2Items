package com.nukeythenuke.blocks2items;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

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

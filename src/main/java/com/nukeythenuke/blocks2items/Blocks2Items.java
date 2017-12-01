package com.nukeythenuke.blocks2items;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Blocks2Items.modid, name=Blocks2Items.name, version=Blocks2Items.version)
public class Blocks2Items{
	
	final static String modid = "blocks2items";
    final static String name = "Blocks 2 Items";
    final static String version = "1.12-1.6";
	
    @Mod.Instance(modid)
    public static Blocks2Items instance;

	// PreInit
	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent e){
	}

	// Init
	@Mod.EventHandler
	public static void init(FMLInitializationEvent e){
	}

	// PostInit
	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent e){
	}
}

package com.nukeythenuke.blocks2items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {
	// Recipes Method
	public static void addRecipes() {

			/*
			 *
			 * ItemStacks
			 *
			 * */

        // Quartz
        ItemStack QuartzOutput = new ItemStack(Items.quartz, 4);
        ItemStack Quartz1Input = new ItemStack(Blocks.quartz_block);
        ItemStack Quartz2Input = new ItemStack(Blocks.quartz_block, 1, 1);
        ItemStack Quartz3Input = new ItemStack(Blocks.quartz_block, 1, 2);

        // Clay
        ItemStack ClayOutput = new ItemStack(Items.clay_ball, 4);
        ItemStack ClayInput = new ItemStack(Blocks.clay, 1);

        // GlowStone
        ItemStack GlowStoneOutput = new ItemStack(Items.glowstone_dust, 4);
        ItemStack GlowStoneInput = new ItemStack(Blocks.glowstone, 1);

        // WorkBench
        ItemStack WorkbenchOutput = new ItemStack(Blocks.planks, 4);
        ItemStack WorkbenchInput = new ItemStack(Blocks.crafting_table);

        // Furnace
        ItemStack FurnaceOutput = new ItemStack(Blocks.cobblestone, 8);
        ItemStack FurnaceInput = new ItemStack(Blocks.furnace);

        // Chest
        ItemStack ChestOutput = new ItemStack(Blocks.planks, 8);
        ItemStack ChestInput = new ItemStack(Blocks.chest);

        // StoneBrick
        ItemStack StoneBrick1Input = new ItemStack(Blocks.stonebrick, 1);
        ItemStack StoneBrick2Input = new ItemStack(Blocks.stonebrick, 1, 1);
        ItemStack StoneBrick3Input = new ItemStack(Blocks.stonebrick, 1, 2);
        ItemStack StoneBrick4Input = new ItemStack(Blocks.stonebrick, 1, 3);
        ItemStack StoneBrickOutput = new ItemStack(Blocks.stone, 1);

        // Sandstone
        ItemStack Sandstone1Input = new ItemStack(Blocks.sandstone);
        ItemStack Sandstone2Input = new ItemStack(Blocks.sandstone, 1, 1);
        ItemStack Sandstone3Input = new ItemStack(Blocks.sandstone, 1, 2);
        ItemStack SandstoneOutput = new ItemStack(Blocks.sand, 4);

        // Doors
        ItemStack WDoorOutput = new ItemStack(Blocks.planks, 6);
        ItemStack WDoorInput = new ItemStack(Items.wooden_door, 6);
        ItemStack IDoorOutput = new ItemStack(Items.iron_ingot, 6);
        ItemStack IDoorInput = new ItemStack(Items.iron_door, 6);

        // Minecarts and Boats
        ItemStack MinecartOutput = new ItemStack(Items.iron_ingot, 5);
        ItemStack MinecartInput = new ItemStack(Items.minecart, 1);
        ItemStack BoatOutput = new ItemStack(Blocks.planks, 5);
        ItemStack BoatInput = new ItemStack(Items.boat, 1);

        // TrapDoor
        ItemStack TrapDoorOutput = new ItemStack(Blocks.planks, 3);
        ItemStack TrapDoorInput = new ItemStack(Blocks.trapdoor, 1);

        // Pressure Plates
        ItemStack SPressurePlateOutput = new ItemStack(Blocks.stone, 2);
        ItemStack SPressurePlateInput = new ItemStack(Blocks.stone_pressure_plate, 1);
        ItemStack WPressurePlateOutput = new ItemStack(Blocks.planks, 2);
        ItemStack WPressurePlateInput = new ItemStack(Blocks.wooden_pressure_plate, 1);
        ItemStack GPressurePlateOutput = new ItemStack(Items.gold_ingot, 2);
        ItemStack GPressurePlateInput = new ItemStack(Blocks.light_weighted_pressure_plate, 1);
        ItemStack IPressurePlateOutput = new ItemStack(Items.iron_ingot, 2);
        ItemStack IPressurePlateInput = new ItemStack(Blocks.heavy_weighted_pressure_plate, 1);

        // Buttons
        ItemStack SButtonOutput = new ItemStack(Blocks.stone, 1);
        ItemStack SButtonInput = new ItemStack(Blocks.stone_button, 1);
        ItemStack WButtonOutput = new ItemStack(Blocks.planks, 1);
        ItemStack WButtonInput = new ItemStack(Blocks.wooden_button, 1);

        // Fence / Wall
        ItemStack WoodenFenceOutput = new ItemStack(Items.stick, 3);
        ItemStack WoodenFenceInput = new ItemStack(Blocks.fence, 1);
        ItemStack NetherFenceOutput = new ItemStack(Blocks.nether_brick, 1);
        ItemStack NetherFenceInput = new ItemStack(Blocks.nether_brick_fence, 1);
        ItemStack CobbleWallOutput = new ItemStack(Blocks.cobblestone, 1);
        ItemStack CobbleWallInput = new ItemStack(Blocks.cobblestone_wall, 1);
        ItemStack MossyWallOutput = new ItemStack(Blocks.mossy_cobblestone, 1);
        ItemStack MossyWallInput = new ItemStack(Blocks.cobblestone_wall, 1, 1);

        // Anvil
        ItemStack AnvilOutput = new ItemStack(Items.iron_ingot, 31);
        ItemStack AnvilInput = new ItemStack(Blocks.anvil, 1);

        // Cauldron
        ItemStack CauldronOutput = new ItemStack(Items.iron_ingot, 7);
        ItemStack CauldronInput = new ItemStack(Items.cauldron, 1);

        // Grass / Mycelium
        ItemStack GrassInput = new ItemStack(Blocks.grass);
        ItemStack MyceliumInput = new ItemStack(Blocks.mycelium);
        ItemStack DirtOutput = new ItemStack(Blocks.dirt);

        // NetherBrick
        ItemStack NetherBrickOutput = new ItemStack(Items.netherbrick, 4);
        ItemStack NetherBrickInput = new ItemStack(Blocks.nether_brick, 1);

			/*
			 *
			 * Recipes
			 *
			 * */

        // Quartz
        GameRegistry.addShapelessRecipe(QuartzOutput, Quartz1Input);
        GameRegistry.addShapelessRecipe(QuartzOutput, Quartz2Input);
        GameRegistry.addShapelessRecipe(QuartzOutput, Quartz3Input);

        // Clay
        GameRegistry.addShapelessRecipe(ClayOutput, ClayInput);

        // GlowStone
        GameRegistry.addShapelessRecipe(GlowStoneOutput, GlowStoneInput);

        // Workbench
        GameRegistry.addShapelessRecipe(WorkbenchOutput, WorkbenchInput);

        // Furnace
        GameRegistry.addShapelessRecipe(FurnaceOutput, FurnaceInput);

        // Chest
        GameRegistry.addShapelessRecipe(ChestOutput, ChestInput);

        // StoneBrick
        GameRegistry.addShapelessRecipe(StoneBrickOutput, StoneBrick1Input);
        GameRegistry.addShapelessRecipe(StoneBrickOutput, StoneBrick2Input);
        GameRegistry.addShapelessRecipe(StoneBrickOutput, StoneBrick3Input);
        GameRegistry.addShapelessRecipe(StoneBrickOutput, StoneBrick4Input);

        // Sandstone
        GameRegistry.addShapelessRecipe(SandstoneOutput, Sandstone1Input);
        GameRegistry.addShapelessRecipe(SandstoneOutput, Sandstone2Input);
        GameRegistry.addShapelessRecipe(SandstoneOutput, Sandstone3Input);

        // Doors
        GameRegistry.addShapelessRecipe(WDoorOutput, WDoorInput);
        GameRegistry.addShapelessRecipe(IDoorOutput, IDoorInput);

        // Minecart and Boat
        GameRegistry.addShapelessRecipe(MinecartOutput, MinecartInput);
        GameRegistry.addShapelessRecipe(BoatOutput, BoatInput);

        // TrapDoor
        GameRegistry.addShapelessRecipe(TrapDoorOutput, TrapDoorInput);

        // Pressure Plates
        GameRegistry.addShapelessRecipe(SPressurePlateOutput, SPressurePlateInput);
        GameRegistry.addShapelessRecipe(WPressurePlateOutput, WPressurePlateInput);
        GameRegistry.addShapelessRecipe(GPressurePlateOutput, GPressurePlateInput);
        GameRegistry.addShapelessRecipe(IPressurePlateOutput, IPressurePlateInput);

        // Buttons
        GameRegistry.addShapelessRecipe(SButtonOutput, SButtonInput);
        GameRegistry.addShapelessRecipe(WButtonOutput, WButtonInput);

        // Fence / Wall
        GameRegistry.addShapelessRecipe(WoodenFenceOutput, WoodenFenceInput);
        GameRegistry.addShapelessRecipe(NetherFenceOutput, NetherFenceInput);
        GameRegistry.addShapelessRecipe(CobbleWallOutput, CobbleWallInput);
        GameRegistry.addShapelessRecipe(MossyWallOutput, MossyWallInput);

        // Anvil
        GameRegistry.addShapelessRecipe(AnvilOutput, AnvilInput);

        // Cauldron
        GameRegistry.addShapelessRecipe(CauldronOutput, CauldronInput);

        // Grass / Mycelium
        GameRegistry.addShapelessRecipe(DirtOutput, GrassInput);
        GameRegistry.addShapelessRecipe(DirtOutput, MyceliumInput);

        // NetherBrick
        GameRegistry.addShapelessRecipe(NetherBrickOutput, NetherBrickInput);
    }
}

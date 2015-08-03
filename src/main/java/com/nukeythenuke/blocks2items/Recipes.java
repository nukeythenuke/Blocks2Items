package com.nukeythenuke.blocks2items;

import net.minecraftforge.fml.common.registry.GameRegistry;
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
        ItemStack ClayInput = new ItemStack(Blocks.clay);

        // GlowStone
        ItemStack GlowStoneOutput = new ItemStack(Items.glowstone_dust, 4);
        ItemStack GlowStoneInput = new ItemStack(Blocks.glowstone);

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
        ItemStack StoneBrick1Input = new ItemStack(Blocks.stonebrick);
        ItemStack StoneBrick2Input = new ItemStack(Blocks.stonebrick, 1, 1);
        ItemStack StoneBrick3Input = new ItemStack(Blocks.stonebrick, 1, 2);
        ItemStack StoneBrick4Input = new ItemStack(Blocks.stonebrick, 1, 3);
        ItemStack StoneBrickOutput = new ItemStack(Blocks.stone);

        // Sandstone
        ItemStack Sandstone1Input = new ItemStack(Blocks.sandstone);
        ItemStack Sandstone2Input = new ItemStack(Blocks.sandstone, 1, 1);
        ItemStack Sandstone3Input = new ItemStack(Blocks.sandstone, 1, 2);
        ItemStack SandstoneOutput = new ItemStack(Blocks.sand, 4);
        
        // Red Sandstone
        ItemStack RedSandstone1Input = new ItemStack(Blocks.red_sandstone);
        ItemStack RedSandstone2Input = new ItemStack(Blocks.red_sandstone, 1, 1);
        ItemStack RedSandstone3Input = new ItemStack(Blocks.red_sandstone, 1, 2);
        ItemStack RedSandstoneOutput = new ItemStack(Blocks.sand, 4, 1);

        // Doors
        ItemStack ODoorOutput = new ItemStack(Blocks.planks, 2);
        ItemStack ODoorInput = new ItemStack(Items.oak_door);
        ItemStack SDoorOutput = new ItemStack(Blocks.planks, 2, 1);
        ItemStack SDoorInput = new ItemStack(Items.spruce_door);
        ItemStack BDoorOutput = new ItemStack(Blocks.planks, 2, 2);
        ItemStack BDoorInput = new ItemStack(Items.birch_door);
        ItemStack JDoorOutput = new ItemStack(Blocks.planks, 2, 3);
        ItemStack JDoorInput = new ItemStack(Items.jungle_door);
        ItemStack ADoorOutput = new ItemStack(Blocks.planks, 2, 4);
        ItemStack ADoorInput = new ItemStack(Items.acacia_door);
        ItemStack DODoorOutput = new ItemStack(Blocks.planks, 2, 5);
        ItemStack DODoorInput = new ItemStack(Items.dark_oak_door);
        ItemStack IDoorOutput = new ItemStack(Items.iron_ingot, 2);
        ItemStack IDoorInput = new ItemStack(Items.iron_door);

        // Minecarts and Boats
        ItemStack MinecartOutput = new ItemStack(Items.iron_ingot, 5);
        ItemStack MinecartInput = new ItemStack(Items.minecart);
        ItemStack BoatOutput = new ItemStack(Blocks.planks, 5);
        ItemStack BoatInput = new ItemStack(Items.boat);

        // TrapDoor
        ItemStack TrapDoorOutput = new ItemStack(Blocks.planks, 3);
        ItemStack TrapDoorInput = new ItemStack(Blocks.trapdoor);
        ItemStack ITrapDoorOutput = new ItemStack(Items.iron_ingot, 4);
        ItemStack ITrapDoorInput = new ItemStack(Blocks.iron_trapdoor);

        // Pressure Plates
        ItemStack SPressurePlateOutput = new ItemStack(Blocks.stone, 2);
        ItemStack SPressurePlateInput = new ItemStack(Blocks.stone_pressure_plate);
        ItemStack WPressurePlateOutput = new ItemStack(Blocks.planks, 2);
        ItemStack WPressurePlateInput = new ItemStack(Blocks.wooden_pressure_plate);
        ItemStack GPressurePlateOutput = new ItemStack(Items.gold_ingot, 2);
        ItemStack GPressurePlateInput = new ItemStack(Blocks.light_weighted_pressure_plate);
        ItemStack IPressurePlateOutput = new ItemStack(Items.iron_ingot, 2);
        ItemStack IPressurePlateInput = new ItemStack(Blocks.heavy_weighted_pressure_plate);

        // Buttons
        ItemStack SButtonOutput = new ItemStack(Blocks.stone);
        ItemStack SButtonInput = new ItemStack(Blocks.stone_button);
        ItemStack WButtonOutput = new ItemStack(Blocks.planks);
        ItemStack WButtonInput = new ItemStack(Blocks.wooden_button);

        // Fence / Wall
        ItemStack NetherFenceOutput = new ItemStack(Blocks.nether_brick);
        ItemStack NetherFenceInput = new ItemStack(Blocks.nether_brick_fence);
        ItemStack CobbleWallOutput = new ItemStack(Blocks.cobblestone);
        ItemStack CobbleWallInput = new ItemStack(Blocks.cobblestone_wall);
        ItemStack MossyWallOutput = new ItemStack(Blocks.mossy_cobblestone);
        ItemStack MossyWallInput = new ItemStack(Blocks.cobblestone_wall, 1, 1);

        // Anvil
        ItemStack AnvilOutput = new ItemStack(Items.iron_ingot, 31);
        ItemStack AnvilInput = new ItemStack(Blocks.anvil);

        // Cauldron
        ItemStack CauldronOutput = new ItemStack(Items.iron_ingot, 7);
        ItemStack CauldronInput = new ItemStack(Items.cauldron);

        // Grass / Mycelium
        ItemStack GrassInput = new ItemStack(Blocks.grass);
        ItemStack MyceliumInput = new ItemStack(Blocks.mycelium);
        ItemStack DirtOutput = new ItemStack(Blocks.dirt);

        // NetherBrick
        ItemStack NetherBrickOutput = new ItemStack(Items.netherbrick, 4);
        ItemStack NetherBrickInput = new ItemStack(Blocks.nether_brick);

        // Prismarine
        ItemStack PrismarineOutput = new ItemStack(Items.prismarine_shard, 4);
        ItemStack PrismarineInput = new ItemStack(Blocks.prismarine);
        ItemStack PrismarineBrickOutput = new ItemStack(Items.prismarine_shard, 9);
        ItemStack PrismarineBrickInput = new ItemStack(Blocks.prismarine, 1, 1);
        ItemStack DarkPrismarineOutput = new ItemStack(Items.prismarine_shard, 8);
        ItemStack DarkPrismarineInput = new ItemStack(Blocks.prismarine, 1, 2);
        
        // Snow
        ItemStack SnowOutput = new ItemStack(Items.snowball, 4);
        ItemStack SnowInput = new ItemStack(Blocks.snow);
        
        // Bread
        ItemStack BreadOutput = new ItemStack(Items.wheat, 3);
        ItemStack BreadInput = new ItemStack(Items.bread);
        
        // Tools / Weapons
        ItemStack WoodSwordOutput = new ItemStack(Blocks.planks, 2);
        ItemStack WoodSwordInput = new ItemStack(Items.wooden_sword);
        ItemStack WoodPickaxeOutput = new ItemStack(Blocks.planks, 3);
        ItemStack WoodPickaxeInput = new ItemStack(Items.wooden_pickaxe);
        ItemStack WoodShovelOutput = new ItemStack(Blocks.planks);
        ItemStack WoodShovelInput = new ItemStack(Items.wooden_shovel);
        ItemStack WoodAxeOutput = new ItemStack(Blocks.planks, 3);
        ItemStack WoodAxeInput = new ItemStack(Items.wooden_axe);
        ItemStack WoodHoeOutput = new ItemStack(Blocks.planks, 2);
        ItemStack WoodHoeInput = new ItemStack(Items.wooden_hoe);
        
        ItemStack StoneSwordOutput = new ItemStack(Blocks.cobblestone, 2);
        ItemStack StoneSwordInput = new ItemStack(Items.stone_sword);
        ItemStack StonePickaxeOutput = new ItemStack(Blocks.cobblestone, 3);
        ItemStack StonePickaxeInput = new ItemStack(Items.stone_pickaxe);
        ItemStack StoneShovelOutput = new ItemStack(Blocks.cobblestone);
        ItemStack StoneShovelInput = new ItemStack(Items.stone_shovel);
        ItemStack StoneAxeOutput = new ItemStack(Blocks.cobblestone, 3);
        ItemStack StoneAxeInput = new ItemStack(Items.stone_axe);
        ItemStack StoneHoeOutput = new ItemStack(Blocks.cobblestone, 2);
        ItemStack StoneHoeInput = new ItemStack(Items.stone_hoe);
        
        ItemStack IronSwordOutput = new ItemStack(Items.iron_ingot, 2);
        ItemStack IronSwordInput = new ItemStack(Items.iron_sword);
        ItemStack IronPickaxeOutput = new ItemStack(Items.iron_ingot, 3);
        ItemStack IronPickaxeInput = new ItemStack(Items.iron_pickaxe);
        ItemStack IronShovelOutput = new ItemStack(Items.iron_ingot);
        ItemStack IronShovelInput = new ItemStack(Items.iron_shovel);
        ItemStack IronAxeOutput = new ItemStack(Items.iron_ingot, 3);
        ItemStack IronAxeInput = new ItemStack(Items.iron_axe);
        ItemStack IronHoeOutput = new ItemStack(Items.iron_ingot, 2);
        ItemStack IronHoeInput = new ItemStack(Items.iron_hoe);
        
        ItemStack GoldSwordOutput = new ItemStack(Items.gold_ingot, 2);
        ItemStack GoldSwordInput = new ItemStack(Items.golden_sword);
        ItemStack GoldPickaxeOutput = new ItemStack(Items.gold_ingot, 3);
        ItemStack GoldPickaxeInput = new ItemStack(Items.golden_pickaxe);
        ItemStack GoldShovelOutput = new ItemStack(Items.gold_ingot);
        ItemStack GoldShovelInput = new ItemStack(Items.golden_shovel);
        ItemStack GoldAxeOutput = new ItemStack(Items.gold_ingot, 3);
        ItemStack GoldAxeInput = new ItemStack(Items.golden_axe);
        ItemStack GoldHoeOutput = new ItemStack(Items.gold_ingot, 2);
        ItemStack GoldHoeInput = new ItemStack(Items.golden_hoe);
        
        ItemStack DiamondSwordOutput = new ItemStack(Items.diamond, 2);
        ItemStack DiamondSwordInput = new ItemStack(Items.diamond_sword);
        ItemStack DiamondPickaxeOutput = new ItemStack(Items.diamond, 3);
        ItemStack DiamondPickaxeInput = new ItemStack(Items.diamond_pickaxe);
        ItemStack DiamondShovelOutput = new ItemStack(Items.diamond);
        ItemStack DiamondShovelInput = new ItemStack(Items.diamond_shovel);
        ItemStack DiamondAxeOutput = new ItemStack(Items.diamond, 3);
        ItemStack DiamondAxeInput = new ItemStack(Items.diamond_axe);
        ItemStack DiamondHoeOutput = new ItemStack(Items.diamond, 2);
        ItemStack DiamondHoeInput = new ItemStack(Items.diamond_hoe);
        
        // Armour
        ItemStack LeatherHelmOutput = new ItemStack(Items.leather, 5);
        ItemStack LeatherChestOutput = new ItemStack(Items.leather, 8);
        ItemStack LeatherPantsOutput = new ItemStack(Items.leather, 7);
        ItemStack LeatherBootsOutput = new ItemStack(Items.leather, 4);
        ItemStack LeatherHelmInput = new ItemStack(Items.leather_helmet);
        ItemStack LeatherChestInput = new ItemStack(Items.leather_chestplate);
        ItemStack LeatherPantsInput = new ItemStack(Items.leather_leggings);
        ItemStack LeatherBootsInput = new ItemStack(Items.leather_boots);

        ItemStack IronHelmOutput = new ItemStack(Items.iron_ingot, 5);
        ItemStack IronChestOutput = new ItemStack(Items.iron_ingot, 8);
        ItemStack IronPantsOutput = new ItemStack(Items.iron_ingot, 7);
        ItemStack IronBootsOutput = new ItemStack(Items.iron_ingot, 4);
        ItemStack IronHelmInput = new ItemStack(Items.iron_helmet);
        ItemStack IronChestInput = new ItemStack(Items.iron_chestplate);
        ItemStack IronPantsInput = new ItemStack(Items.iron_leggings);
        ItemStack IronBootsInput = new ItemStack(Items.iron_boots);

        ItemStack GoldHelmOutput = new ItemStack(Items.gold_ingot, 5);
        ItemStack GoldChestOutput = new ItemStack(Items.gold_ingot, 8);
        ItemStack GoldPantsOutput = new ItemStack(Items.gold_ingot, 7);
        ItemStack GoldBootsOutput = new ItemStack(Items.gold_ingot, 4);
        ItemStack GoldHelmInput = new ItemStack(Items.golden_helmet);
        ItemStack GoldChestInput = new ItemStack(Items.golden_chestplate);
        ItemStack GoldPantsInput = new ItemStack(Items.golden_leggings);
        ItemStack GoldBootsInput = new ItemStack(Items.golden_boots);

        ItemStack DiamondHelmOutput = new ItemStack(Items.diamond, 5);
        ItemStack DiamondChestOutput = new ItemStack(Items.diamond, 8);
        ItemStack DiamondPantsOutput = new ItemStack(Items.diamond, 7);
        ItemStack DiamondBootsOutput = new ItemStack(Items.diamond, 4);
        ItemStack DiamondHelmInput = new ItemStack(Items.diamond_helmet);
        ItemStack DiamondChestInput = new ItemStack(Items.diamond_chestplate);
        ItemStack DiamondPantsInput = new ItemStack(Items.diamond_leggings);
        ItemStack DiamondBootsInput = new ItemStack(Items.diamond_boots);

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
        
        // Red Sandstone
        GameRegistry.addShapelessRecipe(RedSandstoneOutput, RedSandstone1Input);
        GameRegistry.addShapelessRecipe(RedSandstoneOutput, RedSandstone2Input);
        GameRegistry.addShapelessRecipe(RedSandstoneOutput, RedSandstone3Input);

        // Doors
        GameRegistry.addShapelessRecipe(ODoorOutput, ODoorInput);
        GameRegistry.addShapelessRecipe(SDoorOutput, SDoorInput);
        GameRegistry.addShapelessRecipe(BDoorOutput, BDoorInput);
        GameRegistry.addShapelessRecipe(JDoorOutput, JDoorInput);
        GameRegistry.addShapelessRecipe(ADoorOutput, ADoorInput);
        GameRegistry.addShapelessRecipe(DODoorOutput, DODoorInput);
        GameRegistry.addShapelessRecipe(IDoorOutput, IDoorInput);

        // Minecart and Boat
        GameRegistry.addShapelessRecipe(MinecartOutput, MinecartInput);
        GameRegistry.addShapelessRecipe(BoatOutput, BoatInput);

        // TrapDoor
        GameRegistry.addShapelessRecipe(TrapDoorOutput, TrapDoorInput);
        GameRegistry.addShapelessRecipe(ITrapDoorOutput, ITrapDoorInput);

        // Pressure Plates
        GameRegistry.addShapelessRecipe(SPressurePlateOutput, SPressurePlateInput);
        GameRegistry.addShapelessRecipe(WPressurePlateOutput, WPressurePlateInput);
        GameRegistry.addShapelessRecipe(GPressurePlateOutput, GPressurePlateInput);
        GameRegistry.addShapelessRecipe(IPressurePlateOutput, IPressurePlateInput);

        // Buttons
        GameRegistry.addShapelessRecipe(SButtonOutput, SButtonInput);
        GameRegistry.addShapelessRecipe(WButtonOutput, WButtonInput);

        // Fence / Wall
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

        // Prismarine
        GameRegistry.addShapelessRecipe(PrismarineOutput, PrismarineInput);
        GameRegistry.addShapelessRecipe(PrismarineBrickOutput, PrismarineBrickInput);
        GameRegistry.addShapelessRecipe(DarkPrismarineOutput, DarkPrismarineInput);
        
        // Snow
        GameRegistry.addShapelessRecipe(SnowOutput, SnowInput);
        
        // Bread
        GameRegistry.addShapelessRecipe(BreadOutput, BreadInput);
        
        // Tools / Weapons
        GameRegistry.addShapelessRecipe(WoodSwordOutput, WoodSwordInput);
        GameRegistry.addShapelessRecipe(WoodPickaxeOutput, WoodPickaxeInput);
        GameRegistry.addShapelessRecipe(WoodShovelOutput, WoodShovelInput);
        GameRegistry.addShapelessRecipe(WoodAxeOutput, WoodAxeInput);
        GameRegistry.addShapelessRecipe(WoodHoeOutput, WoodHoeInput);
        
        GameRegistry.addShapelessRecipe(StoneSwordOutput, StoneSwordInput);
        GameRegistry.addShapelessRecipe(StonePickaxeOutput, StonePickaxeInput);
        GameRegistry.addShapelessRecipe(StoneShovelOutput, StoneShovelInput);
        GameRegistry.addShapelessRecipe(StoneAxeOutput, StoneAxeInput);
        GameRegistry.addShapelessRecipe(StoneHoeOutput, StoneHoeInput);

        GameRegistry.addShapelessRecipe(IronSwordOutput, IronSwordInput);
        GameRegistry.addShapelessRecipe(IronPickaxeOutput, IronPickaxeInput);
        GameRegistry.addShapelessRecipe(IronShovelOutput, IronShovelInput);
        GameRegistry.addShapelessRecipe(IronAxeOutput, IronAxeInput);
        GameRegistry.addShapelessRecipe(IronHoeOutput, IronHoeInput);
        
        GameRegistry.addShapelessRecipe(GoldSwordOutput, GoldSwordInput);
        GameRegistry.addShapelessRecipe(GoldPickaxeOutput, GoldPickaxeInput);
        GameRegistry.addShapelessRecipe(GoldShovelOutput, GoldShovelInput);
        GameRegistry.addShapelessRecipe(GoldAxeOutput, GoldAxeInput);
        GameRegistry.addShapelessRecipe(GoldHoeOutput, GoldHoeInput);
        
        GameRegistry.addShapelessRecipe(DiamondSwordOutput, DiamondSwordInput);
        GameRegistry.addShapelessRecipe(DiamondPickaxeOutput, DiamondPickaxeInput);
        GameRegistry.addShapelessRecipe(DiamondShovelOutput, DiamondShovelInput);
        GameRegistry.addShapelessRecipe(DiamondAxeOutput, DiamondAxeInput);
        GameRegistry.addShapelessRecipe(DiamondHoeOutput, DiamondHoeInput);
        
        // Armour
        GameRegistry.addShapelessRecipe(LeatherHelmOutput, LeatherHelmInput);
        GameRegistry.addShapelessRecipe(LeatherChestOutput, LeatherChestInput);
        GameRegistry.addShapelessRecipe(LeatherPantsOutput, LeatherPantsInput);
        GameRegistry.addShapelessRecipe(LeatherBootsOutput, LeatherBootsInput);

        GameRegistry.addShapelessRecipe(IronHelmOutput, IronHelmInput);
        GameRegistry.addShapelessRecipe(IronChestOutput, IronChestInput);
        GameRegistry.addShapelessRecipe(IronPantsOutput, IronPantsInput);
        GameRegistry.addShapelessRecipe(IronBootsOutput, IronBootsInput);

        GameRegistry.addShapelessRecipe(GoldHelmOutput, GoldHelmInput);
        GameRegistry.addShapelessRecipe(GoldChestOutput, GoldChestInput);
        GameRegistry.addShapelessRecipe(GoldPantsOutput, GoldPantsInput);
        GameRegistry.addShapelessRecipe(GoldBootsOutput, GoldBootsInput);

        GameRegistry.addShapelessRecipe(DiamondHelmOutput, DiamondHelmInput);
        GameRegistry.addShapelessRecipe(DiamondChestOutput, DiamondChestInput);
        GameRegistry.addShapelessRecipe(DiamondPantsOutput, DiamondPantsInput);
        GameRegistry.addShapelessRecipe(DiamondBootsOutput, DiamondBootsInput);
    }
}

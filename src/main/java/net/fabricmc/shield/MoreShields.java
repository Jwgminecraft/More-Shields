package net.fabricmc.shield;

import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricShieldItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class MoreShields implements ModInitializer {

	public static final ItemGroup MORE_SHIELDS = FabricItemGroupBuilder.create(
					new Identifier("moreshields", "shields"))
			.icon(() -> new ItemStack(Items.SHIELD))
			.build();

	public static final Item WOOD_SHIELD = new FabricShieldItem(new FabricItemSettings().maxDamage(250).group(MORE_SHIELDS), 10, 13, Items.OAK_PLANKS);
	public static final Item STONE_SHIELD = new FabricShieldItem(new FabricItemSettings().maxDamage(750).group(MORE_SHIELDS), 10, 13, Items.COBBLESTONE);
	public static final Item GOLD_SHIELD = new FabricShieldItem(new FabricItemSettings().maxDamage(500).group(MORE_SHIELDS), 10, 13, Items.IRON_INGOT);
	public static final Item DIAMOND_SHIELD = new FabricShieldItem(new FabricItemSettings().maxDamage(2000).group(MORE_SHIELDS), 10, 13, Items.DIAMOND);
	public static final Item NETHERITE_SHIELD = new FabricShieldItem(new FabricItemSettings().maxDamage(2500).group(MORE_SHIELDS), 10, 13, Items.NETHERITE_INGOT);



	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("moreshields", "wood_shield"), WOOD_SHIELD);
		Registry.register(Registry.ITEM, new Identifier("moreshields", "stone_shield"), STONE_SHIELD);
		Registry.register(Registry.ITEM, new Identifier("moreshields", "gold_shield"), GOLD_SHIELD);
		Registry.register(Registry.ITEM, new Identifier("moreshields", "diamond_shield"), DIAMOND_SHIELD);
		Registry.register(Registry.ITEM, new Identifier("moreshields", "netherite_shield"), NETHERITE_SHIELD);
		if (FabricLoader.getInstance().isModLoaded("specialnetherite") == true) {
			 final ItemGroup MORE_SHIELDS_SPECIALNETHERITE = FabricItemGroupBuilder.create(
							new Identifier("moreshieldsadditions", "specialised_netherite_shields"))
					.icon(() -> new ItemStack(Items.SHIELD))
					.build();
			 final Item OVERWORLD_NETHERITE_SHIELD = new FabricShieldItem(new FabricItemSettings().maxDamage(3500).group(MORE_SHIELDS_SPECIALNETHERITE), 10, 13, Items.NETHERITE_INGOT);
			 final Item NETHER_NETHERITE_SHIELD = new FabricShieldItem(new FabricItemSettings().maxDamage(3500).group(MORE_SHIELDS_SPECIALNETHERITE), 10, 13, Items.NETHERITE_INGOT);
			 final Item END_NETHERITE_SHIELD = new FabricShieldItem(new FabricItemSettings().maxDamage(3500).group(MORE_SHIELDS_SPECIALNETHERITE), 10, 13, Items.NETHERITE_INGOT);
			Registry.register(Registry.ITEM, new Identifier("moreshieldsadditions", "overworld_netherite_shield"), OVERWORLD_NETHERITE_SHIELD);
			Registry.register(Registry.ITEM, new Identifier("moreshieldsadditions", "nether_netherite_shield"), NETHER_NETHERITE_SHIELD);
			Registry.register(Registry.ITEM, new Identifier("moreshieldsadditions", "end_netherite_shield"), END_NETHERITE_SHIELD);


		}
		//if (FabricLoader.getInstance().isModLoaded("specialisednetheriteplus") == true) {
		//
		//}


	}
}

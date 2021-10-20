package net.fabricmc.shield;

import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricShieldItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class MoreShields implements ModInitializer {

	public static final ItemGroup MORE_SHIELDS = FabricItemGroupBuilder.build(
			new Identifier("moreshields", "shields"),
			() -> new ItemStack(Items.SHIELD));
	public static final ItemGroup MORE_SHIELDS_ADDITIONS = FabricItemGroupBuilder.create(
					new Identifier("moreshields", "shields_additions"))
			.icon(() -> new ItemStack(Items.WOODEN_AXE))
			.build();

	public static final Item WOOD_SHIELD = new FabricShieldItem(new FabricItemSettings().maxDamage(2500).group(ItemGroup.COMBAT), 10, 13, Items.OAK_PLANKS);
	public static final Item STONE_SHIELD = new FabricShieldItem(new FabricItemSettings().maxDamage(2500).group(ItemGroup.COMBAT), 10, 13, Items.COBBLESTONE);
	public static final Item GOLD_SHIELD = new FabricShieldItem(new FabricItemSettings().maxDamage(2500).group(ItemGroup.COMBAT), 10, 13, Items.IRON_INGOT);
	public static final Item DIAMOND_SHIELD = new FabricShieldItem(new FabricItemSettings().maxDamage(2500).group(ItemGroup.COMBAT), 10, 13, Items.DIAMOND);
	public static final Item NETHERITE_SHIELD = new FabricShieldItem(new FabricItemSettings().maxDamage(2500).group(ItemGroup.COMBAT), 10, 13, Items.NETHERITE_INGOT);
	@Override
	public void onInitialize() {


		Registry.register(Registry.ITEM, new Identifier("moreshields", "wood_shield"), WOOD_SHIELD);
		Registry.register(Registry.ITEM, new Identifier("moreshields", "stone_shield"), STONE_SHIELD);
		Registry.register(Registry.ITEM, new Identifier("moreshields", "gold_shield"), GOLD_SHIELD);
		Registry.register(Registry.ITEM, new Identifier("moreshields", "diamond_shield"), DIAMOND_SHIELD);
		Registry.register(Registry.ITEM, new Identifier("moreshields", "netherite_shield"), NETHERITE_SHIELD);
	}
}

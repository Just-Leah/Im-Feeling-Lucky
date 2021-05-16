package io.github.Stonewall0210.ImFeelingLucky;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ImFeelingLucky implements ModInitializer {
	// Item Group
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier("imfeelinglucky", "item_group"),
			() -> new ItemStack(Blocks.JACK_O_LANTERN));

	// Items
		// Tea
		public static final Item COLD_TEA = new Item(new FabricItemSettings().group(ImFeelingLucky.ITEM_GROUP));
		public static final Item SWEET_COLD_TEA = new Item(new FabricItemSettings().group(ImFeelingLucky.ITEM_GROUP));
		public static final Item COOL_TEA = new Item(new FabricItemSettings().group(ImFeelingLucky.ITEM_GROUP));
		public static final Item SWEET_COOL_TEA = new Item(new FabricItemSettings().group(ImFeelingLucky.ITEM_GROUP));
		public static final Item WARM_TEA = new Item(new FabricItemSettings().group(ImFeelingLucky.ITEM_GROUP));
		public static final Item SWEET_WARM_TEA = new Item(new FabricItemSettings().group(ImFeelingLucky.ITEM_GROUP));
		public static final Item HOT_TEA = new Item(new FabricItemSettings().group(ImFeelingLucky.ITEM_GROUP));
		public static final Item SWEET_HOT_TEA = new Item(new FabricItemSettings().group(ImFeelingLucky.ITEM_GROUP));

	@Override
	public void onInitialize() {

		// Items
			// Tea
			Registry.register(Registry.ITEM, new Identifier("imfeelinglucky", "cold_tea"), COLD_TEA);
			Registry.register(Registry.ITEM, new Identifier("imfeelinglucky", "sweet_cold_tea"), SWEET_COLD_TEA);
			Registry.register(Registry.ITEM, new Identifier("imfeelinglucky", "cool_tea"), COOL_TEA);
			Registry.register(Registry.ITEM, new Identifier("imfeelinglucky", "sweet_cool_tea"), SWEET_COOL_TEA);
			Registry.register(Registry.ITEM, new Identifier("imfeelinglucky", "warm_tea"), WARM_TEA);
			Registry.register(Registry.ITEM, new Identifier("imfeelinglucky", "sweet_warm_tea"), SWEET_WARM_TEA);
			Registry.register(Registry.ITEM, new Identifier("imfeelinglucky", "hot_tea"), HOT_TEA);
			Registry.register(Registry.ITEM, new Identifier("imfeelinglucky", "sweet_hot_tea"), SWEET_HOT_TEA);

		System.out.println("I'm Feeling Lucky!");
	}
}


package net.mcreator.jessiejane.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.jessiejane.init.JessiejaneModFluids;

public class WaterItem extends BucketItem {
	public WaterItem() {
		super(JessiejaneModFluids.WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}

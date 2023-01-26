package thederpgamerx.astralspirits.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import thederpgamerx.astralspirits.AstralSpirits;
import thederpgamerx.astralspirits.block.BlockRegistry;

/**
 * [Description]
 *
 * @author TheDerpGamerX (TheDerpGamer#0027)
 */
public class ItemRegistry {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AstralSpirits.MODID);

	public static void initialize(IEventBus modEventBus) {
		for(RegistryObject<Block> block : BlockRegistry.BLOCKS.getEntries()) {
			if(block.get() instanceof IBlockItem blockItem) blockItem.registerBlockItem(ITEMS);
		}
		ITEMS.register(modEventBus);
	}
}

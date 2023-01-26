package thederpgamerx.astralspirits.block;

/**
 * [Description]
 *
 * @author TheDerpGamerX (TheDerpGamer#0027)
 */

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import thederpgamerx.astralspirits.item.IBlockItem;

public class SummoningAltar extends Block implements IBlockItem {

	public static final String NAME = "summoning_altar";

	public SummoningAltar() {
		super(BlockBehaviour.Properties.of(Material.STONE));
	}

	@Override
	public RegistryObject<Item> registerBlockItem(DeferredRegister<Item> itemRegistry) {
		return itemRegistry.register(NAME, () -> new BlockItem(BlockRegistry.SUMMONING_ALTAR.get(), new Item.Properties())); //Todo: Figure out tab stuff
	}
}

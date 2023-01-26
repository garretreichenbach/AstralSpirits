package thederpgamerx.astralspirits.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

/**
 * [Description]
 *
 * @author TheDerpGamer (TheDerpGamer#0027)
 */
public interface IBlockItem {

	RegistryObject<Item> registerBlockItem(DeferredRegister<Item> itemRegistry);
}

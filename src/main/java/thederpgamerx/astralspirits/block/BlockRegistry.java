package thederpgamerx.astralspirits.block;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import thederpgamerx.astralspirits.AstralSpirits;

/**
 * [Description]
 *
 * @author TheDerpGamerX (TheDerpGamer#0027)
 */
public class BlockRegistry {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AstralSpirits.MODID);
	public static final RegistryObject<Block> SUMMONING_ALTAR = BLOCKS.register(SummoningAltar.NAME, SummoningAltar::new);

	public static void initialize(IEventBus modEventBus) {
		BLOCKS.register(modEventBus);
	}
}

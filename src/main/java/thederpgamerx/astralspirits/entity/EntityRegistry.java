package thederpgamerx.astralspirits.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import thederpgamerx.astralspirits.AstralSpirits;

/**
 * [Description]
 *
 * @author TheDerpGamerX (TheDerpGamer#0027)
 */
public class EntityRegistry {

	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AstralSpirits.MODID);

	public static void initialize(IEventBus modEventBus) {
		ENTITIES.register(modEventBus);
	}
}
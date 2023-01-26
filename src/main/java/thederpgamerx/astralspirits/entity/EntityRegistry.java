package thederpgamerx.astralspirits.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import thederpgamerx.astralspirits.AstralSpirits;
import thederpgamerx.astralspirits.entity.spirit.TempestSpirit;

/**
 * [Description]
 *
 * @author TheDerpGamerX (TheDerpGamer#0027)
 */
public class EntityRegistry {

	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AstralSpirits.MODID);
	public static final RegistryObject<EntityType<TempestSpirit>> TRITON_SPIRIT = ENTITIES.register(TempestSpirit.NAME, () -> EntityType.Builder.of(TempestSpirit::new, MobCategory.CREATURE).sized(0.6F, 1.95F).build(TempestSpirit.NAME));

	public static void initialize(IEventBus modEventBus) {
		ENTITIES.register(modEventBus);
	}
}
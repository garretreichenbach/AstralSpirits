package thederpgamerx.astralspirits.entity.spirit;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

/**
 * [Description]
 *
 * @author TheDerpGamerX (TheDerpGamer#0027)
 */
public interface ISpirit {

	int MAX_SPIRIT_LEVEL = 100;

	boolean canTarget(LivingEntity livingEntity);

	String getOwner();
	boolean isFriend(Entity entity);
	boolean isEnemy(Entity entity);
	SpiritMode getMode();
	SpiritElement getElement();
}

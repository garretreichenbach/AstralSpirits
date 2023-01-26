package thederpgamerx.astralspirits.entity.spirit;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

/**
 * [Description]
 *
 * @author TheDerpGamerX (TheDerpGamer#0027)
 */
public class TempestSpirit extends Monster implements ISpirit, RangedAttackMob {

	public static final String NAME = "tempest_spirit";
	private final String owner;
	private SpiritMode mode;

	public TempestSpirit(EntityType<? extends Monster> entityType, Level level) {
		this(entityType, level, "none");
	}

	public TempestSpirit(EntityType<? extends Monster> entityType, Level level, String owner) {
		super(entityType, level);
		this.owner = owner;
	}

	@Override
	public void registerGoals() {
		targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, 10, true, false, this::canTarget));
		goalSelector.addGoal(7, new WaterAvoidingRandomStrollGoal(this, 1.0D));
		goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 8.0F));
		goalSelector.addGoal(8, new RandomLookAroundGoal(this));
	}

	@Override
	public void performRangedAttack(@NotNull LivingEntity entity, float f) {

	}

	@Override
	public boolean canTarget(LivingEntity livingEntity) {
		return owner.equals("none") || (!livingEntity.getName().getString().equals(owner) && !isAlliedTo(livingEntity));
	}

	@Override
	public String getOwner() {
		return owner;
	}

	@Override
	public boolean isAlliedTo(@NotNull Entity entity) {
		return super.isAlliedTo(entity) || isFriend(entity);
	}

	@Override
	public boolean isFriend(Entity entity) {
		switch(mode) {

		}
	}

	@Override
	public boolean isEnemy(Entity entity) {
		return false;
	}

	@Override
	public SpiritMode getMode() {
		return mode;
	}

	@Override
	public SpiritElement getElement() {
		return null;
	}
}

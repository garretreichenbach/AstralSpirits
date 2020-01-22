package thederpgamer.astralspirits.entity.spirit;

import net.minecraft.entity.ai.*;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.init.Biomes;
import net.minecraft.util.DamageSource;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class Triton extends AstralSpirit {

    public Triton(World world) {
        super(world);
        setRarity(3);
        setSpawnBiomes(new Biome[]{Biomes.BEACH, Biomes.OCEAN, Biomes.RIVER, Biomes.PLAINS, Biomes.SWAMPLAND});
        setHeight(2.0F);
        setWidth(0.7F);
        setMaxHealth(70.0D);
        setArmor(5.0D);
        setDisplayName("[AS-03] TRITON");
        applyEntityAttributes();
        setBossInfo(new BossInfoServer(this.getDisplayName(), BossInfo.Color.BLUE, BossInfo.Overlay.PROGRESS));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.5, true));
        this.tasks.addTask(3, new EntityAILeapAtTarget(this, (float) 2));
        this.tasks.addTask(4, new EntityAIBreakDoor(this));
        this.tasks.addTask(5, new EntityAIWander(this, 1));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.tasks.addTask(7, new EntityAISwimming(this));
    }

    @Override
    public void onStruckByLightning(EntityLightningBolt entityLightningBolt) {
        super.onStruckByLightning(entityLightningBolt);
        this.damageEntity(DamageSource.LIGHTNING_BOLT, 10.0F);
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        if (source == DamageSource.FALL)
            return false;
        if (source == DamageSource.DROWN)
            return false;
        return super.attackEntityFrom(source, amount);
    }

    @Override
    public boolean isNonBoss() {
        return false;
    }
}

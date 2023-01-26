package thederpgamer.astralspirits.entity.spirit;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import thederpgamer.astralspirits.entity.spirit.ability.SpiritAbility;

public class AstralSpirit extends EntityCreature {

    private float width; //Base Reference:0.7F
    private float height; //Base Reference:2.0F
    private double maxHealth; //Base Reference:70.0D
    private double armor; //Base Reference:5.0D
    private double attackDamage; //Base Reference:
    private double movementSpeed;
    private double followRange;
    private int experienceValue;
    private boolean isImmuneToFire = false;
    private boolean isImmuneToExplosions = false;
    private BossInfoServer bossInfo = null;
    private String displayName;
    private int rarity;
    private Biome[] spawnBiomes;
    private Class<? extends Entity> entity = this.getClass();

    private ElementType elementType;
    private SpiritAbility[] abilities = new SpiritAbility[4];


    public AstralSpirit(World worldIn) {
        super(worldIn);
        setSize(width, height);
    }

    public void init(FMLInitializationEvent event) {
        EntityRegistry.addSpawn(this.getClass(), rarity, 1, 1, EnumCreatureType.CREATURE, spawnBiomes);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(followRange);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(movementSpeed);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(attackDamage);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(armor);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(maxHealth);
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        //Prevents all Spirits from taking fall damage
        if (source == DamageSource.FALL)
            return false;
        return super.attackEntityFrom(source, amount);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
    }

    @Override
    public void onDeath(DamageSource source) {
        super.onDeath(source);
        int x = (int) this.posX;
        int y = (int) this.posY;
        int z = (int) this.posZ;
        Entity entity = this;
    }

    @Override
    protected Item getDropItem() {
        return null;
    }

    /* Sounds not implemented yet
    @Override
    public net.minecraft.util.SoundEvent getAmbientSound() {
        return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("sounds/spirit/ambientSound"));
    }

    @Override
    public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
        return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("sounds/spirit/hurtSound"));
    }

    @Override
    public net.minecraft.util.SoundEvent getDeathSound() {
        return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("sounds/spirit/deathSound"));
    }

    @Override
    protected float getSoundVolume() {
        return 1.0F;
    }
    */

    public Class<? extends Entity> getEntity() {
        return entity;
    }

    public void setSpawnBiomes(Biome[] biomes) {
        this.spawnBiomes = biomes;
    }

    public Biome[] getSpawnBiomes() {
        return spawnBiomes;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getRarity() {
        return rarity;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setBossInfo(BossInfoServer bossInfo) {
        this.bossInfo = bossInfo;
    }

    public int getExperienceValue() {
        return experienceValue;
    }

    public void setExperienceValue(int experienceValue) {
        this.experienceValue = experienceValue;
    }

    public void setImmuneToFire(boolean immuneToFire) {
        this.isImmuneToFire = immuneToFire;
    }

    public void setImmuneToExplosions(boolean immuneToExplosions) {
        this.isImmuneToExplosions = immuneToExplosions;
    }

    public ElementType getElementType() {
        return elementType;
    }

    public void setElementType(ElementType elementType) {
        this.elementType = elementType;
    }

    public BossInfoServer getBossInfo() {
        return bossInfo;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setMaxHealth(double maxHealth) {
        this.maxHealth = maxHealth;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public double getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public double getFollowRange() {
        return followRange;
    }

    public void setFollowRange(double followRange) {
        this.followRange = followRange;
    }
}

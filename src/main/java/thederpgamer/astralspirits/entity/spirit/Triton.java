package thederpgamer.astralspirits.entity.spirit;

import net.minecraft.world.World;

public class Triton extends AstralSpirit {

    public Triton(World worldIn) {
        super(worldIn);
        setHeight(2.0F);
        setWidth(0.75F);
        setMaxHealth(25.0D);
        setArmor(5.0D);
        applyEntityAttributes();
    }
}

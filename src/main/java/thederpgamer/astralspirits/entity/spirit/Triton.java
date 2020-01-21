package thederpgamer.astralspirits.entity.spirit;

import net.minecraft.world.World;

public class Triton extends AstralSpirit {

    public Triton(World worldIn) {
        super(worldIn);
        setMaxHealth(25.0D);
        
        applyEntityAttributes();
    }
}

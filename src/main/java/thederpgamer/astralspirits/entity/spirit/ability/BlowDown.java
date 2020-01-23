package thederpgamer.astralspirits.entity.spirit.ability;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import thederpgamer.astralspirits.entity.spirit.AstralSpirit;

public class BlowDown extends SpiritAbility {

    @Override
    public void activateAbility(AstralSpirit spirit, Entity target) {
        World world = spirit.getEntityWorld();
        spirit.setImmuneToExplosions(true);
        world.createExplosion(target, spirit.posX, spirit.posY, spirit.posZ, 3.0F, false);
        spirit.setImmuneToExplosions(false);
    }
}
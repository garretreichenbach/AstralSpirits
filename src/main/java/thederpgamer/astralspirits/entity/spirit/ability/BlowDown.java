package thederpgamer.astralspirits.entity.spirit.ability;

import net.minecraft.entity.Entity;
import thederpgamer.astralspirits.entity.spirit.AstralSpirit;

public class BlowDown extends SpiritAbility {

    @Override
    public void activateAbility(AstralSpirit spirit, Entity[] target) {
        spirit.setImmuneToExplosions(true);
        //TODO:Create explosion at spirit position
        spirit.setImmuneToExplosions(false);
    }
}

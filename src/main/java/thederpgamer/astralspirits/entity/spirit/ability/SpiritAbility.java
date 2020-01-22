package thederpgamer.astralspirits.entity.spirit.ability;

import net.minecraft.entity.Entity;
import thederpgamer.astralspirits.Global;
import thederpgamer.astralspirits.entity.spirit.AstralSpirit;
import thederpgamer.astralspirits.entity.spirit.ElementType;

public class SpiritAbility {

    private int energyCost;
    private Double cooldown;
    private ElementType elementType;

    public void activateAbility(AstralSpirit spirit, Entity[] target) {
    }

    public void registerAbility(SpiritAbility ability) {
        Global.abilities.add(this);
    }
}

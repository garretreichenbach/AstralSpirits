package thederpgamer.astralspirits;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import org.apache.logging.log4j.Logger;
import thederpgamer.astralspirits.entity.spirit.AstralSpirit;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main {
    public static final String MODID = "astralspirits";
    public static final String NAME = "Astral Spirits";
    public static final String VERSION = "0.1.0";
    public static final SimpleNetworkWrapper PACKET_HANDLER = NetworkRegistry.INSTANCE.newSimpleChannel("astralspirits");
    @SidedProxy(clientSide = "thederpgamer.astralspirits.ClientProxy", serverSide = "thederpgamer.astralspirits.ServerProxy")
    public static IProxy proxy;

    @Mod.Instance
    public static Main instance;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        registerEntities();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("Beginning Initialization...");
    }

    public void registerEntities() {
        for(AstralSpirit spirit : Global.spirits) {
            EntityRegistry.registerModEntity(new ResourceLocation(Main.MODID + ":" + spirit.getName()), spirit.getEntity(), spirit.getName(), spirit.getEntityId(), Main.instance, 5 , 1, true);
        }
    }
}
package thrivingandreviving.groups.team;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("deprecation")
@Mod(ThrivingAndReviving.MODID)
public class ThrivingAndReviving {
    public static final String MODID = "thrivingandreviving";
    public static final String NAME = "Thriving&Reviving";
    public static final String MC_VERSION = "1.15.2";
    public static final String MOD_VERSION = "1.0.0";
    public static final String VERSION = MC_VERSION + "-" + MOD_VERSION;

    private static ThrivingAndReviving INSTANCE;

    public final Logger Logger = LogManager.getLogger(ThrivingAndReviving.NAME);

    public ThrivingAndReviving() {
        INSTANCE = this;
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::setupClient);
        bus.addListener(this::setupServer);
    }

    public static ThrivingAndReviving getInstance() {
        return INSTANCE;
    }


    private void setup(final FMLCommonSetupEvent event) {
        Logger.info("Hello Minecraft!");
    }

    private void setupClient(final FMLClientSetupEvent event) {

    }

    private void setupServer(final FMLDedicatedServerSetupEvent event) {

    }
}

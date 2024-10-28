package org.hiedacamellia.durabilityball.fabric;

import org.hiedacamellia.durabilityball.DurabilityBall;
import net.fabricmc.api.ModInitializer;

public final class DurabilityBallFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        DurabilityBall.init();
    }
}

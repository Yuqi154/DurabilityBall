package org.hiedacamellia.durabilityball.neoforge;

import org.hiedacamellia.durabilityball.DurabilityBall;
import net.neoforged.fml.common.Mod;

@Mod(DurabilityBall.MOD_ID)
public final class DurabilityBallNeoForge {
    public DurabilityBallNeoForge() {
        // Run our common setup.
        DurabilityBall.init();
    }
}

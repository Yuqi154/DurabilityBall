package org.hiedacamellia.durabilityball.forge;

import org.hiedacamellia.durabilityball.DurabilityBall;
import net.minecraftforge.fml.common.Mod;
@Mod(DurabilityBall.MOD_ID)
public final class DurabilityBallForge {
    public DurabilityBallForge() {
        DurabilityBall.init();
    }
}

package org.hiedacamellia.durabilityball;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;

public final class DurabilityBall {
    public static final String MOD_ID = "durabilityball";

    public static void init() {
        AutoConfig.register(ClientConfig.class, Toml4jConfigSerializer::new);
    }
}

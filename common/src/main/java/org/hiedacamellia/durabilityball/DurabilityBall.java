package org.hiedacamellia.durabilityball;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class DurabilityBall {
    public static final String MOD_ID = "durabilityball";
    public static Logger LOGGER =  LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        AutoConfig.register(ClientConfig.class, Toml4jConfigSerializer::new);
    }
}

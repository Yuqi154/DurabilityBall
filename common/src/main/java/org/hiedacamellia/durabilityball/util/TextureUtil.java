package org.hiedacamellia.durabilityball.util;

import net.minecraft.resources.ResourceLocation;
import org.hiedacamellia.durabilityball.DurabilityBall;

public class TextureUtil {
    private static final ResourceLocation T1 = new ResourceLocation(DurabilityBall.MOD_ID, "textures/gui/en_animate/1.png");
    private static final ResourceLocation T2 = new ResourceLocation(DurabilityBall.MOD_ID, "textures/gui/en_animate/2.png");
    private static final ResourceLocation T3 = new ResourceLocation(DurabilityBall.MOD_ID, "textures/gui/en_animate/3.png");
    private static final ResourceLocation T4 = new ResourceLocation(DurabilityBall.MOD_ID, "textures/gui/en_animate/4.png");
    private static final ResourceLocation T5 = new ResourceLocation(DurabilityBall.MOD_ID, "textures/gui/en_animate/5.png");
    private static final ResourceLocation T6 = new ResourceLocation(DurabilityBall.MOD_ID, "textures/gui/en_animate/6.png");
    private static final ResourceLocation T7 = new ResourceLocation(DurabilityBall.MOD_ID, "textures/gui/en_animate/7.png");

    public static ResourceLocation getTexture(int i){
        switch (i){
            case 0:
                return T1;
            case 1:
                return T2;
            case 2:
                return T3;
            case 3:
                return T4;
            case 4:
                return T5;
            case 5:
                return T6;
            case 6:
                return T7;
            default:
                return T1;
        }
    }
}

package org.hiedacamellia.durabilityball;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = DurabilityBall.MOD_ID)
public class ClientConfig implements ConfigData {

    public Position position = Position.TOP_LEFT;
    @Comment
    public String position_comment = "The position of the durability ball.(TOP_LEFT,TOP_RIGHT,BOTTOM_LEFT,BOTTOM_RIGHT)";

    public enum Position {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

}
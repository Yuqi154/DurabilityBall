package org.hiedacamellia.durabilityball.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.item.ItemStack;
import org.hiedacamellia.durabilityball.util.BallRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiGraphics.class)
public class GuiMixin {

    @Redirect(method = "renderItemDecorations(Lnet/minecraft/client/gui/Font;Lnet/minecraft/world/item/ItemStack;IILjava/lang/String;)V",at = @At(value = "INVOKE",target = "Lnet/minecraft/world/item/ItemStack;isBarVisible()Z"))
    private boolean modifyDurabilityBarVisibility(ItemStack instance) {
        return false;
    }

    @Inject(method = "renderItemDecorations(Lnet/minecraft/client/gui/Font;Lnet/minecraft/world/item/ItemStack;IILjava/lang/String;)V",at = @At(value = "TAIL"))
    private void renderBall(Font font, ItemStack itemStack, int i, int j, String string, CallbackInfo ci){
        if (!itemStack.isEmpty() && itemStack.isBarVisible()) {
            BallRenderer.renderBall(itemStack,((GuiGraphics) (Object) this),i,j);
        }
    }


}

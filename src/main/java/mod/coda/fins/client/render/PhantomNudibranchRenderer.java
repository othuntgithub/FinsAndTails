package mod.coda.fins.client.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import mod.coda.fins.FinsAndTails;
import mod.coda.fins.client.model.PhantomNudibranchModel;
import mod.coda.fins.entity.PhantomNudibranchEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class PhantomNudibranchRenderer extends MobRenderer<PhantomNudibranchEntity, PhantomNudibranchModel<PhantomNudibranchEntity>> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(FinsAndTails.MOD_ID, "textures/entity/phantom_nudibranch.png");

    public PhantomNudibranchRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new PhantomNudibranchModel<>(), 0.2F);
        this.addLayer(new PhantomNudibranchGlowLayer(this));
    }

    public ResourceLocation getEntityTexture(PhantomNudibranchEntity entity) {
        return TEXTURE;
    }
}
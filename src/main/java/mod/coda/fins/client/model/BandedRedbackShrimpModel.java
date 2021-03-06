package mod.coda.fins.client.model;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BandedRedbackShrimpModel<T extends Entity> extends EntityModel<T> {
    public ModelRenderer body;
    public ModelRenderer rostrum;
    public ModelRenderer tail;
    public ModelRenderer antennaright;
    public ModelRenderer antennaleft;
    public ModelRenderer legs1;
    public ModelRenderer legs2;
    public ModelRenderer legs3;
    public ModelRenderer legs4;
    public ModelRenderer finRight;
    public ModelRenderer finLeft;
    public ModelRenderer tailfan;

    public BandedRedbackShrimpModel() {
        this.textureWidth = 34;
        this.textureHeight = 22;
        this.rostrum = new ModelRenderer(this, 0, 9);
        this.rostrum.setRotationPoint(0.0F, -1.0F, -2.5F);
        this.rostrum.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.antennaright = new ModelRenderer(this, 0, 7);
        this.antennaright.setRotationPoint(-0.5F, -1.0F, -2.5F);
        this.antennaright.addBox(0.0F, -3.5F, -6.0F, 0.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(antennaright, 0.0F, 0.17453292519943295F, 0.0F);
        this.finRight = new ModelRenderer(this, 7, 9);
        this.finRight.mirror = true;
        this.finRight.setRotationPoint(1.5F, -0.5F, 0.0F);
        this.finRight.addBox(0.0F, -0.5F, -1.5F, 3.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.legs1 = new ModelRenderer(this, 26, 0);
        this.legs1.setRotationPoint(0.0F, 1.5F, -1.0F);
        this.legs1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.tail = new ModelRenderer(this, 17, 0);
        this.tail.setRotationPoint(0.0F, -0.5F, 2.5F);
        this.tail.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.legs2 = new ModelRenderer(this, 0, 0);
        this.legs2.mirror = true;
        this.legs2.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.legs2.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.legs4 = new ModelRenderer(this, 0, 0);
        this.legs4.mirror = true;
        this.legs4.setRotationPoint(0.0F, 1.5F, 2.0F);
        this.legs4.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.tailfan = new ModelRenderer(this, 9, 0);
        this.tailfan.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tailfan.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.legs3 = new ModelRenderer(this, 0, 0);
        this.legs3.mirror = true;
        this.legs3.setRotationPoint(0.0F, 1.5F, 1.0F);
        this.legs3.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.antennaleft = new ModelRenderer(this, 0, 7);
        this.antennaleft.mirror = true;
        this.antennaleft.setRotationPoint(0.5F, -1.0F, -2.5F);
        this.antennaleft.addBox(0.0F, -3.5F, -6.0F, 0.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(antennaleft, 0.0F, -0.17453292519943295F, 0.0F);
        this.finLeft = new ModelRenderer(this, 7, 9);
        this.finLeft.setRotationPoint(-1.5F, -0.5F, 0.0F);
        this.finLeft.addBox(-3.0F, -0.5F, -1.5F, 3.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 1, 0);
        this.body.setRotationPoint(0.0F, 21.5F, 0.0F);
        this.body.addBox(-1.5F, -1.5F, -2.5F, 3.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.body.addChild(this.rostrum);
        this.body.addChild(this.antennaright);
        this.body.addChild(this.finRight);
        this.body.addChild(this.legs1);
        this.body.addChild(this.tail);
        this.body.addChild(this.legs2);
        this.body.addChild(this.legs4);
        this.tail.addChild(this.tailfan);
        this.body.addChild(this.legs3);
        this.body.addChild(this.antennaleft);
        this.body.addChild(this.finLeft);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) { 
        ImmutableList.of(this.body).forEach((modelRenderer) -> { 
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    @Override
    public void setRotationAngles(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed = 4.0f;
        float degree = 1.0f;
        this.tail.rotateAngleX = MathHelper.cos(f * speed * 0.2F) * degree * 0.3F * f1 - 0.1F;
        this.tailfan.rotateAngleX = MathHelper.cos(f * speed * 0.2F) * degree * 0.9F * f1;
        this.finRight.rotateAngleZ = MathHelper.cos(f * speed * 0.4F) * degree * 0.7F * f1;
        this.finLeft.rotateAngleZ = MathHelper.cos(f * speed * 0.4F) * degree * -0.7F * f1;
        this.legs1.rotateAngleX = MathHelper.cos(1.0F + f * speed * 0.5F) * degree * 0.8F * f1;
        this.legs2.rotateAngleX = MathHelper.cos(0.5F + f * speed * 0.5F) * degree * 0.8F * f1;
        this.legs3.rotateAngleX = MathHelper.cos(f * speed * 0.5F) * degree * 0.4F * f1;
        this.legs4.rotateAngleX = MathHelper.cos(0.5F + f * speed * 0.5F) * degree * 0.8F * f1;
        this.antennaleft.rotateAngleX = MathHelper.cos(f * speed * 0.2F) * degree * 0.6F * f1 - 0.1F;
        this.antennaright.rotateAngleX = MathHelper.cos(f * speed * 0.2F) * degree * 0.6F * f1 - 0.1F;

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

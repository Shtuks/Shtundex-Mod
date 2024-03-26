package shtundex.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelbanana<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("shtundex", "modelbanana"), "main");
	public final ModelPart body;
	public final ModelPart legL;
	public final ModelPart legR2;

	public Modelbanana(ModelPart root) {
		this.body = root.getChild("body");
		this.legL = root.getChild("legL");
		this.legR2 = root.getChild("legR2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 11).addBox(-11.5F, -27.0F, 3.0F, 7.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 24.0F, 8.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 31).addBox(-11.0F, -17.0F, -7.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 31).addBox(-11.0F, -30.0F, -14.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 7.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-12.5F, -21.0F, 5.0F, 9.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 7.0F, 0.3927F, -0.0436F, 0.0F));
		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(32, 13).addBox(-10.0F, -17.0F, -1.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 7.0F, -0.1745F, 0.0F, 0.0436F));
		PartDefinition bone2 = body.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(36, 2).addBox(-2.0F, -33.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(31, 46).addBox(-3.0F, -28.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0F, -9.0F, 23.0F, 0.829F, -0.3491F, 0.0F));
		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(38, 31).addBox(2.5F, -21.0F, 4.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 39).addBox(-20.5F, -15.0F, 4.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition legL = partdefinition.addOrReplaceChild("legL", CubeListBuilder.create().texOffs(15, 15).addBox(1.0F, 6.0F, -4.0F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(22, 24)
				.addBox(1.0F, 5.0F, -4.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(16, 40).addBox(2.0F, -7.0F, -2.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 16.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition legR2 = partdefinition.addOrReplaceChild("legR2", CubeListBuilder.create().texOffs(19, 4).addBox(-6.0F, -2.0F, -4.0F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
				.addBox(-6.0F, -3.0F, -4.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(8, 39).addBox(-4.0F, -15.0F, -2.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legR2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.legL.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legR2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}

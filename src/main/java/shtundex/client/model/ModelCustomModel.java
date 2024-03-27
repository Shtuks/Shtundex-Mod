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
public class ModelCustomModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("shtundex", "model_custom_model"), "main");
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;

	public ModelCustomModel(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(15, 31).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition vorotnik = Body.addOrReplaceChild("vorotnik", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = vorotnik.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 57).addBox(-5.0F, -6.0F, 2.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.48F, -0.4363F, 0.0F));
		PartDefinition cube_r2 = vorotnik.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 57).addBox(1.0F, -6.0F, 2.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.48F, 0.3491F, 0.0F));
		PartDefinition cube_r3 = vorotnik.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 57).addBox(-3.0F, -6.0F, 1.5F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition naplechi = Body.addOrReplaceChild("naplechi", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r4 = naplechi.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(31, 21).addBox(-8.0F, -2.5F, -1.5F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.2182F));
		PartDefinition cube_r5 = naplechi.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 36).addBox(3.0F, -2.5F, -1.5F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, -0.1309F));
		PartDefinition wings = Body.addOrReplaceChild("wings", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone = wings.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(56, 61).addBox(-12.0F, -17.5F, 4.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(56, 61)
				.addBox(-8.0F, -18.0F, 4.0F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(56, 61).addBox(-16.0F, -17.0F, 4.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(2.0F, 24.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bone5 = wings.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(56, 61).addBox(-12.0F, -17.5F, 4.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(56, 61)
				.addBox(-8.0F, -18.0F, 4.0F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(56, 61).addBox(-16.0F, -17.0F, 4.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(1.0F, 21.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition bone4 = wings.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(56, 3).addBox(-12.0F, -17.5F, 4.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(56, 0)
				.addBox(-8.0F, -18.0F, 4.0F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(56, 15).addBox(-16.0F, -17.0F, 4.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 19.0F, 8.0F, 0.0F, 3.1416F, -0.1309F));
		PartDefinition bone6 = wings.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(56, 61).addBox(-12.0F, -17.5F, 4.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(56, 61)
				.addBox(-8.0F, -18.0F, 4.0F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(56, 61).addBox(-16.0F, -17.0F, 4.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 22.0F, 8.0F, 0.0F, 3.1416F, -0.0436F));
		PartDefinition bone2 = wings.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(56, 61).addBox(-8.0F, -23.0F, 4.0F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(56, 61)
				.addBox(-12.0F, -22.5F, 4.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(56, 61).addBox(-16.0F, -22.0F, 4.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-1.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition bone3 = wings.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(56, 61).addBox(-12.0F, -17.5F, 4.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(56, 61)
				.addBox(-8.0F, -18.0F, 4.0F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(56, 61).addBox(-16.0F, -17.0F, 4.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-3.0F, 25.0F, 8.0F, 0.0F, 3.1416F, 0.1309F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition RightArmLayer_r1 = RightArm.addOrReplaceChild("RightArmLayer_r1", CubeListBuilder.create().texOffs(32, 48).addBox(-12.0F, -22.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(5.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition LeftArmLayer_r1 = LeftArm.addOrReplaceChild("LeftArmLayer_r1", CubeListBuilder.create().texOffs(16, 48).addBox(8.0F, -22.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}

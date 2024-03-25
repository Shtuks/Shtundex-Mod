
package shtundex.client.renderer;

import shtundex.entity.ShtuxibusEXEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

public class ShtuxibusEXRenderer extends HumanoidMobRenderer<ShtuxibusEXEntity, HumanoidModel<ShtuxibusEXEntity>> {
	public ShtuxibusEXRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(ShtuxibusEXEntity entity) {
		return new ResourceLocation("shtundex:textures/entities/detective_conan.png");
	}
}

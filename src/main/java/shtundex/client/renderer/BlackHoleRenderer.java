
package shtundex.client.renderer;

import shtundex.entity.BlackHoleEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

public class BlackHoleRenderer extends MobRenderer<BlackHoleEntity, ChickenModel<BlackHoleEntity>> {
	public BlackHoleRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlackHoleEntity entity) {
		return new ResourceLocation("shtundex:textures/entities/220px-white-noise-mv255-240x180.png");
	}
}

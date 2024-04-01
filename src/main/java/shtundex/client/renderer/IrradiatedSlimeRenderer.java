
package shtundex.client.renderer;

import shtundex.entity.IrradiatedSlimeEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

public class IrradiatedSlimeRenderer extends MobRenderer<IrradiatedSlimeEntity, SlimeModel<IrradiatedSlimeEntity>> {
	public IrradiatedSlimeRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(IrradiatedSlimeEntity entity) {
		return new ResourceLocation("shtundex:textures/entities/mass.png");
	}

	@Override
	protected boolean isShaking(IrradiatedSlimeEntity entity) {
		return true;
	}
}


package shtundex.client.renderer;

import shtundex.entity.ChtuxlagorEntity;

import shtundex.client.model.ModelChtuxlagorMantle;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ChtuxlagorRenderer extends MobRenderer<ChtuxlagorEntity, ModelChtuxlagorMantle<ChtuxlagorEntity>> {
	public ChtuxlagorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelChtuxlagorMantle(context.bakeLayer(ModelChtuxlagorMantle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChtuxlagorEntity entity) {
		return new ResourceLocation("shtundex:textures/entities/chtuxlagor.png");
	}
}

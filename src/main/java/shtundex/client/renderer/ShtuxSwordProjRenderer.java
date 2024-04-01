
package shtundex.client.renderer;

import shtundex.entity.ShtuxSwordProjEntity;

import shtundex.client.model.Modelmodel_Converted;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ShtuxSwordProjRenderer extends MobRenderer<ShtuxSwordProjEntity, Modelmodel_Converted<ShtuxSwordProjEntity>> {
	public ShtuxSwordProjRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmodel_Converted(context.bakeLayer(Modelmodel_Converted.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShtuxSwordProjEntity entity) {
		return new ResourceLocation("shtundex:textures/entities/blade.png");
	}
}

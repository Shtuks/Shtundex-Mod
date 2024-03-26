
package shtundex.client.renderer;

import shtundex.entity.TestBananaEntity;

import shtundex.client.model.Modelbanana;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class TestBananaRenderer extends MobRenderer<TestBananaEntity, Modelbanana<TestBananaEntity>> {
	public TestBananaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbanana(context.bakeLayer(Modelbanana.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TestBananaEntity entity) {
		return new ResourceLocation("shtundex:textures/entities/banana.png");
	}
}

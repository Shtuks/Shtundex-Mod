
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package shtundex.init;

import shtundex.client.model.Modelmodel_Converted;
import shtundex.client.model.Modelbanana;
import shtundex.client.model.ModelCustomModel;
import shtundex.client.model.ModelChtuxlagorMantle;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ShtundexModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelbanana.LAYER_LOCATION, Modelbanana::createBodyLayer);
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
		event.registerLayerDefinition(ModelChtuxlagorMantle.LAYER_LOCATION, ModelChtuxlagorMantle::createBodyLayer);
		event.registerLayerDefinition(Modelmodel_Converted.LAYER_LOCATION, Modelmodel_Converted::createBodyLayer);
	}
}

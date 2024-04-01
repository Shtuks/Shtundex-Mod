
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package shtundex.init;

import shtundex.entity.VampireEntity;
import shtundex.entity.TestBananaEntity;
import shtundex.entity.ShtuxibusProjectileEntity;
import shtundex.entity.ShtuxibusEXEntity;
import shtundex.entity.ShtuxianColiderEntity;
import shtundex.entity.ShtuxSwordProjEntity;
import shtundex.entity.ShtukEntity;
import shtundex.entity.ShtQ7V3Entity;
import shtundex.entity.ShtPrigaiteEntity;
import shtundex.entity.IrradiatedSlimeEntity;
import shtundex.entity.HumanEntity;
import shtundex.entity.DrShtuxibusRematchEntity;
import shtundex.entity.DrShtuxibusEntity;
import shtundex.entity.DrShtuxibus2Entity;
import shtundex.entity.ChtuxlagorEntity;
import shtundex.entity.BlasterProjEntity;
import shtundex.entity.BlackHoleEntity;

import shtundex.ShtundexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShtundexModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ShtundexMod.MODID);
	public static final RegistryObject<EntityType<DrShtuxibusEntity>> DR_SHTUXIBUS = register("dr_shtuxibus", EntityType.Builder.<DrShtuxibusEntity>of(DrShtuxibusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(DrShtuxibusEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShtuxianColiderEntity>> SHTUXIAN_COLIDER = register("projectile_shtuxian_colider", EntityType.Builder.<ShtuxianColiderEntity>of(ShtuxianColiderEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ShtuxianColiderEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShtuxibusEXEntity>> SHTUXIBUS_EX = register("shtuxibus_ex", EntityType.Builder.<ShtuxibusEXEntity>of(ShtuxibusEXEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(ShtuxibusEXEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlasterProjEntity>> BLASTER_PROJ = register("projectile_blaster_proj",
			EntityType.Builder.<BlasterProjEntity>of(BlasterProjEntity::new, MobCategory.MISC).setCustomClientFactory(BlasterProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShtQ7V3Entity>> SHT_Q_7_V_3 = register("sht_q_7_v_3",
			EntityType.Builder.<ShtQ7V3Entity>of(ShtQ7V3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(ShtQ7V3Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShtuxibusProjectileEntity>> SHTUXIBUS_PROJECTILE = register("projectile_shtuxibus_projectile", EntityType.Builder.<ShtuxibusProjectileEntity>of(ShtuxibusProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ShtuxibusProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShtPrigaiteEntity>> SHT_PRIGAITE = register("sht_prigaite", EntityType.Builder.<ShtPrigaiteEntity>of(ShtPrigaiteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(ShtPrigaiteEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlackHoleEntity>> BLACK_HOLE = register("black_hole", EntityType.Builder.<BlackHoleEntity>of(BlackHoleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128)
			.setUpdateInterval(3).setCustomClientFactory(BlackHoleEntity::new).fireImmune().sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<DrShtuxibusRematchEntity>> DR_SHTUXIBUS_REMATCH = register("dr_shtuxibus_rematch", EntityType.Builder.<DrShtuxibusRematchEntity>of(DrShtuxibusRematchEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(DrShtuxibusRematchEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DrShtuxibus2Entity>> DR_SHTUXIBUS_2 = register("dr_shtuxibus_2", EntityType.Builder.<DrShtuxibus2Entity>of(DrShtuxibus2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(DrShtuxibus2Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TestBananaEntity>> TEST_BANANA = register("test_banana",
			EntityType.Builder.<TestBananaEntity>of(TestBananaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TestBananaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ChtuxlagorEntity>> CHTUXLAGOR = register("chtuxlagor", EntityType.Builder.<ChtuxlagorEntity>of(ChtuxlagorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(ChtuxlagorEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VampireEntity>> VAMPIRE = register("vampire",
			EntityType.Builder.<VampireEntity>of(VampireEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(VampireEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HumanEntity>> HUMAN = register("human",
			EntityType.Builder.<HumanEntity>of(HumanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HumanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShtukEntity>> SHTUK = register("shtuk",
			EntityType.Builder.<ShtukEntity>of(ShtukEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShtukEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShtuxSwordProjEntity>> SHTUX_SWORD_PROJ = register("shtux_sword_proj", EntityType.Builder.<ShtuxSwordProjEntity>of(ShtuxSwordProjEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShtuxSwordProjEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<IrradiatedSlimeEntity>> IRRADIATED_SLIME = register("irradiated_slime",
			EntityType.Builder.<IrradiatedSlimeEntity>of(IrradiatedSlimeEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(IrradiatedSlimeEntity::new)

					.sized(1f, 1f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DrShtuxibusEntity.init();
			ShtuxibusEXEntity.init();
			ShtQ7V3Entity.init();
			ShtPrigaiteEntity.init();
			BlackHoleEntity.init();
			DrShtuxibusRematchEntity.init();
			DrShtuxibus2Entity.init();
			TestBananaEntity.init();
			ChtuxlagorEntity.init();
			VampireEntity.init();
			HumanEntity.init();
			ShtukEntity.init();
			ShtuxSwordProjEntity.init();
			IrradiatedSlimeEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DR_SHTUXIBUS.get(), DrShtuxibusEntity.createAttributes().build());
		event.put(SHTUXIBUS_EX.get(), ShtuxibusEXEntity.createAttributes().build());
		event.put(SHT_Q_7_V_3.get(), ShtQ7V3Entity.createAttributes().build());
		event.put(SHT_PRIGAITE.get(), ShtPrigaiteEntity.createAttributes().build());
		event.put(BLACK_HOLE.get(), BlackHoleEntity.createAttributes().build());
		event.put(DR_SHTUXIBUS_REMATCH.get(), DrShtuxibusRematchEntity.createAttributes().build());
		event.put(DR_SHTUXIBUS_2.get(), DrShtuxibus2Entity.createAttributes().build());
		event.put(TEST_BANANA.get(), TestBananaEntity.createAttributes().build());
		event.put(CHTUXLAGOR.get(), ChtuxlagorEntity.createAttributes().build());
		event.put(VAMPIRE.get(), VampireEntity.createAttributes().build());
		event.put(HUMAN.get(), HumanEntity.createAttributes().build());
		event.put(SHTUK.get(), ShtukEntity.createAttributes().build());
		event.put(SHTUX_SWORD_PROJ.get(), ShtuxSwordProjEntity.createAttributes().build());
		event.put(IRRADIATED_SLIME.get(), IrradiatedSlimeEntity.createAttributes().build());
	}
}

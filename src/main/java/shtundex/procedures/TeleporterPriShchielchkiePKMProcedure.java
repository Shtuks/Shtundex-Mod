package shtundex.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

public class TeleporterPriShchielchkiePKMProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getBoolean("cantp") == true) {
			{
				Entity _ent = entity;
				_ent.teleportTo((itemstack.getOrCreateTag().getDouble("x")), (itemstack.getOrCreateTag().getDouble("y")), (itemstack.getOrCreateTag().getDouble("z")));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((itemstack.getOrCreateTag().getDouble("x")), (itemstack.getOrCreateTag().getDouble("y")), (itemstack.getOrCreateTag().getDouble("z")), _ent.getYRot(), _ent.getXRot());
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 10, 3, 3, 3, 1);
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(1, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
		}
	}
}

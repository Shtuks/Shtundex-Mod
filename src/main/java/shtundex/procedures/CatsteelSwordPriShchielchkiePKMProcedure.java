package shtundex.procedures;

import shtundex.init.ShtundexModEntities;

import shtundex.entity.ShtuxianColiderEntity;

import shtundex.ShtundexMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;

public class CatsteelSwordPriShchielchkiePKMProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25, 0.05, 0.25));
		ShtundexMod.queueServerWork(5, () -> {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		});
		ShtundexMod.queueServerWork(5, () -> {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		});
		ShtundexMod.queueServerWork(5, () -> {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		});
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, float damage, int knockback) {
					AbstractArrow entityToSpawn = new ShtuxianColiderEntity(ShtundexModEntities.SHTUXIAN_COLIDER.get(), level);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.setSecondsOnFire(100);
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, 5, 1);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(1, 1, 1, 6, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
	}
}

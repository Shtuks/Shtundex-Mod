package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import shtundex.init.ShtundexModItems;
import shtundex.init.ShtundexModBlocks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class DrShtuxibusUsloviieGienieratsiiSushchnostiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double enchant_levels = 0;
		ItemStack emeralds = ItemStack.EMPTY;
		ItemStack tool = ItemStack.EMPTY;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ShtundexModBlocks.BOSS_ALTAR.get()) {
			ShtundexModVariables.WorldVariables.get(world).bossalife = true;
			ShtundexModVariables.WorldVariables.get(world).syncData(world);
			ShtundexModVariables.WorldVariables.get(world).shtuxPhase3LAST = false;
			ShtundexModVariables.WorldVariables.get(world).syncData(world);
			ShtundexModVariables.MapVariables.get(world).finale = false;
			ShtundexModVariables.MapVariables.get(world).syncData(world);
			ShtundexModVariables.WorldVariables.get(world).shtuxhealed = false;
			ShtundexModVariables.WorldVariables.get(world).syncData(world);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Shtuxibus> Hm? Finaly we met. You slain everything on your path... You no diffrent from me."), false);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Shtuxibus> Burn in flames in shtuxian abyss!"), false);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"title @a title {\"text\":\"GOD OF CATS\",\"bold\":true}");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"title @a subtitle {\"text\":\"SHTUXIBUS\",\"color\":\"red\",\"italic\":true}");
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
				_level.addFreshEntity(entityToSpawn);
			}
			BorderingProcedure.execute(world, x, y, z);
			Bordering2Procedure.execute(world, x, y, z);
			Bordering3Procedure.execute(world, x, y, z);
			BorderingUpProcedure.execute(world, x, y, z);
			BorderingUp2Procedure.execute(world, x, y, z);
			BorderingUp3Procedure.execute(world, x, y, z);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 1), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"summon shtundex:dr_shtuxibus");
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ShtundexModItems.SHTUXIAN_CURSE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}

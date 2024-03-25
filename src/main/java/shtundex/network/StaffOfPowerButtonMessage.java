
package shtundex.network;

import shtundex.world.inventory.StaffOfPowerMenu;

import shtundex.procedures.GodmodeProcedure;
import shtundex.procedures.Gm1butinProcedure;
import shtundex.procedures.Gm0butinProcedure;
import shtundex.procedures.FlightPriNalozhieniiEffiektaProcedure;

import shtundex.ShtundexMod;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StaffOfPowerButtonMessage {
	private final int buttonID, x, y, z;

	public StaffOfPowerButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public StaffOfPowerButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(StaffOfPowerButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(StaffOfPowerButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = StaffOfPowerMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			Gm1butinProcedure.execute(world, x, y, z);
		}
		if (buttonID == 1) {

			Gm0butinProcedure.execute(world, x, y, z);
		}
		if (buttonID == 3) {

			GodmodeProcedure.execute(entity);
		}
		if (buttonID == 5) {

			FlightPriNalozhieniiEffiektaProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ShtundexMod.addNetworkMessage(StaffOfPowerButtonMessage.class, StaffOfPowerButtonMessage::buffer, StaffOfPowerButtonMessage::new, StaffOfPowerButtonMessage::handler);
	}
}

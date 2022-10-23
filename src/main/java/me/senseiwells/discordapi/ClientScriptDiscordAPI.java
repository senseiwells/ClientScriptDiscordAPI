package me.senseiwells.discordapi;

import me.senseiwells.arucas.discord.DiscordAPI;
import me.senseiwells.essentialclient.clientscript.core.ClientScriptInstance;
import net.fabricmc.api.ModInitializer;

public class ClientScriptDiscordAPI implements ModInitializer {
	@Override
	public void onInitialize() {
		ClientScriptInstance.addApi(DiscordAPI::addDiscordAPI);
	}
}

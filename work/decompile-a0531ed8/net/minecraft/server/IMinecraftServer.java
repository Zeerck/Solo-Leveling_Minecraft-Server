package net.minecraft.server;

import net.minecraft.server.dedicated.DedicatedServerProperties;

public interface IMinecraftServer extends ServerInfo {

    DedicatedServerProperties getProperties();

    String getServerIp();

    int getServerPort();

    String getServerName();

    String[] getPlayerNames();

    String getLevelIdName();

    String getPluginNames();

    String runCommand(String s);
}

package com.generalbug;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//https://docs.fabricmc.net/1.20.4/develop/getting-started/introduction-to-fabric-and-modding
public class SimpleIngotCasting implements ModInitializer
{
	public static final String MOD_ID = "simple-ingot-casting";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		LOGGER.info(MOD_ID + " is initialising :)");
		ModItems.initialize();
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.


	}
}
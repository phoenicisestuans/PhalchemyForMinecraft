package net.phoenicis.phalc;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.phoenicis.phalc.registery.PhalcItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PhalchemyForMinecraft implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("phalc");
	public static final String MOD_ID = "phalc";
	public static final ItemGroup PHALC_STAFFS = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "staffs"),
			() -> new ItemStack(PhalcItems.PHALCHEMY_STAFF));


	@Override
	public void onInitialize() {


		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		PhalcItems.registerStaffs();
		LOGGER.info("Build Successful");
	}
}

package com.hypetrainstudios.dontstopthebeat.handlers;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class AssetHandler {
	public static final AssetManager manager = new AssetManager();
	public static final AssetDescriptor<TextureAtlas> atlasBeats = new AssetDescriptor<TextureAtlas>("beats.pack", TextureAtlas.class);
	
	public static void load() {
		manager.load(atlasBeats);
	}
	public static void dispose() {
		manager.dispose();
	}
}

package com.hypetrainstudios.dontstopthebeat.entities;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.hypetrainstudios.dontstopthebeat.handlers.AssetHandler;

public class Beat extends Entity{
	public Beat(float x, float y) {
		this.image = new Sprite(AssetHandler.manager.get(AssetHandler.atlasBeats).findRegion("beat.png"));
		this.x = x;
		this.y = y;
		this.image.setCenter(this.x, this.y);
	}
	public void collisionWithCenter() {
		deactivate();
	}
}

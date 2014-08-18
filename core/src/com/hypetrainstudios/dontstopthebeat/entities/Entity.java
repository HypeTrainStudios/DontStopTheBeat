package com.hypetrainstudios.dontstopthebeat.entities;

import com.badlogic.gdx.graphics.g2d.Sprite;

public class Entity {
	protected Sprite image;
	protected float x;
	protected float y;
	protected boolean active;
	
	public Entity() {
		this.image = null;
		this.x = 0;
		this.y = 0;
		this.active = true;
	}
	public Entity(Sprite image, float x, float y) {
		this.image=image;
		this.x=x;
		this.y=y;
		this.active = true;
	}
	public void deactivate() {
		this.active = false;
	}
	public Sprite getSprite() {
		return this.image;
	}
}

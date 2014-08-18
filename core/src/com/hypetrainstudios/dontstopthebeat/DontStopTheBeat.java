package com.hypetrainstudios.dontstopthebeat;

import java.util.ArrayList;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.hypetrainstudios.dontstopthebeat.entities.Beat;
import com.hypetrainstudios.dontstopthebeat.entities.BeatCatcher;
import com.hypetrainstudios.dontstopthebeat.entities.BeatMeter;
import com.hypetrainstudios.dontstopthebeat.entities.TopBeat;
import com.hypetrainstudios.dontstopthebeat.handlers.AssetHandler;
import com.hypetrainstudios.dontstopthebeat.screens.GameScreen;

public class DontStopTheBeat extends Game{
	private Screen gameScreen;
	
	public static OrthographicCamera cam;
	public static SpriteBatch batch;
	public static BeatCatcher beatCatcher;
	public static BeatMeter beatMeter;
	public static ArrayList<Beat> beats;
	public static boolean running;
	
	@Override
	public void create() {
		//loads assets to a queue
		AssetHandler.load();
		//loads queue to ram
		AssetHandler.manager.finishLoading();
		//creates the main menu for the game
		gameScreen = new GameScreen();
		running = true;
		initialize();
		
		setScreen(gameScreen);
		
	}
	public static void initialize() {
		cam = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		cam.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		cam.update();
		batch = new SpriteBatch();
		batch.setProjectionMatrix(cam.combined);
		beats = new ArrayList<Beat>();
		beatCatcher = new BeatCatcher();
		beatMeter = new BeatMeter();
	}
	public static void createTopBeat(float duration, float x, float y) {
		beats.add(new TopBeat());
	}
	public static void createBottomBeat(float duration, float x, float y) {
		
	}
	public static void createLeftBeat(float duration, float x, float y) {
		
	}
	public static void createRightBeat(float duration, float x, float y) {
		
	}
	public static void reset() {
		beats.clear();
		beatCatcher = new BeatCatcher();
		beatMeter = new BeatMeter();
	}
}	

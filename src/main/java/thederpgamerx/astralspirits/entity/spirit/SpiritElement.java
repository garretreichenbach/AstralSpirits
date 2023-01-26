package thederpgamerx.astralspirits.entity.spirit;

import java.awt.*;

/**
 * [Description]
 *
 * @author TheDerpGamerX (TheDerpGamer#0027)
 */
public enum SpiritElement {
	//Have to put manual int IDs because enums are cringe
	WIND("Wind", "The spirit is made of wind.", Color.LIGHT_GRAY, new int[] {2, 6}, new int[] {1, 3}), //Weak to Metal and Light, Strong against Earth and Fire
	EARTH("Earth", "The spirit is made of earth.", Color.GREEN, new int[] {0, 4}, new int[] {3, 6}), //Weak to Wind and Water, Strong against Fire and Light
	METAL("Metal", "The spirit is made of metal.", Color.GRAY, new int[] {3, 4}, new int[] {5, 7}), //Weak to Fire and Water, Strong against Ice and Dark
	FIRE("Fire", "The spirit is made of fire.", Color.RED,), //Weak to Wind and Water, Strong against Light and Metal
	WATER("Water", "The spirit is made of water."), //Weak to Ice and Dark, Strong against Earth and Fire
	ICE("Ice", "The spirit is made of ice."), //Weak to Earth and Fire, Strong against
	LIGHT("Light", "The spirit is made of light.", Color.YELLOW, new int[] {}, new int[] {}), //Weak to Earth and Fire, Strong against Wind and Dark
	DARK("Dark", "The spirit is made of darkness."); //Weak to Metal and Light, Strong against Water and

	public static final int WIND_ID = 0;
	public static final int EARTH_ID = 1;
	public static final int METAL_ID = 2;
	public static final int FIRE_ID = 3;
	public static final int WATER_ID = 4;
	public static final int ICE_ID = 5;
	public static final int LIGHT_ID = 6;
	public static final int DARK_ID = 7;

	public final String name;
	public final String description;
	public final Color color;
	public final int[] weaknesses;
	public final int[] strengths;

	SpiritElement(String name, String description, Color color, int[] weaknesses, int[] strengths) {
		this.name = name;
		this.description = description;
		this.color = color;
		this.weaknesses = weaknesses;
		this.strengths = strengths;
	}
}

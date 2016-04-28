package pl.tomaja.naukaGradle.test;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;

import pl.tomaja.naukaGradle.Color;
import pl.tomaja.naukaGradle.Light;

/**
 * @author Adam Tomaja
 */
public class LightTest {

	private final Gson GSON = new Gson();
	private final String WHITE_JSON = GSON.toJson(Color.WHITE);
	
	private Light light;
	
	@Before
	public void init() {
		light = new Light();
	}
	
	@Test
	public void shouldBeTurnedOffAtInit() {
		Assert.assertFalse(light.isTurnedOn());
	}
	
	@Test
	public void shouldBeTurnedOn() {
		light.turnOn();
		Assert.assertTrue(light.isTurnedOn());
	}
	
	@Test
	public void shouldBeTurnedOff() {
		light.turnOn();
		light.turnOff();
		Assert.assertFalse(light.isTurnedOn());
	}
	
	@Test
	public void colorShouldBeWhiteAtStart() {
		Assert.assertEquals(Color.WHITE, light.getColor());
	}
	
	@Test
	public void colorJsonShouldBeValid() {
		Assert.assertEquals(WHITE_JSON, light.getColorAsJson());
	}
}

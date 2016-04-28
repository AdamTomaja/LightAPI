package pl.tomaja.naukaGradle.test;

import org.junit.Assert;
import org.junit.Test;

import pl.tomaja.naukaGradle.Color;

/**
 * @author Adam Tomaja
 */
public class ColorTest {

	@Test
	public void theseTwoShouldBeEquals() {
		final Color red = new Color(0xFF, 0, 0);
		final Color secondRed = new Color(0xFF, 0, 0);
		Assert.assertEquals(secondRed, red);
	}
	
	@Test
	public void theseTwoShouldBeUnEquals() {
		final Color firstColor = new Color(0xFF, 0xFF, 0);
		final Color red = new Color(0xFF, 0, 0);
		Assert.assertNotEquals(red, firstColor);
	}
}

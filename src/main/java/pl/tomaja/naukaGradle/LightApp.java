package pl.tomaja.naukaGradle;

import com.google.gson.Gson;

/**
 * @author Adam Tomaja
 */
public class LightApp {

	private static final Gson GSON = new Gson();
	
	public static void main(String[] args) {
		Color myColor = new Color(23, 12, 100);
		Light myLight = new Light();
		myLight.setColor(myColor);
		myLight.turnOn();
		
		System.out.println("My light state: " + GSON.toJson(myLight));
	}
}

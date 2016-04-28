package pl.tomaja.naukaGradle;

import com.google.gson.Gson;

/**
 * @author Adam Tomaja
 */
public class Light {

	public enum State {
		ON, OFF
	}
	
	private transient final Gson gson = new Gson();
	
	private State state = State.OFF;
	private Color color = Color.WHITE;

	public boolean isTurnedOn() {
		return state == State.ON;
	}
	
	public void turnOn() {
		state = State.ON;
	}
	
	public void turnOff() {
		state = State.OFF;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public synchronized String getColorAsJson() {
		return gson.toJson(color);
	}
}

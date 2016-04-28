package pl.tomaja.naukaGradle;

import com.google.common.base.Objects;

/**
 * @author Adam Tomaja
 */
public class Color {

	public static final Color WHITE = new Color(0xFF, 0xFF, 0xFF);
	
	private final int r;
	private final int g;
	private final int b;
	
	public Color(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public int getR() {
		return r;
	}

	public int getG() {
		return g;
	}

	public int getB() {
		return b;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(r, g, b);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Color) {
			Color color = (Color) obj;
			
			return Objects.equal(this.r, color.r) && 
					Objects.equal(this.g, color.g) && 
					Objects.equal(this.b, color.b);
		}
		
		return false;
	}
}

import java.awt.Color;

public class ColorPoint extends Point {
	private Color color;

	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Point))
			return false;
		if (!(o instanceof ColorPoint))
			return o.equals(this);
		ColorPoint cp = (ColorPoint) o;
		return super.equals(o) && cp.color.equals(color);
	}
}

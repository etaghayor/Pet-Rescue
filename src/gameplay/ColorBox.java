package gameplay;

import gameplay.ColorBox.Color;

public class ColorBox extends Box {

    public enum Color {
        YELLOW, ORANGE, RED, GREEN, BLUE, PINK;
    }
    private Color color;

    public void setColor(Color c) {
    			color = c;
    }
    public Color getColor() {
        return this.color;
    }
    public static void main(String[] args) {
    	ColorBox c1 = new ColorBox();
    	c1.setColor(Color.ORANGE);
    	System.out.println(c1.getColor());
	}
}

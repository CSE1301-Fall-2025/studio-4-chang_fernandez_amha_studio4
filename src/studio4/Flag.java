package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(0.5, 0.5, 0.45, 0.25);
		StdDraw.arc(0.5, 0.45, 0.15, 180, 0);
		StdDraw.ellipse(0.5, 0.53, 0.25, 0.1);


	}
}
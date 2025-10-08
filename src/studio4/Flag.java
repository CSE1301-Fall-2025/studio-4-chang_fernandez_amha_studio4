package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledCircle(0.5, 0.44, 0.15);
		StdDraw.setPenColor(Color.green);
		StdDraw.filledCircle(0.5, 0.47, 0.16);
		StdDraw.setPenColor(Color.orange);
		StdDraw.filledCircle(0.5, 0.5, 0.17);

		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(0.5, 0.6, 0.5, 0.12);

		StdDraw.setPenColor(Color.ORANGE);
		StdDraw.filledRectangle(0.5, 0.6, 0.02, 0.1);
		StdDraw.filledRectangle(0.45, 0.6, 0.02, 0.09);
		StdDraw.filledRectangle(0.55, 0.6, 0.02, 0.09);
		StdDraw.filledRectangle(0.4, 0.6, 0.02, 0.08);
		StdDraw.filledRectangle(0.6, 0.6, 0.02, 0.08);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5, 0.7, 0.02, 0.01);
		StdDraw.filledRectangle(0.45, 0.68, 0.02, 0.01);
		StdDraw.filledRectangle(0.55, 0.68, 0.02, 0.01);
		StdDraw.filledRectangle(0.6, 0.69, 0.02, 0.01);
		StdDraw.filledRectangle(0.4, 0.69, 0.02, 0.01);


		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledEllipse(0.5, 0.53, 0.25, 0.1);
		StdDraw.setPenRadius(0.01);
		

		StdDraw.setPenColor(Color.ORANGE);
		StdDraw.arc(0.5, 0.45, 0.16, 180, 0);

		StdDraw.setPenColor(Color.WHITE);
		StdDraw.arc(0.5, 0.2, 0.3, 40, 140);
		StdDraw.line(0.2, 0.53, 0.8, 0.53);
		StdDraw.arc(0.5, 0.86, 0.3, 140, 80);
		StdDraw.setPenRadius();
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(0.5, 0.5, 0.45, 0.25);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(0.55,0.4,0.003);
		StdDraw.filledCircle(0.58,0.38,0.003);
		StdDraw.filledCircle(0.52,0.39,0.003);
		StdDraw.filledCircle(0.47,0.42,0.003);
		StdDraw.filledCircle(0.43,0.37,0.003);
		StdDraw.filledCircle(0.5,0.39,0.003);
		StdDraw.filledCircle(0.61,0.4,0.003);
		StdDraw.filledCircle(0.4,0.38,0.003);
		StdDraw.filledCircle(0.42,0.41,0.003);
	}
}
package picture;

import java.awt.Color;

import picture.Luminance;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.Picture;


public class Picture1 {
	
	private static Picture bAndW;

	public static void main(String[] args) {
		int THRESHOLD = 125;
		
		Picture pic = new Picture("images/square.bmp");
		Picture colour = new Picture(pic);
		Picture bAndW = new Picture(pic);
		pic.show();
		for (int i = 0; i < pic.width(); i++) {
			for (int j = 0; j < pic.height(); j++) {
				Color color = pic.get(i, j);
				colour.set(i, j, Luminance.compatible(color));
				double lum = Luminance.lum(color);
				if (lum >= THRESHOLD)
					bAndW.set(i, j, Color.WHITE);
				else
					bAndW.set(i, j, Color.BLACK);
			}
		}
		pic.show();
		colour.show();
		bAndW.show();
	}

	public static void mai(String[] args) {

		Picture pic = bAndW;

		int maxX = 0;
		int minX = pic.width();
		int maxY = 0;
		int minY = pic.height();

		for (int x = 0; x < pic.width(); x++) {
			for (int y = 0; y < pic.height(); y++) {
				if (!pic.get(x, y).equals(Color.WHITE) ) {

					if (x < minX)
						minX = x;
					if (x > maxX)
						maxX = x;
					if (y < minY)
						minY = y;
					if (y > maxY)
						maxY = y;

				}
			}

		}

		if (minX > maxX || minY > maxY) {
			System.out.println("It's All White Pixels!!!");
		} else {
			for (int x = minX; x <= maxX; x++) {
				pic.set(x, minY, Color.RED);
				pic.set(x, maxY, Color.RED);
			}

			for (int y = minY; y <= maxY; y++) {
				pic.set(minX, y, Color.RED);
				pic.set(maxX, y, Color.RED);
			}
		}

		pic.show();
	}

}


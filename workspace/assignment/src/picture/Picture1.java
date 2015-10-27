package picture;

import java.awt.Color;

import picture.Luminance;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.Picture;


public class Picture1 {
	public static void main(String[] args) {
		int THRESHOLD = 125;
		
		Picture pic = new Picture("images/square.bmp");
		//Picture colour = new Picture(pic);
		Picture bAndW = new Picture(pic);
		pic.show();
		for (int i = 0; i < pic.width(); i++) {
			for (int j = 0; j < pic.height(); j++) {
				Color color = pic.get(i, j);
				//colour.set(i, j, Luminance.getRed(color));
				double lum = Luminance.lum(color);
				if (lum >= THRESHOLD)
					bAndW.set(i, j, Color.WHITE);
				else
					bAndW.set(i, j, Color.BLACK);
			}
		}
		pic.show();
		//colour.show();
		bAndW.show();
	}
}

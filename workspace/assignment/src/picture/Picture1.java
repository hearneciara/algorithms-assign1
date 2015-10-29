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
        

				}

	    pixelMass.add(new Vertex(x, y));
	    boolean valueToMatch = pool[x][y];

	    if(pool[x+1] [y]   == valueToMatch) pixelMass = searchToAdd(x+1, y, pixelMass, pool);
	    if(pool[x]   [y+1] == valueToMatch) pixelMass = searchToAdd(x, y+1, pixelMass, pool);

	    if(x-1 >= 0)
	    {
	        if(pool[x-1][y] == valueToMatch) pixelMass = searchToAdd(x-1, y, pixelMass, pool);
	    }

	    if(y-1 >= 0)
	    {
	        if(pool[x][y-1] == valueToMatch) pixelMass = searchToAdd(x, y-1, pixelMass, pool);
	    }

	    return pixelMass;
	}
		

		pic.show();
	}

}


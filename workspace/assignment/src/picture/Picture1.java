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
				//colour.set(i, j, Luminance.(color));
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
	


			Picture pic2 = bAndW;

			int maxX = 0;
			int minX = pic2.width();
			int maxY = 0;
			int minY = pic2.height();
	        

					


		    if (minX > maxX || minY > maxY) 
		    {
			System.out.println("It's All White Pixels!!!");
		    } 
		    else 
		    {
			  for (int x = minX; x <= maxX; x++) 
			{
				pic2.set(x, minY, Color.RED);
				pic2.set(x, maxY, Color.RED);
			}

			for (int y = minY; y <= maxY; y++) {
				pic2.set(minX, y, Color.RED);
				pic2.set(maxX, y, Color.RED);
			}
		   }

		  pic2.show();
		}
	
	}






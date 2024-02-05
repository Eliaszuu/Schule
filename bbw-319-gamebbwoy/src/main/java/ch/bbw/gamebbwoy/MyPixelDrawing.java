package ch.bbw.gamebbwoy;

import ch.bbw.gamebbwoy.api.PixelColor;
import ch.bbw.gamebbwoy.api.PixelDisplay;
import ch.bbw.gamebbwoy.api.PixelDrawing;
import ch.bbw.gamebbwoy.internal.GameBbwoy;

public class MyPixelDrawing implements PixelDrawing {

	public static void main(String[] args) throws Throwable {
		GameBbwoy.playGame(new MyPixelDrawing());
	}

	@Override
	public void tick(PixelDisplay graphic) {
		graphic.clear();
		for (int i = 30; i < 130; i++) {
			for (int j = 70 ; j < 90; j++) {
				graphic.setPixel(i, j, PixelColor.BLACK);
			}
		}
		for (int i = 70; i < 90; i++) {
			for (int j = 20 ; j < 90; j++) {
				graphic.setPixel(i, j, PixelColor.BLACK);
			}
		}
		for (int i = 78; i < 83; i++) {
			for (int j = 10 ; j < 15; j++) {
				graphic.setPixel(i, j, PixelColor.BLACK);
			}
		}
	}
}

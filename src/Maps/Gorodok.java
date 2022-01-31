package Maps;

import terrain.Grass;

public class Gorodok extends RUSEMap {

	public Gorodok() {
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; i < 1000; i++) {
				terrain[i][j] = new Grass();
			}
		}
	}

}

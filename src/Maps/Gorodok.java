package Maps;

import terrain.TGrass;

public class Gorodok extends RUSEMap {

	public Gorodok() {
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; i < 1000; i++) {
				terrain[i][j] = new TGrass();
			}
		}
	}

}

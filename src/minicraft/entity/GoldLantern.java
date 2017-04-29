package minicraft.entity;

import minicraft.gfx.Color;

public class GoldLantern extends Furniture {
	public GoldLantern() {
		super("G.Lantern");
		col0 = Color.get(-1, 110, 330, 442);
		col1 = Color.get(-1, 220, 440, 553);
		col2 = Color.get(-1, 110, 330, 442);
		col3 = Color.get(-1, 000, 220, 331);

		col = Color.get(-1, 110, 440, 553);
		sprite = 5;
		xr = 3;
		yr = 2;
	}

	public int getLightRadius() {
		return 15;
	}
}
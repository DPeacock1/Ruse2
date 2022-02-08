package RUSE;

import javax.vecmath.Vector2d;

public class Helper {

	public static <T extends Comparable<T>> T clamp(T val, T min, T max) {
		if (val.compareTo(min) < 0)
			return min;
		else if (val.compareTo(max) > 0)
			return max;
		else
			return val;
	}

	public static double lerp(double bound1, double bound2, double amount) {
		double min, max;
		if (bound1 < bound2) {
			min = bound1;
			max = bound2;
		} else {
			min = bound2;
			max = bound1;
		}

		return ((max - min) * Helper.clamp(amount, 0.0, 1.0)) + min;
	}
}

package RUSE;

import javax.vecmath.Vector2d;

public class Helper {
	
	public static <T extends Comparable<T>> T clamp(T val, T min, T max) {
	    if (val.compareTo(min) < 0) return min;
	    else if (val.compareTo(max) > 0) return max;
	    else return val;
	}
	
	public static Vector2d clampLength(Double val, Vector2d min, Vector2d max) {
		
		return ;
	}
}

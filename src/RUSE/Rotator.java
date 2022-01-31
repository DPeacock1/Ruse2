package RUSE;

public class Rotator {

	/**
	 * Stored as radians
	 */
	private double angle;

	/**
	 * 
	 * @param angle
	 * @param radians True if radians, false if degrees
	 */
	public Rotator(Double angle, Boolean radians) {
		if (radians) {
			this.angle = angle;
		} else {
			this.angle = degsToRads(angle);
		}
	}

	public double getDeg() {
		return radsToDegs(angle);
	}

	public double getRads() {
		return angle;
	}

	public static double degsToRads(double degrees) {
		return degrees * (Math.PI / 180);
	}

	public static double radsToDegs(double radians) {
		return radians * (180 / Math.PI);
	}
}

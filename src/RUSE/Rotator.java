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
			this.angle = roundDouble(angle % (2 * Math.PI), 6);
		} else {
			this.angle = Math.toRadians(angle % 360);
		}
	}

	public double getDeg() {
		return roundDouble(Math.toDegrees(angle), 6);
	}

	public double getRads() {
		return angle;
	}
	
	public static Rotator add(Rotator r1, Rotator r2) {
		return new Rotator(r1.getRads() + r2.getRads(), true);
	}
	
	public static Rotator sub(Rotator r1, Rotator r2) {
		return new Rotator(r1.getRads() - r2.getRads(), true);
	}
	
	public static double roundDouble(Double input, int decimalPlaces) {
		return Math.round(input * Math.pow(10, decimalPlaces)) / Math.pow(10, decimalPlaces);
	}
}

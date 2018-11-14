package code;

public class Square {
	private double longitudeB;
	private double altitudeB;
	private double longitudeD;
	private double altitudeD;

	
	public Square(double xB, double yB, double xD, double yD) {
		this.longitudeB = xB;
		this.altitudeB = yB;
		this.longitudeD = xD;
		this.altitudeD = yD;
	}


	public Coordinates getTopLeft() {
		return new Coordinates(longitudeB, altitudeB);
	}
	public Coordinates getTopRight() {
		return new Coordinates(longitudeD, altitudeB);
	}
	public Coordinates getBottomLeft() {
		return new Coordinates(longitudeB, altitudeD);
	}
	public Coordinates getBottomRight() {
		return new Coordinates(longitudeD, altitudeD);
	}

}

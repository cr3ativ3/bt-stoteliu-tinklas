package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Square {
	private double longitudeB;
	private double altitudeB;
	private double longitudeD;
	private double altitudeD;
	private final  HashMap<String, Coordinates> AllCoordinates = new HashMap<String,Coordinates>();

	
	public Square(double xB, double yB, double xD, double yD) {
		this.longitudeB = xB;
		this.altitudeB = yB;
		this.longitudeD = xD;
		this.altitudeD = yD;
		makeCoordinates(longitudeB, altitudeB, longitudeD, altitudeD);
	}
	private void makeCoordinates(double longitudeB, double altitudeB,double longitudeD, double altitudeD) {
		Coordinates a = new Coordinates(longitudeB, altitudeD); //apatinis kairys kampas
		Coordinates b = new Coordinates(longitudeB, altitudeB); // virsutinis kairys kampas
		Coordinates c = new Coordinates(longitudeD, altitudeB); // virsutinis desinys kampas
		Coordinates d = new Coordinates(longitudeD, altitudeD); // apatinis desinys kampas
		makeList(a, b, c, d);
	}
	private void makeList(Coordinates a,Coordinates b,Coordinates c ,Coordinates d) {
		AllCoordinates.put("a", a);
		AllCoordinates.put("b", b);
		AllCoordinates.put("c", c);
		AllCoordinates.put("d", d);

	}
	public HashMap<String,Coordinates> getCoordinates() {
		return AllCoordinates;
	}

}

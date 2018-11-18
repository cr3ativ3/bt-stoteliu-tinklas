package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class ArtimiausiaStotele {
	
	private String stringTaskasX;
	private String stringTaskasY;
	private HardCodedDb stoteles = new HardCodedDb();
	

	public ArtimiausiaStotele(String x, String y) {
		this.stringTaskasX = x;
		this.stringTaskasY = y;
		Coordinates taskas = new Coordinates(Double.parseDouble(stringTaskasX), Double.parseDouble(stringTaskasY));
		distance(taskas);
	}
	
	public double getTaskasX() {
		double doubleTaskasX = Double.parseDouble(stringTaskasX);
		return doubleTaskasX;
	}
	
	public double getTaskasY() {
		double doubleTaskasY = Double.parseDouble(stringTaskasY);
		return doubleTaskasY;
	}
	
	public void distance(Coordinates taskas) {
		
		List<Double> taskai = new ArrayList<>();
		for(Station a : stoteles.getStoteles()) {
			
			Double dx = getTaskasX() - Double.parseDouble(a.getLongtitute());
			Double dy = getTaskasY() - Double.parseDouble(a.getLatitude());
			Double atstumasTarpTasku = Math.abs(dx) + Math.abs(dy);
			
			taskai.add(atstumasTarpTasku);
		}
		Collections.sort(taskai);
		System.out.println(taskai.get(0));
	}
}

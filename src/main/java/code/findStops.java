package code;

import java.util.ArrayList;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class findStops {
	private Coordinates TopLeft;
	private Coordinates TopRight;
	private Coordinates BottomRight;
	private Coordinates BottomLeft;

	public findStops(Coordinates TopLeft,Coordinates TopRight,Coordinates BottomLeft,Coordinates BottomRight) {
		this.TopLeft = TopLeft;
		this.BottomRight = BottomRight;
		this.BottomLeft = BottomLeft;
		this.TopRight = TopRight;
		stotelesKvadrate();
	}
	
	
	private boolean isInside(String x, String y) {
		Double xDouble = Double.parseDouble(x);
		Double yDouble = Double.parseDouble(y);
		if(TopLeft.getX() < xDouble && TopRight.getX() > xDouble && BottomLeft.getY() < yDouble && TopLeft.getY()>yDouble) return true;
		else return false;
		
		
		}
	
	
	public List<Station> stotelesKvadrate() {
        HardCodedDb StoteliuList = new HardCodedDb();
        List<Station> FinalList = new ArrayList<Station>();
        for(Station i : StoteliuList.getStoteles()) {
        	if(isInside(i.getLatitude(), i.getLongtitute()) == true) {
        		FinalList.add(i);
        	}
        }
        
		return FinalList;
	}
}

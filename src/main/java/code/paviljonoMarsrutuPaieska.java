package code;

import java.util.Arrays;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class paviljonoMarsrutuPaieska {
	
	private String stringTaskasX;
	private String stringTaskasY;
	private HardCodedDb stoteles = new HardCodedDb();
	
	public paviljonoMarsrutuPaieska(String x, String y) {
		this.stringTaskasX = x;
		this.stringTaskasY = y;
		marsrutuPaieska(stringTaskasX, stringTaskasY);
	}
	
	public void marsrutuPaieska(String stringTaskasX, String stringTaskasY) {
		for (Station a : stoteles.getStoteles()) {
			if ( stringTaskasX == a.getLongtitute() && stringTaskasY == a.getLatitude() ) {
				System.out.println( "Pavilijono '" + a.getName() + "' koordinatës: " + a.getLongtitute() + " " + a.getLatitude() );
				System.out.println( "Pavilijono '" + a.getName() + "' marðrutai: " + Arrays.toString(a.getRoutes()) );
			}else {
				System.out.println("Bolgos koordinatës");
				break;
			}
		}
	}
}
package code;

import java.util.Arrays;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class stotelesMarsrutai {
	
	private String stotelesPavadinimas;
	private HardCodedDb stoteles = new HardCodedDb();
	
	public stotelesMarsrutai(String pav) {
		this.stotelesPavadinimas = pav;
		marsrutuPaieska(stotelesPavadinimas);
	}
	
	public void marsrutuPaieska(String stotelesPavadinimas) {
		for (Station a : stoteles.getStoteles()) {
			if (stotelesPavadinimas == a.getName()) {
				System.out.println( "Stotelës: '" + stotelesPavadinimas + "' koordinatës: " + a.getLongtitute() + " " + a.getLatitude() );
				System.out.println( "Stotelës: '" + stotelesPavadinimas + "' marðrutai: " + Arrays.toString(a.getRoutes()) );
			}
		}
	}
}

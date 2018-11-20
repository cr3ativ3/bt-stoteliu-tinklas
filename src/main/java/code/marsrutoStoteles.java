package code;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import lt.baltictalents.stoteliutinklas.data.beans.Station;

public class marsrutoStoteles {
	
	private String marsrutoNumeris;
	
	public marsrutoStoteles( String num ) {
		this.marsrutoNumeris = num;
		arStoteleTuriTaMarsruta(marsrutoNumeris);
	}
	
	public static Predicate<Station> arStoteleTuriTaMarsruta(String marsrutoNumeris){
		return stotele -> {
			for (String route : stotele.getRoutes()) {
				if(route.contains(marsrutoNumeris)) {
					return true;
				}
			}
			return false;
		};
	}
	
	public List<Station> filterStoteles(List<Station> stoteles, Predicate<Station> filtras) {
        List<Station> rezultatas = new ArrayList<>();
        for (Station atitinkantiStotele: stoteles) {
            if (filtras.test(atitinkantiStotele)) {
                rezultatas.add(atitinkantiStotele);
            }
        }
        return rezultatas;
    }
}

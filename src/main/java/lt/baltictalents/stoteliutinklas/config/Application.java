package lt.baltictalents.stoteliutinklas.config;
import java.util.List;

import code.*;
import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.*;

public class Application {

	public static void main(String[] args) {
		//if input iveda koordinates(50, 60); kreipiamsi i square ir sukuriamos naujosv 4 naujos koordinates; tada kreiptis i findStops su tom 4 koordinatem ir tada findStop.stotelesKvadrate;
		//dar yra metodas stotelesKvadrateMax(); grazina kur daugaiusia autobusu stoja.
		HardCodedDb b = new HardCodedDb();
		Square a = new Square("22.2807680","54.7553249", "25.3205599","54.6492589");
		findStops h = new findStops(a.getTopLeft(), a.getTopRightt(), a.getBottomLeft(), a.getBottomRight());
	//	System.out.println(h.stotelesKvadrate());
		System.out.println(h.stotelesKvadrateMax());

    }
    
}


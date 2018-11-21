package lt.baltictalents.stoteliutinklas.config;

import code.*;
import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.*;

public class Application {

	public static void main(String[] args) {
		HardCodedDb b = new HardCodedDb();
		control main = new control(b.getStoteles());
		System.out.println(main.StotelesMarsrutai("Vaikų ligoninė"));
    }
    
}


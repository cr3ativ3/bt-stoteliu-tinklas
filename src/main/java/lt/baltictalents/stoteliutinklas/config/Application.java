package lt.baltictalents.stoteliutinklas.config;

import code.gui;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class Application {

	public static void main(String[] args) {

   	    HardCodedDb b = new HardCodedDb();
    	@SuppressWarnings("unused")
		gui Gui = new gui(b.getStoteles());
		//gui Gui = new gui(SarasasIsFailo());

    }
	
    
}


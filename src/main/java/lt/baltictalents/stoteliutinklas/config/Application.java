package lt.baltictalents.stoteliutinklas.config;
import 
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import 
import lt.baltictalents.stoteliutinklas.data.beans.*;
import code.gui;
import gradle.write;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {

   	    HardCodedDb b = new HardCodedDb();
    	@SuppressWarnings("unused")
    	
    	File file = new File("C:\\Users\\Gytis\\Desktop\\programavimas\\projektas1\\bt-stoteliu-tinklas\\src\\bin\\data\\stoteles.txt"); 
    	Scanner sc = new Scanner(file);
		List<Station> SarasasIsFailo = new ArrayList<Station>(1260);
    	   while (sc.hasNextLine()) {
    		        String[] data = sc.nextLine().split("\\,");
    		        String[] keliai = data[3].split("\\;");
    		        SarasasIsFailo.add(new Station(data[0], data[1],data[2],keliai));
    	}

    	write writeSQL = new writeSQL("stoteles");
		gui Gui = new gui(SarasasIsFailo); // uzkomentuot, jeigu nori skaityt is hardcodedDb
		//gui Gui = new gui(b.getStoteles());  // uzkomentuot, jeigu nori skaityt is failo

    }
	
    
}






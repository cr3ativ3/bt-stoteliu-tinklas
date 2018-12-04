package lt.baltictalents.stoteliutinklas.config; 
import java.util.ArrayList;


import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 
import lt.baltictalents.stoteliutinklas.data.beans.*;
import code.gui;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class Application {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

   	    HardCodedDb b = new HardCodedDb();
    	
    	File file = new File("C:\\Users\\Gytis\\Desktop\\stotelesSQL\\src\\files\\stoteles.txt"); 
    	Scanner sc = null;
		try {
			sc = new Scanner(file, "UTF-8");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   		System.out.println(sc.hasNextLine());
		List<Station> SarasasIsFailo = new ArrayList<Station>(1260);
    	   while (sc.hasNextLine()) {
    		        String[] data = sc.nextLine().split("\\,");
    		        String[] keliai = data[3].split("\\;");
    		        SarasasIsFailo.add(new Station(data[0], data[1],data[2],keliai));

    	}

		gui Gui = new gui(SarasasIsFailo); // uzkomentuot, jeigu nori skaityt is hardcodedDb
//		gui Gui = new gui(b.getStoteles());  // uzkomentuot, jeigu nori skaityt is failo

    }
	
    
}






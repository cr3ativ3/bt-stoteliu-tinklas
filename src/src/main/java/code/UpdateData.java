package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
	private String fileName = "";
	private final String url = "jdbc:sqlite:C:\\Users\\Gytis\\";
    public UpdateData(String filename, String data) {
    	this.fileName = filename;
        String sql = "UPDATE Stoteles SET Prieziuros_Darbai = ? , "
                + "WHERE Name = ?";
 
        try (Connection conn = DriverManager.getConnection(url+fileName+".db");
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            pstmt.setString(1, data);
            pstmt.setString(2, "Vaikų ligoninė");

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    
	}
	
}

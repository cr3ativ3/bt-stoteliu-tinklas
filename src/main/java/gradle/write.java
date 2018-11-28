package gradle;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
public class write {

private final String url = "jdbc:sqlite:C:\\Users\\Gytis\\";


public write(String fileName) {
	 
    try (Connection conn = DriverManager.getConnection(url+fileName+".db")) {
        if (conn != null) {
            DatabaseMetaData meta = conn.getMetaData();
            System.out.println("The driver name is " + meta.getDriverName());
            System.out.println("A new database has been created.");
        }

    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}


}


package Connect;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//import persis.ConxDB;

public class ConxDB {
	/*private static Connection connexion;

    private final String DB_URL = "jdbc:mysql://localhost:3306/ecole";
    private final String USER = "root";
    private final String PASS = "";
/*	public  static   Connection con()     {
		  try{
			  String DB_URL = "jdbc:mysql://localhost:3306/ecole";
			     String USER = "root";
			    String PASS = "";

              Class.forName("com.mysql.cj.jdbc.Driver");
              
				 connexion= DriverManager.getConnection(DB_URL, USER, PASS);
				return connexion ;
			 
              
       } catch (ClassNotFoundException | SQLException e) {
           Logger.getLogger(ConxDB.class.getName()).log(Level.SEVERE, null, e);
          // e.printStackTrace();
       }
		return null;
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		private static Connection connexion;

    private final String DB_URL = "jdbc:mysql://localhost:3306/ecole";
    private final String USER = "root";
    private final String PASS = "";

    private ConxDB() throws SQLException{

        try{
               Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }

        connexion= DriverManager.getConnection(DB_URL, USER, PASS);

    }

    public static Connection getInstance(){
        if (connexion == null)
            try {
                new ConxDB();
            }catch(Exception e){
                System.out.println("--"+e.getMessage());
            }
        return connexion;
    }
}

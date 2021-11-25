
package connection;

import java.sql.Connection;

public class Connect {
    
    Connection con;

    public Connect() {
        conectionBd();
    }
    
    
    public void conectionBd() {
        String host = "localhost";
        String user = "root";
        String pass = "1234";
        String bd = "hospital";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String newConnectionURL = "jdbc:mysql://"+host+"/"+bd+"?"+"user="+user+"&password="+pass+"&useSSL=false";
            con = DriverManager.getConnection( newConnectionURL );
        } catch (Exception e) {
            System.out.println("error al conectar"+ e);
        }
        
    }
    
}

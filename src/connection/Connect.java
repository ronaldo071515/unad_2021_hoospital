
package connection;

import com.mysql.cj.protocol.Resultset;
import java.sql.Statement;
import java.sql.Connection;

public class Connect {
    
    String user = "root";
    String pass = "1234";
    String url = "jdbc:mysql://localhost:3306/node";
    Connection con;
    Statement stmt;
    Resultset rs;
    
}

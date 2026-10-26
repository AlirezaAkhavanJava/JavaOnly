package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDataBase {

    protected void makeConnection() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:dummy.db");
    }
}

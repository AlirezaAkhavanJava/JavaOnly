import Connection.ConnectToDataBase;

import java.sql.SQLException;

void main() throws SQLException {
    ConnectToDataBase connectToDataBase = new ConnectToDataBase();
    connectToDataBase.makeConnection();
}

package Connection;

import java.sql.*;
import java.util.Scanner;

public class ConnectToDataBase {


    Connection connection;

    public ConnectToDataBase() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:dummy.db");
        } catch (Exception e) {
            System.out.println("New Exception : " + e);
        }
    }

    public void makeConnection() throws SQLException {

        String sql = """
                CREATE TABLE IF NOT EXISTS task (
                    id INTEGER PRIMARY KEY,
                    name TEXT
                );
                """;
        String insert = """
                 INSERT INTO task(name) VALUES("Dance with a Lion");
                """;

        String insertDynamic = """
                 INSERT INTO task(name) VALUES(?);
                """;


        Statement statement = connection.createStatement();



        PreparedStatement preparedStatement = connection.prepareStatement(insertDynamic);
        System.out.print("Task : ");
        System.out.println();
        String task = new Scanner(System.in).nextLine();
        preparedStatement.setString(1, task);
        preparedStatement.executeUpdate();

    }
}
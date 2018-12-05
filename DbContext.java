package AnimalManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbContext {

    private Connection connection;

    private static final String nameClass = "com.mysql.jdbc.Driver";
    private static final String connPath  = "jdbc:mysql://localhost:3306/sonoo\",\"root\",\"root";


    public DbContext() {
        this.connection = setConnection();
    }

    public Connection getConnection() {
        return connection;
    }

    public Connection setConnection() {

        try {

          Class.forName(nameClass);
          Connection con = DriverManager.getConnection(connPath);

          return con;

        } catch (Exception e) {
            System.out.println(e);
        }


        return null;
    }
}

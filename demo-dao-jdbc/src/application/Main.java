package application;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "2008";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

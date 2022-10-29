package Populate.PopulateClient;

import Database.Database;
import Database.Prefs.Prefs;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PopulateClient {

public static void populateClient(Client client) throws SQLException {
    PreparedStatement ps = Database.getInstance().getConnection().prepareStatement(Prefs.INSERT_INTO_CLIENT);
    ps.setString(1, client.getName());
    ps.execute();

}

public static void main(String[] args) throws SQLException {
    Scanner sc = new Scanner(System.in);
    Client client = new Client();
    System.out.println("Client (name_lastName: )");
    String name = sc.next();
    client.setName(name);
    populateClient(client);
}


}

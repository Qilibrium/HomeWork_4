import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DatabasePopulateService {
    public void populateDb(Database database) {
        try {
            String populateDbFilename = new Prefs().getString(Prefs.POPULATE_DB_SQL_PATH);
            String populateSql = String.join("\n",
                    Files.readAllLines(Paths.get(populateDbFilename)));
            database.executeUpdate(populateSql);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        Database database = Database.getInstance();
        new DatabasePopulateService().populateDb(database);
    }
}

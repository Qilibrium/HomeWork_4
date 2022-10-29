package Populate.PopulateProjectWorker;

import Database.Database;
import Database.Prefs.Prefs;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PopulateProjectWorker {

    public static void populateProjectWorker(ProjectWorker projectWorker) throws SQLException {
        PreparedStatement ps = Database.getInstance().getConnection().prepareStatement(Prefs.INSERT_INTO_PROJECT_WORKER);
        ps.setInt(1, projectWorker.getWorker_id());
        ps.setInt(2, projectWorker.getProject_id());
        ps.execute();
    }

    public static void main(String[] args)  {
        ProjectWorker projectWorker = new ProjectWorker();
        Scanner sc = new Scanner(System.in);

        System.out.println("worker_id");
        int worker_id = sc.nextInt();
        projectWorker.setWorker_id(worker_id);

        System.out.println("project_id");
        int project_id = sc.nextInt();
        projectWorker.setProject_id(project_id);

        try {
            populateProjectWorker(projectWorker);
        } catch (SQLException e) {
            throw new RuntimeException("ID NOT FOUND");
        }

    }
}

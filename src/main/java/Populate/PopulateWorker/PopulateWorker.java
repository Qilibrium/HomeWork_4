package Populate.PopulateWorker;

import Database.Database;
import Database.Prefs.Prefs;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class PopulateWorker {

    public static void populateWorker(Worker worker) throws SQLException {

        PreparedStatement ps = Database.getInstance().getConnection().prepareStatement(Prefs.INSERT_INTO_WORKER);
        ps.setString(1, worker.getName());
        ps.setDate(2, ( Date ) worker.getBirthday());
        ps.setString(3, worker.getLevel());
        ps.setInt(4, worker.getSalary());
        ps.execute();
    }
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        Worker worker = new Worker();

        System.out.println("Name: ");
        String name = sc.nextLine();
        worker.setName(name);

        System.out.println("Birthday format (yyyy-mm-dd) ");
        String birthday = sc.next();
        worker.setBirthday(Date.valueOf(birthday));

        System.out.println("Level: (Trainee, Middle, Senior)");
        String level = sc.next();
        worker.setLevel(level);

        System.out.println("Salary: ");
        int salary = sc.nextInt();
        worker.setSalary(salary);

        populateWorker(worker);
    }

}


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {
    public List<FindMaxSalaryWorker> findMaxSalaryWorker() throws SQLException, IOException {
        List<FindMaxSalaryWorker> findMaxSalaryWorker = new ArrayList<>();
        String findMaxSalary = new Prefs().getString(Prefs.FIND_MAX_SALARY_WORKER);
        String findMaxSalarySql = String.join("\n", Files.readAllLines(Paths.get(findMaxSalary)));
        Connection connection = DriverManager.getConnection(Prefs.CONNECTION_FOR_METHOD);
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(findMaxSalarySql);
        if (rs.next()) {
            FindMaxSalaryWorker maxSalaryWorker = new FindMaxSalaryWorker();
            maxSalaryWorker.setName(rs.getString("name"));
            maxSalaryWorker.setSalary(rs.getInt("salary"));
            findMaxSalaryWorker.add(maxSalaryWorker);
        } else {
            System.out.println("Error");
        }
        return findMaxSalaryWorker;
    }

    public List<FindLongestProject> findLongestProject() throws SQLException, IOException {
        List<FindLongestProject> findMoreLongestProject= new ArrayList<>();
        String findLongestProject = new Prefs().getString(Prefs.FIND_LONGEST_PROJECT);
        String findLongestProjectSql = String.join("\n", Files.readAllLines(Paths.get(findLongestProject)));
        Connection connection = DriverManager.getConnection(Prefs.CONNECTION_FOR_METHOD);
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(findLongestProjectSql);
        if (rs.next()) {
            FindLongestProject longestProject = new FindLongestProject();
            longestProject.setId(rs.getLong("name"));
            longestProject.setLongestMonth(rs.getString("month_count"));
            findMoreLongestProject.add(longestProject);
        }
        return findMoreLongestProject;
    }

    public List<YoungestEldestWorker> findYoungestEldestWorker() throws SQLException, IOException {
        List<YoungestEldestWorker> findYoungestEldestWorkers=new ArrayList<>();
        String findYoungestEldestWorker = new Prefs().getString(Prefs.FIND_YOUNGEST_ELDEST_WORKERS);
        String findYoungestEldestWorkerSql = String.join("\n", Files.readAllLines(Paths.get(findYoungestEldestWorker)));
        Connection connection = DriverManager.getConnection(Prefs.CONNECTION_FOR_METHOD);
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(findYoungestEldestWorkerSql);
        while (rs.next()) {
            YoungestEldestWorker youngestEldestWorker = new YoungestEldestWorker();
            youngestEldestWorker.setType(rs.getString("type"));
            youngestEldestWorker.setName(rs.getString("name"));
            youngestEldestWorker.setBirthday(LocalDate.parse(rs.getString("birthday")));
            findYoungestEldestWorkers.add(youngestEldestWorker);
        }
        return findYoungestEldestWorkers;
    }
    public List<PrintProjectPrices> printProjectPrices() throws SQLException, IOException {
        List<PrintProjectPrices> findPrintProjectPrices = new ArrayList<>();
        String printProjectPrices = new Prefs().getString(Prefs.PRINT_PROJECT_PRICES);
        String printProjectPricesSql = String.join("\n", Files.readAllLines(Paths.get(printProjectPrices)));
        Connection connection = DriverManager.getConnection(Prefs.CONNECTION_FOR_METHOD);
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(printProjectPricesSql);
        while (rs.next()) {
            PrintProjectPrices projectPrices = new PrintProjectPrices();
            projectPrices.setNumberIdProject(rs.getLong("number_id_project"));
            projectPrices.setPrice(rs.getInt("prise"));
            findPrintProjectPrices.add(projectPrices);
        }
        return findPrintProjectPrices;
    }

    public List<MaxProjectCountClient> findMaxProjectsClient() throws SQLException {
        List<MaxProjectCountClient> maxProjectCountClients = new ArrayList<>();
        String maxProjectClient = new Prefs().getString(Prefs.FIND_MAX_PROJECTS_CLIENT);
        String maxProjectClientSql;
        try {
            maxProjectClientSql = String.join("\n", Files.readAllLines(Paths.get(maxProjectClient)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Connection connection = DriverManager.getConnection(Prefs.CONNECTION_FOR_METHOD);
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(maxProjectClientSql);
        while (rs.next()) {
            MaxProjectCountClient maxProjectCountClient = new MaxProjectCountClient();
            maxProjectCountClient.setName(rs.getString("name"));
            maxProjectCountClient.setProjectCount(rs.getInt("project_count"));
            maxProjectCountClients.add(maxProjectCountClient);
        }
        return maxProjectCountClients;
    }
}

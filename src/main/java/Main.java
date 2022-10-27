import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


public class Main {
    public static void main(String[] args) throws SQLException, IOException {

        List<FindMaxSalaryWorker> findMaxSalaryWorker = new DatabaseQueryService().findMaxSalaryWorker();
        System.out.println(findMaxSalaryWorker.toString());

        List<FindLongestProject> findLongestProject = new DatabaseQueryService().findLongestProject();
        System.out.println("");
        System.out.println(findLongestProject.toString());

        List<YoungestEldestWorker> findYoungestEldestWorker = new DatabaseQueryService().findYoungestEldestWorker();
        System.out.println("");
        System.out.println(findYoungestEldestWorker.toString());

        List<MaxProjectCountClient> findMaxProjectsClient = new DatabaseQueryService().findMaxProjectsClient();
        System.out.println("");
        System.out.println(findMaxProjectsClient.toString());

        List<PrintProjectPrices> printProjectPrices = new DatabaseQueryService().printProjectPrices();
        System.out.println("");
        System.out.println(printProjectPrices.toString());


    }
}

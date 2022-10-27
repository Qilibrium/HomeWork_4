import ClassSqlMethods.*;
import Database.DatabaseQueryService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


public class Main {
    public static void main(String[] args) throws SQLException, IOException {

        List<FindMaxSalaryWorker> findMaxSalaryWorker = new DatabaseQueryService().findMaxSalaryWorker();

        List<FindLongestProject> findLongestProject = new DatabaseQueryService().findLongestProject();

        List<YoungestEldestWorker> findYoungestEldestWorker = new DatabaseQueryService().findYoungestEldestWorker();

       List<MaxProjectCountClient> findMaxProjectsClient = new DatabaseQueryService().findMaxProjectsClient();

        List<PrintProjectPrices> printProjectPrices = new DatabaseQueryService().printProjectPrices();


    }
}

package ClassSqlMethods;

public class FindMaxSalaryWorker {
//    String name = rs.getString("name");
//    int salary = rs.getInt("salary");
    String name;
    int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return " ClassSqlMethods.FindMaxSalaryWorker " +"\n"+
                "name = " + name +
                " ,salary = " + salary;
    }
}

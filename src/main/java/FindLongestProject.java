public class FindLongestProject {
//    long id = rs.getLong("name");
//    String longestMonth = rs.getString("month_count");
    long id;
    String longestMonth;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLongestMonth() {
        return longestMonth;
    }

    public void setLongestMonth(String longestMonth) {
        this.longestMonth = longestMonth;
    }

    @Override
    public String toString() {
        return "FindLongestProject: " +"\n"+
                "id = " + id +"\n"+
                "longestMonth = " + longestMonth;

    }
}

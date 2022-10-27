package ClassSqlMethods;

public class PrintProjectPrices {
    long numberIdProject;
    int price;

    public long getNumberIdProject() {
        return numberIdProject;
    }

    public void setNumberIdProject(long numberIdProject) {
        this.numberIdProject = numberIdProject;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Print project prices: "+
                "number_id_project: " + numberIdProject +
                ", price: " + price +"\n";
    }

}

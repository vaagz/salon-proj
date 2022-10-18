import java.util.ArrayList;

public class Service {
    private static ArrayList<Employee> stylistArrayList = new ArrayList<>();
    private String name;
    private double cost;
    private String stylistName;

    public Service(String name, double cost, String stylistName) {
        this.name = name;
        this.cost = cost;
        this.stylistName = stylistName;
    }


    public Service() {

    }

    public static void availableStylists() {
        stylistArrayList.add(new Employee("Sali", "Sali@gmail.com", "0555807637", "Dammam"));
        stylistArrayList.add(new Employee("Sara", "Sara@gmail.com", "0553544047", "Dammam"));
        stylistArrayList.add(new Employee("Abeer", "Aboora122a@gmail.com", "0503544435", "Dammam"));
        stylistArrayList.add(new Employee("Marry", "Momo2a@gmail.com", "0523566482", "Dammam"));
        stylistArrayList.add(new Employee("Jinnie", "jojooj@gmail.com", "0553462141", "Dammam"));

        for (Employee employee : stylistArrayList) {
            System.out.println(employee.getName());
        }
    }

    public static String getStylistById(int choice) {
        return stylistArrayList.get(choice - 1).getName();
    }

    @Override
    public String toString() {
        return "Services:\n " + name + '\n' + " Price: " + cost + "\n" + " stylistName='" + getStylistName();
    }

    public String getStylistName() {
        return stylistName;
    }

    public void setStylistName(String stylistName) {
        this.stylistName = stylistName;
    }

    public ArrayList<Employee> getStylist() {
        return stylistArrayList;
    }

    public void setStylist(ArrayList<Employee> stylist) {
        stylistArrayList = stylist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void addStylist(Employee employee) {
        stylistArrayList.add(employee);
    }

    public void removeStylist(Employee employee) {
    }


}

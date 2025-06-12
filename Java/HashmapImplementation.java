import java.util.HashMap;

public class HashmapImplementation {
    public static void main(String[] args) {
        
        
        HashMap<Integer, String> employees = new HashMap<>();

       
        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(103, "Charlie");
        employees.put(104, "David");
        employees.put(105, "Emma");

       
        System.out.println("Employee Records:");
        for (Integer id : employees.keySet()) {
            System.out.println("ID: " + id + ", Name: " + employees.get(id));
        }
    }
}

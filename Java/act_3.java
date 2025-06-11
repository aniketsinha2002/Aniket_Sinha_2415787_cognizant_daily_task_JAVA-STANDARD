public class EmployeeDetails {
    public static void main(String[] args) {
        // Creating employee objects
        Employee emp1 = new Employee("Rajesh", 30, "Software Engineer", 80000);
        Employee emp2 = new Employee("Nitin", 35, "Project Manager", 95000);

        emp1.displayDetails();
        emp2.displayDetails();
    }
}

class Employee {
    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: $" + salary);
        System.out.println("---------------------------");
    }
}



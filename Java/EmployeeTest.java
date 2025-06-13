// ACTIVITY - ABSTRACT CLASS

// Create an abstract class Employee with an abstract method calculateSalary() and a concrete method displayDetails(). Extend it with FullTimeEmployee and PartTimeEmployee.

abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateSalary();

    void displayDetails() {
        // System.out.println("Direct Salary Calculation: " + salary);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("-------------------------");
    }
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateSalary() {
        return salary;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name, hoursWorked * hourlyRate);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("Ramesh", 5000);
        fullTime.displayDetails();

        Employee partTime = new PartTimeEmployee("Nitish", 20, 15); // 20hrs wprked, hourly rate 15$
        partTime.displayDetails();
    }
}

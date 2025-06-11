// Activity: Create a base class Person with name and age, and a derived class Employee with salary. Display inherited values.

class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class
class Employee extends Person {
    double salary;

    // Constructor
    Employee(String name, int age, double salary) {
        super(name, age); // Calling base class constructor
        this.salary = salary;
    }

    // Display method (overrides base class method)
    void display() {
        super.display(); // Call Person's display method
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 30, 50000);
        emp.display();
    }
}

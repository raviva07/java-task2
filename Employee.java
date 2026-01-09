public class Employee extends Person1 {
    int employeeID;
    double salary;

    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);      
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age +
                           ", Employee ID: " + employeeID + ", Salary: " + salary);
    }



    public static void main(String[] args) {
        Employee e1 = new Employee("Sita", 28, 101, 55000.0);
        Employee e2 = new Employee("Arjun", 35, 102, 72000.0);

        e1.display();
        e2.display();
    }
}

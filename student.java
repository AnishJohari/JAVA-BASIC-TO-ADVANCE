// Main class
public class Student {
    public static void main(String[] args) {
        // Creating a Teacher object
        Teacher t1 = new Teacher();

        // Setting student data
        t1.setName("Anish");
        t1.setRoll(77);

        // Setting teacher-specific data
        t1.setSalary(50000);
        t1.setLocation("Kathmandu");

        // Displaying data
        System.out.println("Name      : " + t1.getName());
        System.out.println("Roll No   : " + t1.getRollNo());
        System.out.println("Salary    : " + t1.getSalary());
        System.out.println("Location  : " + t1.getLocation());

        // Call interface method
        t1.doSomething();
    }
}

// Base class
class StudentData {
    private int rollNumber;
    private String name;

    public void setRoll(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }
}

// Interface to demonstrate multiple inheritance
interface C {
    void doSomething();
}

// Derived class
class Teacher extends StudentData implements C {
    private int salary;
    private String location;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public String getLocation() {
        return location;
    }

    // Implementing method from interface C
    public void doSomething() {
        System.out.println("Teacher is performing an action from interface C.");
    }
}

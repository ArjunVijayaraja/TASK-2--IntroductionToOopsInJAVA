package IntroductionToOopsJava;

public class Employee extends Person {
    int employeeId;
    int salary;

    public Employee(String name, int Age){
        super(name,Age);
        this.name = name;
        this.age = Age;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Raja",26);
        System.out.println(e1.getName());
        System.out.println(e1.getAge());
    }
}

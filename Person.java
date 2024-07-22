package IntroductionToOopsJava;

public class Person {
    //Creating a global Variable age and name;
    int age ;
    String name;


    //while creating an object if the age is not specified, by default it will be considered as 18;
    public Person(String name){
        this.age = 18;
        this.name = name;
    }

    //Creating a constructor with name and age
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Generating the getters and setters fot the available global variables'
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    //main method
    public static void main(String[] args) {
        //creating a object for the class"Person" by providing to parameters --> name and age
        Person p1 = new Person("Arjun",20);
        //
        System.out.println("The name of the Person from p1 obj : "+p1.getName());
        System.out.println("The age of the Person from p1 obj : "+p1.getAge());
        // When the object is created with only name parameters -- the single parameter constructor will be called..
        // in default constructor I have provided the age as 18
        //so whenever the obj is created the age will be set to 18 by default
        Person p2 = new Person("Sri");
        System.out.println("The name of the Person from p1 obj : "+p2.getName());
        System.out.println("The age of the Person from p1 obj : "+p2.getAge());
    }


}

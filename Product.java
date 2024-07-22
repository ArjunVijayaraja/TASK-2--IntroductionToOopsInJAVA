package IntroductionToOopsJava;

public class Product {
    //Creating the Global Variables...
    int pid;
    int price;
    int quantity;

    //creating a Parameterized constructor to initialize the global variables
    public Product(int pid, int price, int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

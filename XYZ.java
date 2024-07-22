package IntroductionToOopsJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class XYZ {
    //Creating an array list globally to access it all ove the class;
   public static ArrayList<Product> prodList = new ArrayList<Product>();

   public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        //this is the for loop to get the details of the product and store it in an ArrayList
       for(int i = 1; i<=5;i++){
           System.out.println("Enter the Product ID for Product "+i+" : ");
           int pid = scanObj.nextInt();
           System.out.println("Enter the Product Price for Product "+i+" : ");
           int price = scanObj.nextInt();
           System.out.println("Enter the quantity for Product "+i+" : ");
           int quantity = scanObj.nextInt();
           Product p = new Product(pid,price,quantity);
           prodList.add(p);
       }

        //Calling the method to get the Product with highest price;
        getProdwithHighPrice();
       //storing the Total amount spent in the product in the "totalPrice" variable;
        int totalPrice = totalAmtSpent(prodList);
        System.out.println("The total amount spent on the Products is : "+ totalPrice);
    }


    //I have used "Comparator" to sort the [Product] object in descending order-- the displayed the first object because it has the highest price;
    public static void getProdwithHighPrice(){
        Collections.sort(prodList,new PriceSortHighToLow());
        System.out.println("The Product ID of the Product with Highest Price is : "+prodList.getFirst().pid);
    }

    //this method is to calculate the total amount spent based on the given formula : singleProduct = quantity * Price;
    public static int totalAmtSpent(ArrayList<Product> i){
        int value = 0;
       for(Product p : i){
          int productPrice = p.price*p.quantity;
          value = value+productPrice;
       }
       return value ;
    }
}

package IntroductionToOopsJava;
import java.util.Scanner;
public class Account {
    static int Balance;
    static Scanner scanObj = new Scanner(System.in);


    public Account(){
        this.Balance =0;
    };

    public Account(int bal){
        Balance = bal;
    };



    public static void main(String[] args) {
        //Creating an Account Object -- > so the balance will be initialised with 0;
        Account a1 = new Account();

        //When trying to with draw an amount is the balance is 0 or more than the available balance --it will say "Insufficient balance";
        a1.withDraw(100);
        a1.deposit(1000);
        a1.withDraw(1200);
        a1.checkBalance();
    }

    //THis is the method to deposit the cash
    public  void deposit(int n1){
        //System.out.println("Enter the Amount to Deposit");
        //n1 = scanObj.nextInt();
        Balance = Balance+n1;
        System.out.println("Successfully Deposited Rs."+n1);

    }

    // this is the method to withdraw the cash
    public  void withDraw(int n1){
        if(Balance > n1) {
            Balance = Balance - n1;
            System.out.println("Successfully Withdrawn Rs." + n1);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }


    // this is the method to display the balance
    public  void checkBalance(){
        System.out.println("The Balance is : Rs."+Balance);
    }



}

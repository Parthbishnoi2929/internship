import java.util.Scanner;
import java.io.*;

class Bankaccount{
    private double balance;

    public Bankaccount(double initialbalance){
        this.balance = initialbalance;
    }
    public double getbalance(){
        return balance;
    }
    public boolean deposit(double amount){
        if(amount > 0){
            balance+=amount;
            return true;
        }
        return false;
    }
    public boolean withdraw(double amount){
        if(amount>0 && amount<= balance){
            balance-=amount;
            return true;
        }
        return false;
    }
}

 class Atminterface {
    private Bankaccount acc;
    private Scanner sc;

    public Atminterface(Bankaccount acc) {
        this.acc=acc;
        sc=new Scanner(System.in);
    }
    public void display(){
        System.out.println("\n==ATM INTERFACE==\n");
        System.out.println("1. check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
        System.out.println("Enter your choice");
    }
    private void checkbalance(){
        System.out.printf("Your current balance is : $%.2f%n", acc.getbalance());
    }
    private void deposit(){
        System.out.println("Enter amount to deposit");
        try{
            double amount=Double.parseDouble(sc.nextLine());
            if(amount<=0){
                System.out.println("Invalid amount");
                return ;
            }
            if(acc.deposit(amount)){
                System.out.printf("Successfully deposited $%.2f%n\n",amount);
                System.out.printf("New balance is : $%.2f\n",acc.getbalance());
            }else{
                System.out.println("Insufficient balance");
            }
        }catch(NumberFormatException e){
            System.out.println("Invalid amount");
        }

    }
    private void withdraw(){
        System.out.println("Enter amount to withdraw");
        try{
            double amount=Double.parseDouble(sc.nextLine());
            if(amount<=0){
                System.out.println("Invalid withdrawal amount");
            }else{
                if(acc.withdraw(amount)){
                    System.out.printf("Successfully withdrawn $%.2f%n\n",amount);
                    System.out.printf("New balance is : $%.2f\n",acc.getbalance());
                }else{
                    System.out.println("Insufficient balance");
                }
            }
        }catch(NumberFormatException e){
            System.out.println("Invalid amount");
        }
    }
    public void start(){
        while(true){
            display();
            int choice;
            try{
                choice=Integer.parseInt(sc.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Invalid input, please try again");
                continue;
            }
            switch(choice){
                case 1: checkbalance();
                break;
                case 2: deposit();
                break;
                case 3: withdraw();
                break;
                case 4:
                    System.out.println("Thankyou for Using ATM. Have a Nice day!");
                    return ;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    public static void main(String[] args) {
        Bankaccount acc=new Bankaccount(50000);
        Atminterface atm=new Atminterface(acc);
        atm.start();
    }
    

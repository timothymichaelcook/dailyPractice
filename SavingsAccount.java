public class SavingsAccount {
  
    int balance;
    
    public SavingsAccount(int initialBalance){
      balance = initialBalance;
    }
    // checkbalance method
    public void checkBalance() {
      System.out.println("Good afternoon valued customer");
      System.out.println("Your current balance is $" + balance); 
      System.out.println("");
    } 
    // deposit method
    public void deposit(int amountToDeposit) {
      balance = balance + amountToDeposit;
      System.out.println("You just deposited $" + amountToDeposit);
      System.out.println("");
    }
    // withdraw method 
    public int withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew $" + amountToWithdraw);
        System.out.println("");
        return amountToWithdraw;
        
      }
    // to string method
    public String toString(){
       return "This is a savings account with $" + balance + " saved";
    }
  
    // main method
    public static void main(String[] args){
      SavingsAccount savings = new SavingsAccount(2000);
      
      savings.checkBalance();
      //Check balance:
      //System.out.println("Hello!");
      //System.out.println("Your balance is "+savings.balance);
      
      savings.withdraw(300);
      //Withdrawing:
      //int afterWithdraw = savings.balance - 300;
      //savings.balance = afterWithdraw;
      //System.out.println("You just withdrew "+300);
  
      savings.checkBalance();
      //Check balance:
      //System.out.println("Hello!");
      //System.out.println("Your balance is "+savings.balance);
      
      savings.deposit(600);
      //Deposit:
      //int afterDeposit = savings.balance + 600;
      //savings.balance = afterDeposit;
      //System.out.println("You just deposited "+600);
      
      savings.checkBalance();
      //Check balance:
      //System.out.println("Hello!");
      //System.out.println("Your balance is "+savings.balance);
      
      savings.deposit(600);
      //Deposit:
      //int afterDeposit2 = savings.balance + 600;
      //savings.balance = afterDeposit2;
      //System.out.println("You just deposited "+600);
      
       savings.checkBalance();
      //Check balance:
      //System.out.println("Hello!");
      // System.out.println("Your balance is "+savings.balance);
  
      System.out.println(savings);
      
    }       
  }
  
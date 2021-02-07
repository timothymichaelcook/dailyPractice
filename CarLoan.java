//THIS PROGRAM CALCULATES MONTHLY CAR LOAN PAYMENTS 
//FOR ANYONE INTERSTED IN PURCHASING A NEW OR USED CAR WITH ANY FORM OF CREDIT

public class CarLoan {
	public static void main(String[] args) {

    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;

    if(loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
    } 
    else if(downPayment >= carLoan) {
      System.out.println("The car can be paid in full.");
    }
    else {
      //
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      //INTEREST PAYMENT CALCULATED
      int interest = monthlyBalance * interestRate / 100;
      //MONTHLY PAYMENT AND INTEREST PAYMENT CALCULATED
      int monthlyPayment = monthlyBalance + interest;
      //OUTPUT EXPRESSIONS
      System.out.println("Your carloan will be $" + carLoan + ".");
      System.out.println("Your downPayment will be $" + downPayment + ".");
      System.out.println("Your interest rate will be $" + interest + " a month.");
      System.out.println("Your principal will be $" + monthlyBalance + " a month.");
      System.out.println("Your payment will be $" + monthlyPayment + " a month.");
    }

	

	}
}
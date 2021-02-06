//This program is a simple calculator that does simple calculations on whole numbers.

public class BasicCalculator {
    //instance fields
    public BasicCalculator(){
  
    }
    //operation methods begin
    public int add(int a, int b) {
      return a + b;
    }
  
    public int subtract(int a, int b) {
      return a - b;
    }
  
    public int multiply(int a, int b) {
      return a * b;
    }
  
    public int divide(int a, int b) {
      return a / b;
    }
  
    public int modulo (int a, int b) {
      return a % b;
    }
  
    //main method
    public static void main(String[] args) {
      BasicCalculator myCalculator = new BasicCalculator();
  
      System.out.println(myCalculator.add(5, 7));
      System.out.println(myCalculator.subtract(45, 11));
    }
  }
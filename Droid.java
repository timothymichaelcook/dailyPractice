public class Droid {
    //INSTANCE FIELDS
    int batteryLevel;
    String name;
  
    //CONSTRUCTOR METHOD
    public Droid(String droidName) {
      name = droidName;
      batteryLevel = 100;
    }
    //TOSTRING METHOD
    public String toString() {
      return "Hello, I'm the droid named " + name;
    }
  
    //PERFORM METHOD
    public void performTask(String task) {
      batteryLevel -= 10;
      System.out.println(name + " is currently performing the task of " + task);
    }
    //ENERGY REPORT
    public void energyReport() {
      //return batterLevel;
      System.out.println(name + "'s battery level is now at " + batteryLevel + "%");
    }
  
    //RECHARGE BATTERY
    public void rechargeBattery() {
      batteryLevel = 100;
      System.out.println("DROID OFFLINE: " + name + " is currently charging");
      System.out.println("DROID ONLINE: " + name + "'s battery level is now at " + batteryLevel + "%");
    }
  
  
  
    //MAIN METHOD
    public static void main(String[] args) {
      Droid codey = new Droid("Codey");
      System.out.println(codey);
      codey.performTask("cleaning");
      codey.energyReport();
      codey.performTask("cooking");
      codey.energyReport();
      codey.performTask("walking the dog");
      codey.energyReport();
      codey.rechargeBattery();
      codey.performTask("cooking");
      codey.energyReport();
        }
  }
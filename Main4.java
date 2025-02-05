class Vehicle {
  public void start() {
      System.out.println("Vehicle is starting.");
  }

  public void stop() {
      System.out.println("Vehicle is stopping.");
  }
}
class Car extends Vehicle {
  public void openTrunk() {
      System.out.println("Car trunk is opened.");
  }
}
class SportsCar extends Car {
  public void turboBoost() {
      System.out.println("SportsCar turbo boost activated!");
  }
}
public class Main4   {
  public static void main(String[] args) {
      // Create an object of SportsCar
      SportsCar mySportsCar = new SportsCar();

      // Call methods from all levels of the hierarchy
      System.out.println("SportsCar Actions:");
      mySportsCar.start();        // Method from Vehicle
      mySportsCar.openTrunk();    // Method from Car
      mySportsCar.turboBoost();   // Method from SportsCar
      mySportsCar.stop();         // Method from Vehicle
  }
}

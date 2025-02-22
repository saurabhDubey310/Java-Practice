abstract class Vehicle {
  abstract void run();
}

class Car extends Vehicle {
  
  @Override
  void run() {
      System.out.println("The car is running smoothly on the road.");
  }
  void fuelType() {
      System.out.println("The car uses petrol or diesel as fuel.");
  }
}


public class ab {
  public static void main(String[] args) {
      Car myCar = new Car();
      myCar.run();
      myCar.fuelType();
  }
}

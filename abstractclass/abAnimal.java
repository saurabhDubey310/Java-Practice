abstract class Animal {
    
  abstract void sound();

  
  void eat() {
      System.out.println("This animal eats other animal.");
  }
}


class Lion extends Animal {
  
  @Override
  void sound() {
      System.out.println("Lion roars: Roarrr!");
  }
}

class Tiger extends Animal {
  
  @Override
  void sound() {
      System.out.println("Tiger growls: Grrrr!");
  }
}


public class abAnimal {
  public static void main(String[] args) {
      
      Animal lion = new Lion();
      System.out.println("What does lion do :");
      lion.sound();  
      lion.eat();   

      System.out.println();

   
      Animal tiger = new Tiger();
      System.out.println("What does Tiger do :");
      tiger.sound();  
      tiger.eat();   
  }
}
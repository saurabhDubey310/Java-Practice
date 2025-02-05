package dogs;

import animals.Animal; // Import the parent class from the animals package

// Subclass in a different package
public class Dog extends Animal {

    public void setDetails(String name) {
        this.name = name; // Accessing protected variable
    }

    public void showDetails() {
        displayInfo(); // Accessing protected method
    }
}

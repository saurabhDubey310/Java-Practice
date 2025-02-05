// Parent class
class Bank {
  public void showInterestRate() {
      System.out.println("General bank interest rate is 3%");
  }

  public void accountType() {
      System.out.println("This is a general bank account.");
  }
}
// Subclass for savings account
class SavingsAccount extends Bank {
  @Override
  public void showInterestRate() {
      System.out.println("Savings Account interest rate is 4%");
  }

  public void savingsFeature() {
      System.out.println("Savings Account: Provides interest on savings.");
  }
}
// Subclass for current account
class CurrentAccount extends Bank {
  @Override
  public void showInterestRate() {
      System.out.println("Current Account interest rate is 0%");
  }

  public void currentFeature() {
      System.out.println("Current Account: Suitable for businesses with overdraft facility.");
  }
}
public class Main3 {
  public static void main(String[] args) {
      // Create an object of SavingsAccount
      SavingsAccount savings = new SavingsAccount();
      System.out.println("Savings Account Details:");
      savings.showInterestRate();  // Call overridden method
      savings.accountType();       // Call parent method
      savings.savingsFeature();    // Call subclass-specific method

      System.out.println();

      // Create an object of CurrentAccount
      CurrentAccount current = new CurrentAccount();
      System.out.println("Current Account Details:");
      current.showInterestRate();  // Call overridden method
      current.accountType();       // Call parent method
      current.currentFeature();    // Call subclass-specific method
  }
}

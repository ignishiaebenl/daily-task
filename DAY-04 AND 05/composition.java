class Battery {
  int capacity;
  Battery(int capacity) {
    this.capacity = capacity;
  }
}

class Mobile {
  Battery b;
  Mobile(int capacity) {
    b = new Battery(capacity);
  }

  void showBattery() {
    System.out.println("Battery: " + b.capacity);
  }
}

public class Main {
  public static void main(String[] args) {
    Mobile c = new Mobile(5000);
    c.showBattery();  // Display the battery capacity
  }
}
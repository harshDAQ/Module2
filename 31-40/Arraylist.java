import java.util.ArrayList;

public class Arraylist {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo"); //Adding elements to the ArrayList
    cars.add("BMW");
    cars.add("Audi");
    System.out.println(cars);
    cars.add(0, "Mercedes"); //Adding element at specific position
    System.out.println(cars);
    cars.set(1, "Range Rover"); //Setting an element at specified index to something else
    System.out.println(cars);
    System.out.println(cars.get(2)); //Finding car at index 2
    cars.remove(2); // Removing Element
    System.out.println(cars);
    System.out.println(cars.size());
  }
}

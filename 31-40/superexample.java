class Vehicle{
    int maxspeed = 220;
    Vehicle(){
        int model = 120;
        System.out.println("Vehicle Class Constructor max speed is "+model);
    }

    void random(){
        System.out.println("This is the superclass");
    }
}

class NewCar extends Vehicle{
    int maxspeed = 200;
    NewCar(){
        super();
        int model = 180;
        System.out.println("NewCar Class Constructor max speed is "+model);       
    }
    void display(){
        System.out.println("Maximum Vehicle class speed is: "+super.maxspeed);
        System.out.println("Maximum NewCar class speed is: "+maxspeed);
    }

    void random(){
        System.out.println("This is the subclass");
        super.random();
    }
}

public class superexample {
    public static void main(String[] args) {
        NewCar obj = new NewCar();
        obj.display();
        obj.random();
    }
}

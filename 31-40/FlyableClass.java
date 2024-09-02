interface Flyable {
    void fly_obj();
}

class SpaceCraft implements Flyable{
    @Override
    public void fly_obj(){
        System.out.println("SpaceCraft");
    }
    
}

class Airplane implements Flyable{
    @Override
    public void fly_obj(){
        System.out.println("Airplane");
    }
    
}

class Helicopter implements Flyable{
    @Override
    public void fly_obj(){
        System.out.println("Helicopter");
    }
    
}

public class FlyableClass {
    public static void main(String[] args) {
        SpaceCraft plane = new SpaceCraft();
        Airplane plane2 = new Airplane();
        Helicopter plane3 = new Helicopter();

        plane.fly_obj();
        plane2.fly_obj();
        plane3.fly_obj();
    }
}

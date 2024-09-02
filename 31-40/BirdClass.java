abstract class Birds{
    abstract void fly();
    abstract void makeSound();
}

class Eagle extends Birds{
    void fly(){
        System.out.println("Wings");
    }
    void makeSound(){
        System.out.println("WTF IS A KILOMETER");
    }
}

class Hawk extends Birds{
    void fly(){
        System.out.println("Wings");
    }

    void makeSound(){
        System.out.println("Hawk Thua");
    }
}

public class BirdClass {
    public static void main(String[] args) {
        Eagle bird = new Eagle();
        Hawk thua = new Hawk();

        bird.fly();
        bird.makeSound();
        thua.fly();
        thua.makeSound();
    }
}

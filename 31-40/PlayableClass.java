interface Playable {
    void play();
}

class Football implements Playable {
    @Override
    public void play() {
        System.out.println("I'm playing Football");
    }
}

class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("I'm playing Volleyball");
    }
}

class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("I'm playing Basketball");
    }
}

public class PlayableClass {
    public static void main(String[] args) {
        Football ball = new Football();
        ball.play();

        Basketball lebron = new Basketball();
        lebron.play();

        Volleyball Karasuno = new Volleyball();
        Karasuno.play();
    }
}
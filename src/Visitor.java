public class Visitor extends Human{
    @Override
    public void move() {
        System.out.println("I am a visitor.");
        super.move();
    }

    @Override
    void watch(){
        super.watch();
        System.out.println("I came to the zoo to see them.");
    }

    void beElated(){
        System.out.println("Ooh, so cool!");
    }
}

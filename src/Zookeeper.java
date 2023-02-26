public class Zookeeper extends Human{
    @Override
    public void move() {
        System.out.println("I am a zookeeper.");
        super.move();
    }

    @Override
    void watch() {
        super.watch();
        System.out.println("It's my job.");
    }

    void moveCommand(Animal animal){
        System.out.println("I will now ask " + animal + " to move.");
        animal.move();
    }

    void voiceCommand(Animal animal){
        System.out.println("I will now ask " + animal + " to make some noise.");
        animal.voice();
    }
}

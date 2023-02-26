public class Crow extends Animal{
    @Override
    public void move(){
        System.out.println("I am a crow. I can fly and hop around.");
    }

    @Override
    void voice(){
        System.out.println("Caw!");
    }
}

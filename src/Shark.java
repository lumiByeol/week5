public class Shark extends Animal{
    @Override
    public void move(){
        System.out.println("I am a shark. I swim very fast!");
    }

    @Override
    void voice(){
        System.out.println("I can't speak.");
    }
}

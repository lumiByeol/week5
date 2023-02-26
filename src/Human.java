public abstract class Human implements Move{
    @Override
    public void move(){
        System.out.println("I am human. I walk around the zoo.");
    }
    void watch(){
        System.out.println("I watch animals.");
    }
}

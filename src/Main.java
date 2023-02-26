public class Main {
    public static void main(String[] args){
        Zookeeper zookeeperDave = new Zookeeper();
        Visitor visitorJane = new Visitor();

        Cheetah cheetah = new Cheetah();
        Shark shark = new Shark();
        Crow crow = new Crow();

        zookeeperDave.move();
        System.out.println("----------");
        visitorJane.move();
        System.out.println("----------");
        visitorJane.watch();
        System.out.println("----------");
        zookeeperDave.watch();
        System.out.println("----------");
        zookeeperDave.moveCommand(cheetah);
        System.out.println("------");
        zookeeperDave.moveCommand(shark);
        System.out.println("------");
        zookeeperDave.moveCommand(crow);
        System.out.println("------");
        zookeeperDave.voiceCommand(cheetah);
        System.out.println("------");
        zookeeperDave.voiceCommand(shark);
        System.out.println("------");
        zookeeperDave.voiceCommand(crow);
        System.out.println("------");
    }
}

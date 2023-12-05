public class Main {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari();
        System.out.println(ferrari.getHiz());

        ferrari.calistir();
        ferrari.calistir();
        System.out.println(ferrari.getHiz());

        ferrari.turboCalistir();
        ferrari.klimaCalistir();

    }
}
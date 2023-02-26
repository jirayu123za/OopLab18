public class Lab18 {
    public static void main(String[] args) {
        Thread t1 = new ThreeThread(1);
        Thread t2 = new ThreeThread(2);
        Thread t3 = new ThreeThread(3);

        t1.start();
        t2.start();
        t3.start();

    }
}
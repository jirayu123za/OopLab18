public class ThreeThread extends Thread{
    protected int threadNum;

    public ThreeThread(int num){
        this.threadNum = num;
    }

    public void run(){
        for (int i = 1; i<=100; i++)
            System.out.println("thread #" + threadNum + ": " + i);
    }
}

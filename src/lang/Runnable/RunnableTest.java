package lang.Runnable;

public class RunnableTest implements Runnable {
    @Override
    public void run() {
        System.out.println("pieces of code, that runs at the same time");
    }

    public static void main(String[] args) {
        Thread thr1 = new Thread(new RunnableTest());

        thr1.start();
    }
}

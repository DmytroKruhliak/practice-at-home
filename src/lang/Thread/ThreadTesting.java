package lang.Thread;

public class ThreadTesting extends Thread{

    public ThreadTesting(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Hello I'm a Thread, and I'm running now!");
        System.out.println("my name is: " + this.getName());

    }

    public static void main(String[] args) {

        ThreadTesting tt1 = new ThreadTesting("holla1");
        ThreadTesting tt2 = new ThreadTesting("holla2");
        ThreadTesting tt3 = new ThreadTesting("holla3");

        tt1.start();
        tt2.start();
        tt3.start();


    }

}

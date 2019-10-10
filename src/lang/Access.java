package lang;

public class Access {
     private int count = 0;

     void start() {
        System.out.println(count);
        count = 4;
        int count = 7;
        this.count++;
        System.out.println(count);

    }

    public static void main(String[] args) {
    }
}

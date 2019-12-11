package lang.if_statement;

public class GreatIfTest {
    public static void main(String[] args) {
        if (false){
            System.out.println("1st block is running");
        }else if (true){
            System.out.println("2nd block is running");
        } else {
            System.out.println("else block");

        }
    }
}

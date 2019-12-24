package book.chapter3.operators.page110toBinaryString;

public class BinaryStr {
    static int a = -0x44;
    static int b = 0x61;

    public static void main(String[] args) {
//        System.out.println(a & b);
//        System.out.println(a & b);
        System.out.println(Integer.toBinaryString((a)));
        System.out.println(Integer.toBinaryString((2<<a)));
        System.out.println(Integer.toBinaryString((b)));
        System.out.println(Integer.toBinaryString((a & b)));
        System.out.println(Integer.toBinaryString((a | b)));
        System.out.println(Integer.toBinaryString((a ^ b)));
        System.out.println(Integer.toBinaryString((~b)));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));


    }
}

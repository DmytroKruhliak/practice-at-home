package book.chapter4.control.page130_131;

public class MyOwnToBinaryStr {
    public static void main(String[] args) {
        int d = 9;
        System.out.println(Integer.toBinaryString(d).length());
        System.out.println(Integer.toBinaryString(d));
        System.out.println(getBinaryRepresentation(d));

    }

    public static String getBinaryRepresentation(int num) {
        String result = "";
        for (int i = 0; i <= Integer.toBinaryString(num).length(); i++) {
            result += ((num & 1 << i) == 1) ? "1" : "0";
        }
        return result;
    }


}

package book.chapter4.control.page130_131;

public class MyOwnToBinaryStr {
    public static void main(String[] args) {
        int d = Integer.MAX_VALUE;
        System.out.println(Integer.toBinaryString(d));
        System.out.println(getBinaryRepresentation(d));

    }

    public static String getBinaryRepresentation(int num) {
        String result = "";
        int maxDigit = Integer.toBinaryString(num).length();

        for (int i = maxDigit-1; i >= 0; i--) {
            result += ((num & 1 << i) >= 1) ? "1" : "0";
        }
        return result;
    }


}

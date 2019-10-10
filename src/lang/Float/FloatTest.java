package lang.Float;

public class FloatTest {
    public static void main(String[] args) {
        float f = 0.0f;
        for (int i = 1; i < 11; i++) {
            f += 0.1111111;
        }
        float d = 0.1f*11;
        System.out.println(f);
        System.out.println(d);
        System.out.println(d == f);
    }
}

package book.chapter3.operators.page98aliasing;

public class AliasingTest {
    public static void main(String[] args) {
        FloatFieldedClass ffClass = new FloatFieldedClass();
        ffClass.f = 55f;

        System.out.println(ffClass.f);
        makePiNumb(ffClass);

        System.out.println(ffClass.f);
        System.out.println("hello see this PIx2: " + (int) (2 * ffClass.f));
    }

    static void makePiNumb(FloatFieldedClass ff) {
        ff.f = 3.14f;
    }

}

class FloatFieldedClass {
    float f;
}
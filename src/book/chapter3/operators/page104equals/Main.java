package book.chapter3.operators.page104equals;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {
        byte b = 5;
        short s = b; // в переменную типа short легко присваивается переменная типа byte
        System.out.println(s + " " + b); // выводим на жкран оба числа

        long lng = 2019L;
        int i = (int) lng; // для того чтобы значение типа long преобразовать в int необходимо вып. явное преобраз. (int)
        System.out.println(i + " " + lng);

        char c = 'g';
        float f = (byte)c; // переменную типа char преобразовали в float с помощью "сужающего приведения"
        System.out.println(f);

        double g = 0.5d;
        System.out.println(Math.round(g)); // пример классического округления с пом. метода Math.round();

        System.out.println(454.874 % 127);
        System.out.println((byte) 454.874);

        char c1 = 'a';
        char c2 = 'b';
        System.out.println(c1++);
        System.out.println(++c2);
        System.out.println(c1);


    }

    private String testStaticMethod() {
        String a = "0";
        return "1";
    }

}



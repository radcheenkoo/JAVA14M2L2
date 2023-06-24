public class Main {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        a++;
        ++a;
        System.out.println("a = " + a);

        b--;
        --b;
        System.out.println("b = " + b);

        System.out.println(a++ + ++a);

        int o = 0;
        System.out.println("o+=2 = " + (o += 2));
        System.out.println("o-=3 = " + (o -= 3));

        o = 5;
        System.out.println("o*=2 = " + (o *= 2));

        o *= 2;
        o = o * 2;

        o -= 2;
        o = o - 2;

        //sixEx();
        //fourthEx();
        //thirdEx();
        //secondEx();
        //firstEx();
    }

    public static void elevenEx() {
        int a = 7;
        int b = 8;
        int c = 20;

        int r1 = a + b;
        int r2 = a - b;
        int r3 = a / b;
        double d3 = a / b;
        int r4 = a * b;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(d3);
        System.out.println(r4);
        System.out.println("int c / a = " + c / a);
        double d1 = c / a;
        System.out.println("double c / a = " + d1);

        System.out.println("Math.pow(2, 8) = " + Math.pow(2, 8));
        System.out.println("Math.sqrt(16) = " + Math.sqrt(16));


        System.out.println("c 20 % a 7 = " + c % a);
        System.out.println("21 % 7 = " + 21 % 7);
        System.out.println("22 % 7 = " + 21 % 7);
    }

    public static void tenEx() {
        int a = 7;
        int b = 9;

        System.out.println("a == b  ->  " + (a == b));
        System.out.println("a != b  ->  " + (a != b));
        System.out.println("a <= b  ->  " + (a <= b));
        System.out.println("a >= b  ->  " + (a >= b));
        System.out.println("a > b  ->  " + (a > b));
        System.out.println("a < b  ->  " + (a < b));
        boolean boll = a < b;
        System.out.println("boll = " + boll);
    }

    public static void nineEx() {
        //boxing упаковка
        int a = 7;
        Integer objA = a;
        Integer objA2 = (Integer) a;

        //unboxing розпаковка
        Integer objB = Integer.valueOf(8);
        int b = objB;
        int b2 = (int) objB;
    }

    public static void sevenEx() {
        Integer integerObj1 = Integer.valueOf(5);
        Integer integerObj2 = Integer.valueOf(5);
        Integer integerObj3 = Integer.valueOf(5555);

        int a1 = 5;
        int a2 = 5;
        int a3 = 6;

        System.out.println(a1 == a2);
        System.out.println(a1 == a3);

        boolean b1 = (a1 == a2);
        boolean b2 = a1 == a3;

        System.out.println(integerObj1.equals(integerObj2));
        System.out.println(integerObj1.equals(integerObj3));

        System.out.println(integerObj1 == integerObj3);
        System.out.println(integerObj1 == integerObj2);
    }

    public static void sixEx() {
        boolean b = true;
        Boolean b2 = Boolean.FALSE;

        Integer i = Integer.MIN_VALUE;
    }

    public static void fourthEx() {
        boolean b = true;
        boolean a = false;
        System.out.println(b);
        System.out.println(a);
    }

    public static void thirdEx() {
        char c = 'a';  // 2 byte
        char c2 = 99;

        System.out.println(c);
        System.out.println(c2);
        System.out.println(c2 + 2);
        System.out.println((char)(c2 + 2));
    }

    public static void secondEx() {
        float f = 1F;
        float f2 = 3F;   //4 byte
        double d = 4.3;  //8 byte

        System.out.println(f / f2);
    }

    public static void firstEx() {
        int i = -258;

        byte b = (byte) i;
        short s = 129;

        long l = 99999999999912323L;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
    }
}
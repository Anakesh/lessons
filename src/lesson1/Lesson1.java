package lesson1;

public class Lesson1 {
//    psvm
    public static void main(String[] args) {

        // однострочные комментарии
        /*
        многострочный комментарий
         */
        System.out.println("Lesson1"); // sout

        // объявление переменных
//        типДанных имяПеременной;

//        имяПеременной = значение;

//        типДанных имяПеременной1, имяПеременной2, имяПеременной3;
        // byte
        // short
        // int
        // long
        // float
        // double
        // boolean
        // char

//        ссылочные типы данных
//        String
//        массивы
//        классы
//        интерфейсы
//
        byte byteVar; // (8 бит) -128 127
        byteVar = 1;
        byte byteVar2 = 2;
//        byte byteVar3 = byteVar + byteVar2; // int

        short shortVar; // (16 бит) -32768 до 32767
        shortVar = 90;
        short a = 2;
        short b = 3;
//        short c = a + b; // int

//        int (32 бита)
        int intVar = 1_000_000; //1000000
        int intVar2 = 3;
        int intVar3 = 8;
        int intVar4 = intVar3 / intVar2;

//        long (64 бита)
        long x = 6000000000L;

        // типы данных с плавающей точкой
//        float (32 бита) double (64бита)
        float floatVar = 0.4F;
        double doubleVar = 0.4;

        boolean isActive = true;
        boolean started = false;


        // приведение типов
        // автоматическое преобразование
//        byte byteNum = 23;
//        int intNum = byteNum;

        // явное приведение типов
//        int intNum = 23;
//        byte byteNum = (byte) intNum;

        float floatNum = 3.545F;
        int intNum = (int) floatNum;

//        System.out.println(intNum);

        // арифметические операторы
         // + | - | * | / | %

        long long1 = 78;
        int int1 = 12;
        int res = (int) long1 + int1;

//        System.out.println(9%2);

//        инремент i++ ++i
        int i = 2;
        int j = 2;
        System.out.println(i++);  // 2
        System.out.println(i); // 3
        System.out.println(++j); // 3
//        декремент
        int l = 2;
        int k = 2;
//        System.out.println(l--);
////        System.out.println(l);
////        System.out.println(--k);

        // операторы сравнения
        // > | < | == | >= | <= | !=

//        логичекие операторы
//        a && c
//        a & c

//          a || c
//          a | c

//       (a != 0) && (b != 0)

//        a = true;
//        !a

        // a ^ b

//        операторы присваивания
//        = | += | -= | *= | /= | %=
        int d = 3;
        d = d + 4; d += 4;
        d = d - 4; d -= 4;
        d *= 4;

        // тернарный оператор
        // переменная y = (условие) ? выражение1 : выражение2;
    }
}

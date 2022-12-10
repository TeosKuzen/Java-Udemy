public class Test {
    package org.example;

    public class Main {
        public static void main(String[] args) {

            /**
             Первое занятие

             System.out.println("Hello world!");
             byte value = 5; // (-128-127)
             short shortValue = 100; // (-32668-32667)
             int c;
             c = 1000000;
             long d = -1222222222;

             System.out.println(value);
             System.out.println("short: " + shortValue);
             System.out.println("int :" + c);
             System.out.println("long: " + d);

             double double1 = 133.555;
             System.out.println("double:" + double1);

             boolean boolean1 = true;
             boolean boolean2 = false;

             System.out.println(boolean1);
             System.out.println(boolean2);

             boolean boolean3 = 1 + 2 > 0;
             boolean boolean4 = 1 + 2 > 5;

             System.out.println(boolean3);
             System.out.println(boolean4);

             String string = "Pupsik";
             char a = 'a';
             char b = 'b';
             char s = 's';

             System.out.println(a + b + s);



             Второе занятие


             String[] names = new String[3];
             String[] name = new String[3];


             name[0] = "Vasia";
             name[1] = "Petya";
             name[2] = "Vanya";

             System.out.println(name[0]);
             System.out.println(name[2]);

             int[] array = {15, 10, 100, 9, 44};
             System.out.println(array[0]);
             System.out.println(array[1]);
             System.out.println(array[2]);


             int[] arr = new int [15];

             for (int j = 0; j < 15; j++)
             {
             arr[j] = j * 10;
             System.out.println(arr[j]);
             }
             */





            double e = 15;
            double f = 7;


            int a = 10;
            int b = 20;

            System.out.println();
            System.out.println(e / f);
            System.out.println(a % b);

            int i = 0;
            i++; // i + 1
            System.out.println(i);
            i--; // i - 1
            System.out.println(i);

            i = 5;
            System.out.println(i++);
            System.out.println(i);
            i = 3;
            System.out.println(a);
            i = 3;
            System.out.println(a);

            System.out.println();
            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a - 5 >= b);
            System.out.println(a - 5 <= b);
            System.out.println(a == b);
            System.out.println(a != b);
            System.out.println(a + 10 <= b + 15);
            System.out.println(!(a + 10 <= b + 15));
            System.out.println(!(false));


            System.out.println(a > b || a < b);
            System.out.println(a > b || b > 30);
            System.out.println(a > b && a < b);
            System.out.println(a > 9 && b == 20);

            System.out.println(a + 10 > 15 || b - 5 > 10 && a < b);



            String h = "5";
            int s = Integer.parseInt(h);
            System.out.println(s + 10);
        }
    }
}

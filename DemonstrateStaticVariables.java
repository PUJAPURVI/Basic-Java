package com.bridgelabzDay1;

public class DemonstrateStaticVariables {

        static int x = 10;
        static int y;
        static void func(int z) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
    static {
        System.out.println("Running static initialization block.");
        y = x + 10;
    }
    public static void main(String args[]) {
        func(8);

    }
}




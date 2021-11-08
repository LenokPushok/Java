package lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        fromAtoB(a, b);
    }

    static void fromAtoB(int a, int b) {
        if (a == b) {
            System.out.print(a+" ");
            return;
        }
        if (a < b) {
            System.out.print(a+" ");
            fromAtoB(++a, b);
        } else {
            System.out.print(a+" ");
            fromAtoB(--a, b);
        }
    }
}

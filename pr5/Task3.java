package lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sum(n));
    }

    static int sum(int n) {
        if (n==0) {
            return 0;
        }
        return n%10 + sum(n/10);
    }
}

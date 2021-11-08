package lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int s[] = new int[10];
        for (int i=0; i<10; i++) {
            s[i] = in.nextInt();
        }
        int d = in.nextInt();
        kWithD(k, s, d, 0, 0);
        //System.out.println(kWithD(0,0,k,s));
    }

    static void kWithD(int k, int[] s, int d, int i, int res) {
        if (i >= s.length) {
            System.out.println(res);
            return;
        }
        if (sum(s[i]) == d && (s[i]+"").length() == k) {
            kWithD(k, s, d, ++i, ++res);
        } else {
            kWithD(k, s, d, ++i, res);
        }
    }

    static int sum(int n) {
        if (n==0) {
            return 0;
        }
        return n%10 + sum(n/10);
    }

    /*
    static int kWithD(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int result = 0;
        int n = (len == 0 ? 1 : 0);
        for (int i = n; i < 10; i++) {
            result += kWithD(len + 1, sum + i, k, s);
        }
        return result;
    }*/
}

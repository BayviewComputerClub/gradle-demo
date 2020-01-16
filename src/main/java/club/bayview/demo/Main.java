

package club.bayview.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("this is a gradle project amirite");

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt();
        System.out.printf("%d + %d = %d", a, b, a+b);
    }
}

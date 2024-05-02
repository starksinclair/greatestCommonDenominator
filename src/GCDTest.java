import java.util.Scanner;

public class GCDTest {



    public static void main(String[] args) {
        GCD gcd = new GCD();
        int n1, n2;
        Scanner scrn = new Scanner(System.in);

        System.out.println("Enter first number: ");
        n1 = scrn.nextInt();
        System.out.println("Enter second number: ");
        n2 = scrn.nextInt();

        int gcdFor = gcd.findGCDForLoop(n1, n2);
        System.out.println("The gcd for For Loop: " + gcdFor);

        int gcdWhile = gcd.findGCDWhileLoop(n1, n2);
        System.out.println("The gcd for While Loop: " + gcdWhile);

        int gcdRecursive = gcd.findGCDRecursively(n1, n2);
        System.out.println("The gcd for Recursive: " + gcdRecursive);
    }

}

import java.util.Scanner;

public class GCD {
    public static int findGCDForLoop(int no1, int no2){
        int gcd = 1;
        no1 = Math.abs(no1);
        no2 = Math.abs(no2);
        for (int i = 1; i < Math.min(no1, no2); i++) {
            if (no1 % i == 0 && no2 % i ==0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static int findGCDWhileLoop(int no1, int no2){
       no1 = Math.abs(no1);
       no2 = Math.abs(no2);

        while (no1 != no2){
            if(no1 > no2){
                no1 -= no2;
            }
            else {
                no2 -= no1;
            }
        }
        return  no1;
    }
    public static int findGCDRecursively(int no1, int no2){
        if (no2 == 0){
           return no1;
        }
        return findGCDRecursively(no2, no1 % no2);
    }
    public static void main(String[] args) {


        
    }
}

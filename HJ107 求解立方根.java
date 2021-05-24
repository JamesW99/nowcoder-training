import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        if (number<0) {
            System.out.println(-cube(Math.abs(number)));
        } else System.out.println(cube(Math.abs(number)));

    }

    public static double cube(double number){
        double a = number;
        if (number < 1 && number!=0){
            if (number>0)
                a=1;
        }
        double b = 0;
        double c = (a + b) / 2;

        while (getNumberDecimalDigits(c) < 14) {
            if ((c * c * c) > number) {
                a = (a + b) / 2;
                c = (a + b) / 2;
            } else if ((c * c * c) < number) {
                b = (a + b) / 2;
                c = (a + b) / 2;
            } else
                break;
        }
        return (approximate(c));
    }

    public static double approximate(double t) {
        BigDecimal b = new BigDecimal(t);
        return b.setScale(1, RoundingMode.HALF_UP).doubleValue();
    }
    
    //https://www.cnblogs.com/linkstar/p/8955779.html
    public static int getNumberDecimalDigits(double number) {
        if (number == (long) number) {
            return 0;
        }
        int i = 0;
        while (true) {
            i++;
            if (number * Math.pow(10, i) % 1 == 0) {
                return i;
            }
        }
    }
}
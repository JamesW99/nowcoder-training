import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float stdin = scanner.nextFloat();

        int e = (int) stdin;
        int first = (int) ((stdin-e)*10);

        if (first>=5) {
            System.out.println(e+1);
        } else
            System.out.println(e);
    }
}

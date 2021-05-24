import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        char[] arr = Integer.toBinaryString(number).toCharArray();

        int counter = 0;
        int i = 0;
//        System.out.println(arr[0]);
        while (i < arr.length) {
            if (arr[i] == '1') {
                counter += 1;
            }
            i++;
        }
        System.out.println(counter);
    }

    public static String getType(Object o) {
        return o.getClass().toString();
    }
}
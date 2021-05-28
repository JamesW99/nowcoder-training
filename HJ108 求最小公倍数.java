import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        lcm(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]));
    }


    public static void lcm(int a, int b) {
        int i=2;
        while (true){
            if (i*a%b==0){
                System.out.println(i*a);
                break;
            }
            i++;
        }
    }
}
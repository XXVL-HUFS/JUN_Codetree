import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[] {"apple", "banana", "grape", "blueberry", "orange"};

        char a = sc.next().charAt(0);
        int count = 0;

        for (int i = 0; i < 5; i ++) {
            if (arr[i].charAt(2) == a || arr[i].charAt(3) == a) {
                System.out.println(arr[i]);
                count ++;
            }
        }
        System.out.println(count);
    }
}
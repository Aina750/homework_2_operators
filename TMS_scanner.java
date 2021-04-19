import java.util.Scanner;

public class TMS_scanner {
    public static void main(String[] args) {
        System.out.println("number: 5");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++){
            sum = sum + i;
        }
        System.out.println (sum);
    }

}

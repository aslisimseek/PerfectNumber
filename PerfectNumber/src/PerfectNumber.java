import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a Number...:");
        int number = scanner.nextInt();
        int total = 0;
        for (int i = 1; i < number;  i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        if (total == number){
            System.out.println("Selected Number is Perfect Number");
        }else {
            System.out.println("Selected Number is  not Perfect Number");
        }
    }
}

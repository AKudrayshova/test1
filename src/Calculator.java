import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator1 cal = new Calculator1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num1 = scanner.nextInt();
        System.out.println("Введите операцию:");
        char operation = scanner.next().charAt(0);
        System.out.println("Введите число:");
        int num2 = scanner.nextInt();
        cal.calc(num1,num2,operation);

    }
}

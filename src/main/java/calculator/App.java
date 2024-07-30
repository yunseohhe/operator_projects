package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요 : ");
        char operator = sc.next().charAt(0);

        int result = 0;
        if (operator == '+') {
            result = num1 + num2;

        } else if (operator == '-') {
            result = num1 - num2;

        } else if (operator == '*') {
            result = num1 * num2;

        } else if (operator == '/') {
            result = num1 / num2;

        } else if (operator == '%') {
            result = num1 % num2;

        }
        System.out.println("결과: " + result);
    }
}

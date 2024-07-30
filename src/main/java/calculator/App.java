package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrResult = new int[10];
        int count = 0;
        int result = 0;
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 : ");
            char operator = sc.next().charAt(0);


            if (operator == '+') {
                result = num1 + num2;
                arrResult[count++] = result;

            } else if (operator == '-') {
                result = num1 - num2;
                arrResult[count++] = result;

            } else if (operator == '*') {
                result = num1 * num2;
                arrResult[count++] = result;

            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                    continue;
                }
                result = num1 / num2;
                arrResult[count++] = result;


            } else if (operator == '%') {
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                    continue;
                }
                result = num1 % num2;
                arrResult[count++] = result;


            } else {
                System.out.println("사칙연산을 잘못입력하셨습니다.");
            }
            System.out.println("결과: " + result);

            if (count >= 9) {
                for (int i = 0; i < arrResult.length - 1; i++) {
                    arrResult[i] = arrResult[i + 1];
                }
                arrResult[count] = result;
            } else {
                arrResult[count++] = result;
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String strExit = sc.next();
            if (strExit.equals("exit")) {
                break;
            }

        }
    }
}
}

package site.metacoding.ex21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // InputMismatchException

        // 통신, 사용자입력 예외처리.
        boolean check = true;

        try {
            while (check) {
                int x = sc.nextInt();
                int result = x / 0;
                System.out.println("입력 받은 값 : " + x);
                check = false;
            }
        } catch (InputMismatchException e) {
            System.out.println("==========================");
            System.out.println("=====문자 입력 하지마=====");
            System.out.println("==========================");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("==========================");
            System.out.println("=====0으로 나눔 하지마=====");
            System.out.println("==========================");
            e.printStackTrace();
        }
    }

}

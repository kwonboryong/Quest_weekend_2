package Quest;

import java.util.Scanner;

// 내가 해본거 (정답 아님)

public class Quset4_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("----------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("----------------------");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            int amount; // 사용자 입력 금액을 담는 변수

            if (choice == 1) {
                System.out.print("입금액을 입력하세요: ");
                int deposit = scanner.nextInt();
                balance += deposit;
                System.out.println(deposit + "원을 입금하였습니다. 현재 잔액: " + balance);

            } else if (choice == 2) {
                System.out.print("출금액을 입력하세요: ");
                int withdraw = scanner.nextInt();
                balance -= withdraw;
                System.out.println(withdraw + "원을 출금하였습니다. 현재 잔액: " + balance);

                if (balance < withdraw) {
                    System.out.print("출금액을 입력하세요: ");
                    withdraw = scanner.nextInt();
                    System.out.println(withdraw + "원을 출금하려 했으나 잔액이 부족합니다.");
                }
            } else if (choice == 3) {
                System.out.println("현재 잔액: " + balance);

            } else if (choice == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }
    }
}

package Quest;

import java.util.Scanner;

public class Quset4_1__09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0; // 잔액

        while (true) {
            System.out.println("----------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("----------------------");

            System.out.print("선택: ");
            int choice = scanner.nextInt(); // 사용자의 메뉴 선택

            int amount; // 사용자 입력 금액을 담는 변수

            switch (choice) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    amount = scanner.nextInt(); // 사용자의 입력
                    balance = deposit(balance, amount); // balance는 잔액
                    break; // 다시 while문(첫 문장)으로 돌아간다.
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);
                case 3:
                    System.out.println("현재 잔액: " + balance + "원");
                    break; // swith문만 나감 (while문으로 다시 돌아감)
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return; // main메서드 자체를 나가버림 (완전한 종료)
                default: // case들 다 아니면
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }
        }
    }
    public static int deposit(int balance, int amount) { // 입금
        balance += amount; // 잔액에 입금액 누적
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) { // 출금
        if (balance >= amount) { // 잔액이 남아있어야 출금 가능
            balance -= amount; // (잔액이 남아있으면) 출금이니까 잔액에서 출금액만큼 빼야 함
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else { // 잔액이 없을 때 (balance <= amount)
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}

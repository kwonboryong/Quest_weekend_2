package Quest;

public class Quset3_09 {
    public static void main(String[] args) {
        int balance = 10000; // 통장

        balance = deposit(balance, 1000); // 입금 1000원
        balance = withdraw(balance, 2000); // 출금 2000원
        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int balance, int amount) {
        balance += amount; // 통장에 누적 입금
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) { // 잔액이 남아있어야 출금 가능
            balance -= amount; // 출금이니까 빼야 함
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else { // 잔액이 없을 때
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}

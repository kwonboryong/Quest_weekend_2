package Quest;

import java.util.Scanner;

public class Quest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double average = 0;

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int gatsu = scanner.nextInt();
        int[] numbers = new int[gatsu]; // ***배열 생성, 선언 -> 입력값(number)만큼!!!

        System.out.println(gatsu + "개의 정수를 입력하세요: ");
        for (int i = 0; i < gatsu; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / gatsu;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);

    }
}

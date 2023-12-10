package Quest;

import java.util.Scanner;

public class Quest4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[5];

        int sum = 0;
        double average = 0;

        System.out.println("5개의 정수를 입력하세요: ");

        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
            sum += number[i]; // ***합계에 '배열의 값'을 누적
        }
        average = (double) sum / 5;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}

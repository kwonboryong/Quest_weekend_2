package Quest;

// 배열 문제풀이 1
// 정수 5개를 입력 받고 역순으로 출력하기

import java.util.Scanner;
public class Quest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력: ");

        // 배열의 index는 0, 1, 2, 3, 4 -> 역순이면 4부터 시작
        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) { // 역순이라 마지막 배열 자리는 0이기 때문에 (마지막 배열 값을 제외하고 쉼표(,) 적용)
                System.out.print(", ");
            }

        }
    }
}

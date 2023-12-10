package Quest;

// 배열 문제풀이 1
// 정수 5개를 입력 받고 출력하기

import java.util.Scanner;

public class Quest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 값 입력 받을 준비
        int[] numbers = new int[5]; // 배열 생성, 선언

        System.out.println("5개의 정수를 입력하세요: ");

        for (int i = 0; i < numbers.length; i++) { // 배열 numbers의 길이 만큼 입력 받음
            numbers[i] = scanner.nextInt(); // 값을 입력 받아서 배열(numbers)에 저장한다.
        }

        System.out.println("출력");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]); // 배열 numbers를 출력
            if (i < numbers.length - 1) { // 마지막 숫자가 아니면 쉼표(,) 적용 -> 마지막 숫자엔 쉼표(,) 미적용
                System.out.print(", ");
            }
        }

    }
}

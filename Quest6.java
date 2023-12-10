package Quest;

import java.util.Scanner;

public class Quest6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int gatsu = scanner.nextInt();

        int[] numbers = new int[gatsu];
        int minNumber, maxNumber; // ***최댓값과 최소값 정의
        System.out.println(gatsu + "개의 정수를 입력하세요: ");

        for (int i = 0; i < gatsu; i++) {
          numbers[i] = scanner.nextInt(); // 입력값이 배열에 바로 저장됨
        }

        minNumber = numbers[0]; // 배열의 첫번째 값(index = 0)을 저장
        maxNumber = numbers[0];
        for (int i = 1; i < gatsu; i++) {
            if (minNumber > numbers[i]) { // 배열의 첫 번째(0) 값과 두 번째 값 ~을 비교 = 더 작은 값이 있으면 갱신
                // numbers[i] = 두번째 값부터 시작(index는 0부터 시작, i는 1이니까), minNumber(첫번째 값)과 비교
                minNumber = numbers[i];
            }
            if (maxNumber < numbers[i]) { // maxnumber보다 큰 값이 있으면(true)
                maxNumber = numbers[i]; // maxNumber에 저장
            }
        }

        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);
    }
}

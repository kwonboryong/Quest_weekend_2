package Quest;

// 배열 - 문제풀이 3

import java.util.Scanner;
public class Quest9 {
    public static void main(String[] args) {
        int maxProducts = 10; // 상품 등록 횟수는 10개까지만
        String[] productNames = new String[maxProducts]; // 상품 이름도 10개
        int[] productPrices = new int[maxProducts]; // 상품 가격도 10개
        int productCount = 0; // 상품 등록 횟수 (10개까지만 받기 위해)

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {

                if (productCount >= maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue; // 다시 위로 돌아가야 함
                }

                System.out.print("상품 이름을 입력하세요: ");
                productNames[productCount] = scanner.nextLine(); // 입력값을 첫 번째 배열(index 0)부터 넣어줌

                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount] = scanner.nextInt();

                productCount++; // 상품이 등록되었으니 count(상품 등록 횟수) 증가

            } else if (menu == 2) {
                if (productCount == 0) {  // 등록된 상품이 없는 경우
                    System.out.println("등록된 상품이 없습니다.");
                    continue; // 다시 위로 올라가야 함
                }
                for (int i = 0; i < productCount; i++) { // 상품이 있으면 출력하기
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }

            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }
    }
}

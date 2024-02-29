package Quiz;

import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("정수를 입력하세요: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + "는(은) 소수입니다.");
        } else {
            System.out.println(number + "는(은) 소수가 아닙니다.");
        }
    }

    // 소수 판별 메서드
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

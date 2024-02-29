package Quiz;

import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("자릿수를 입력하세요: ");
        int numDigits = scanner.nextInt();
        
        int start = (int) Math.pow(10.0, (double) (numDigits - 1)); // 시작 범위
        int end = (int) (Math.pow(10.0, (double) numDigits)) - 1;   // 종료 범위
        
        System.out.println(numDigits + "자리 소수:");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
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

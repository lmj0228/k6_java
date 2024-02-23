package Quiz;

import java.util.Scanner;

public class GugudanTest {
	
	public static void main(String[] args) {
		
		Gugudan ggd = new Gugudan();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요.");
		int num;
		
		while((num = scanner.nextInt()) <10) {
			ggd.print(num);
			System.out.print("숫자를 입력하세요.");
		}
	
		System.out.println("-".repeat(15));
		
		System.out.println("End");
	}
}

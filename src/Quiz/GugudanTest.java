package Quiz;

import java.util.Scanner;

public class GugudanTest {
	
	public static void main(String[] args) {
		
		Gugudan ggd = new Gugudan();
		
		ggd.printHorizontal();
		
		ggd.printColumn(4);
		Scanner scanner = new Scanner(System.in);
		
		ggd.print(3);
		
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

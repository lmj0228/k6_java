package Quiz;

public class Gugudan {

	public void print(int i) {
		System.out.println(i + "단");
		
		for(int j = 1; j < 10; j++) {
			System.out.println(i + "*" + j + "=" + i*j);
		}	
	}
	
	
	public void printHorizontal() {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + j * i + "\t");
			}
			System.out.println();
		}
	}
	

	public static void  printColumn(int num) {
		for (int i = 2; i <= 9; i += num) {
			for (int j = 1; j <= 9; j++) {
				int x = i;
				int y = j;
				for(int k = 1; k <= num; k++) {
					System.out.print(x + " * " + y + " = " + x * y + "\t");
					x++;
					if(x >= 10) break;
				}
				System.out.println();
				
			}
			System.out.println("=".repeat(20));
			
		}
		
	}
	
	
}

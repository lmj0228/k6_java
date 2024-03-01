package Quiz;

public class GugudanTest {
    
    public static void main(String[] args) {
        
        Gugudan ggd = new Gugudan();
        
        ggd.print(4);
        System.out.println("=".repeat(50));
        
        ggd.printHorizontal();
        System.out.println("=".repeat(50));
        
        ggd.printColumn(3);
    }
}


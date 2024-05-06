import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);


    public static int lerInt() {

        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;

    }
    
    public static float lerFloat() {

        float valor = scanner.nextFloat();
        scanner.nextLine();
        return valor;


    }
    
    public static String lerString() {

        return scanner.nextLine();

    }

}

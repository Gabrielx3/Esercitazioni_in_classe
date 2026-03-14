import java.util.Scanner;
public class ese3 {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        System.out.println("scrivi tuo nome");
        String nome = scanner.nextLine();
        System.out.println("scrivi eta");
        int eta = scanner.nextInt();

        System.out.println(nome);
        System.out.println(eta);


    }
}

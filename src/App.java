import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double f, c;

        System.out.println("Digite a temperatura");
        f = sc.nextDouble();
         c = ((f-32)/9)*5;

         System.out.println("Sua temperatura em Celcius e " + c);
    }
}

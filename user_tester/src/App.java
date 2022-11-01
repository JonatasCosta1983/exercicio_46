import java.util.Locale;
import java.util.Scanner;
import product.Product;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("us", "US"));
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto:");
        String name = sc.next();

        System.out.print("Digite preço do produto:");
        double price = sc.nextDouble();

        System.out.print("Digite a contidade do produto:");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println(product.toString());

        sc.close();
    }
}

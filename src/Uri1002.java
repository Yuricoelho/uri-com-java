import java.util.Scanner;

public class Uri1002 {
    public static void main(String[] args) {
        double n = 3.14159;
        double area;
        Scanner leitor = new Scanner(System.in);
        double raio = leitor.nextDouble();

        area = n * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n", area);
    }
}

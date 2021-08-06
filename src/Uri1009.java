import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();
        double salFixo = leitor.nextDouble();
        double totalVendasMes = leitor.nextDouble();

        double salFinal = totalVendasMes * 0.15 + salFixo;

        System.out.printf("TOTAL = R$ %.2f%n", salFinal);
    }
}

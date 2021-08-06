import java.util.Scanner;

public class Uri1008 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numFunc = leitor.nextInt();
        int numHorasTrabalhadas = leitor.nextInt();
        double valorPorHora = leitor.nextDouble();
        double salario = numHorasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = " + numFunc);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}

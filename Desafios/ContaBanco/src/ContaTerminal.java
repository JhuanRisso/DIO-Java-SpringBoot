
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "MARIO ANDRADE";
        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o numero da Agencia!");
        int numeroAgencia = scanner.nextInt();
        
        if (numeroAgencia == numero) {
            System.out.println("Ola "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agencia e "+agencia+", conta "+numero+" e seu saldo "+saldo+" ja esta disponivel para saque.");
        } else {
            System.out.println("Este numero nao pertence a nenhuma conta");
        }
    }
}

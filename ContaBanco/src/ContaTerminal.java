import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Por favor, digite sua agência: ");
        String agencia = scanner.next();

        System.out.print("Por favor, digite o número da Agência: ");
        int numero = scanner.nextInt();

        System.out.print("Por favor, digite seu saldo bancario: ");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}

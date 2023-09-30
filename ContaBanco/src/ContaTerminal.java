import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número da conta ao usuário
        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do teclado
        
        // Solicita o número da agência ao usuário
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        // Solicita o nome do cliente ao usuário
        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = scanner.nextLine();

        // Solicita o saldo da conta ao usuário
        System.out.println("Por favor, digite o saldo da conta !");
        double saldo = scanner.nextDouble();

        // Exibe a mensagem com os dados da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo é de R$ " + saldo + " já está disponível para saque.");

        // Fecha o scanner
        scanner.close();
    }
}
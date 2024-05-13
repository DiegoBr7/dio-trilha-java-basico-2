import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO conhecer e importar a classe scanner

        Scanner sc = new Scanner(System.in);

        // Exibir as mensagens para o usuario

        System.out.println("Por favor, digite o nome do Cliente !");
        String nome = sc.nextLine();
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da Conta !");
        int numero = sc.nextInt();
        System.out.println("Por favor, digite o saldo do Cliente !");
        double saldo = sc.nextDouble();

        // Obter pela scanner os valores digitados no terminal
        System.out.println(nome);
        System.out.println(numero);
        System.out.println(agencia);
        System.out.println(saldo);
        // exibir a mensagem da conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", o número da conta é " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

    }
}


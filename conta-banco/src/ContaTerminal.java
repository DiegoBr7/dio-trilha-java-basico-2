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
        System.out.println("Por favor, digite o saldo do Cliente !\n");
        double saldo = sc.nextDouble();

        // Obter pela scanner os valores digitados no terminal
        System.out.println(nome);
        System.out.println(numero);
        System.out.println(agencia);
        System.out.println(saldo);
        // exibir a mensagem da conta criada
        System.out.println(" \n Sua conta foi criada com sucesso !");
    }
}


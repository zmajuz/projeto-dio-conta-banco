import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //TODO:"Conhecer e importar a classe Scanner 

        //Exibir as mensagens para o usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem final

        // Solicitar dados da conta
        System.out.print("Por favor, digite o número da Agência: ");
        int agencia = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o Saldo da Conta: ");
        double saldo = scanner.nextDouble();

        // Exibir mensagem de boas-vindas
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                         ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();
    }
}


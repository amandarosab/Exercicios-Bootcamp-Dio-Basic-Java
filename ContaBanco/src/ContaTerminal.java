import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        // título do programa
        System.out.println("Seja bem-vindo(a) ao Banco dos Tucos! \n");

        // criação do scanner agencia
        System.out.println("Por favor, digite o número da Agência:");
        Scanner agencia_ = new Scanner(System.in);
        String ag_user = agencia_.nextLine();

        // criação do scanner conta
        System.out.println("\nPor favor, digite o número da Conta:");
        Scanner conta_ = new Scanner(System.in);
        int ct_user = conta_.nextInt();

        // criação do scanner nome completo
        System.out.println("\nPor favor, digite o seu Nome Completo:");
        Scanner nome_ = new Scanner(System.in);
        String nm_user = nome_.nextLine();

        // criação do scanner saldo
        System.out.println("\nPor favor, digite o seu Saldo:");
        Scanner saldo_ = new Scanner(System.in);
        double sd_user = saldo_.nextDouble();

        // amostragem na tela com base nas informações recolhidas
        System.out.printf("Cliente %s, obrigado por utilizar o Banco Tucos! A sua agência é %s, o número da sua conta é %d. No momento o seu saldo é de: R$ %.2f", nm_user, ag_user, ct_user, sd_user);

        agencia_.close();
        conta_.close();
        nome_.close();
        saldo_.close();
    }
}

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        System.out.println("Digite o número da agência: ");
        int agencia = scanner.nextInt();
        System.out.println("Digite o nome do cliente: "); 
        String nome = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá" + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +numero+ " e seu saldo " +saldo+ "já está disponível para saque");
        scanner.close();
    }
}

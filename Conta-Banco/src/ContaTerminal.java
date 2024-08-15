import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência");
        int numero = teclado.nextInt();

        System.out.println("Por favor, digite o nome da Agência");
        String agencia = teclado.next();

        System.out.println("Por favor, digite o seu nome");
        String nomeCliente = teclado.next();

        System.out.println("Por favor, digite o saldo");
        double saldo = teclado.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+"," +
                " conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

    }
}
    import java.util.Locale;
    import java.util.Scanner;

    public class ContaTerminal {
    

    public static void main (String[] args) {


        System.out.println("Seja Bem Vindo ao Seu Banco!, para consultar seu saldo informe os seguintes dados:");

        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println ("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println ("Digite o número da agência");
        String agencia = scanner.next();

        System.out.println();
        double saldo = 1500.99;
        

        System.out.println("Olá, " + nome + "  " + sobrenome + ", seja bem vindo novamente!");
        System.out.println("Seu número de conta é " + numero + ", a agência é " + agencia + " e seu saldo é " + saldo);



    }

     

    
}

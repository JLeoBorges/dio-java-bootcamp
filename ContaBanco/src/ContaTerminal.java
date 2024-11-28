import java.util.*;

public class ContaTerminal {
    
    public static void main(String[]args){

    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);

    System.out.print("Informe o número da conta: ");
    int numero = sc.nextInt();
    System.out.print("Informe a Agencia: ");
    String agencia = sc.next();
    sc.nextLine();
    System.out.print("Infome o nome do proprietário: ");
    String nomeCliente = sc.nextLine();
    System.out.print("Saldo: ");
    double saldo = sc.nextDouble();


    System.out.println("Olá "+ nomeCliente + ",obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ",conta " + numero + " e seu saldo " + 
    saldo + " já está disponível para saque");
    

}    
}

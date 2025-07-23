import java.util.Scanner; 

public class Trabalho {

    public static void main(String[] args) {
        // Testando repositório...
        System.out.println("Teste do repositório GitHub: Sicoco Bala discipules");

        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Mensagem de boas-vindas, hhehehe
        System.out.println("Hohohohoho, bem-vindo, sir.");

        // Solicita o nome do usuário...
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Solicita a idade do usuário...
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");

        
        scanner.close();
    }
}

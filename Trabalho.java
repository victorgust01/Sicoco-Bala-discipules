import java.util.Scanner;

public class Trabalho {

    public static void main(String[] args) {
        // Testando repositório...
        System.out.println("Teste do repositório GitHub: Sicoco Bala discipules");

        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Mensagem de boas-vindas
        System.out.println("Hohohohoho, bem-vindo, sir.");

        // Solicita o nome do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Solicita a idade do usuário
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Mostra saudação final
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");

        // Informativo adicional
        System.out.println("Filmes clássicos: Tubarão, Indiana Jones e os Caçadores da Arca Perdida, De Volta para o Futuro, Jurassic Park, O Exorcista.");

        // Final divertido com elementos da outra branch
        System.out.println("tun tun tun sahur");
        System.out.println("tralalelo tralala");
        System.out.println("tripitropa tropatripa");

        scanner.close();
    }
}

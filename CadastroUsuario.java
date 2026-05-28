import java.util.Scanner;

public class CadastroUsuario {

    // ── Método que valida e cadastra o usuário ─────────────
    static void cadastrarUsuario(String nome, int idade) throws IdadeInvalidaException {
        if (idade < 18) {
            throw new IdadeInvalidaException(
                "Usuário " + nome + " tem " + idade + " anos. " +
                "É necessário ser maior de idade para se cadastrar!"
            );
        }
        System.out.println("✔  Usuário " + nome + " foi cadastrado com sucesso.");
    }

    // ── Método principal ───────────────────────────────────
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("       👤  Cadastro de Usuários        ");
        System.out.println("╚══════════════════════════════════════╝");

        System.out.print("\nDigite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // ── try/catch/finally ──────────────────────────────
        try {
            cadastrarUsuario(nome, idade);

        } catch (IdadeInvalidaException e) {
            System.out.println("\n⚠  Cadastro recusado: " + e.getMessage());

        } finally {
            System.out.println("\nProcesso de cadastro finalizado.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        String senha = leitura.next();
        try {
           validarsenha(senha);
            System.out.println("Senha válida. Acesso permitido");
        }catch (SenhaInvalidaException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }
    public static void validarsenha(String senha){
if(senha.length()< 8){
    throw new SenhaInvalidaException("A senha tem que ter pelo menos 8 caracteres");
}
    }

}
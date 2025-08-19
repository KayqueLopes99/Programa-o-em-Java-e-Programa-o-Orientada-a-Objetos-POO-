package Udemy.Aula_16_Classes_Métodos_Genericos_Object.ObjectClient;

public class Program {
    public static void main(String[] args) {
        Client client1 = new Client("Kayque", "Kaiquelopes.545@gmail.com");

        Client client2 = new Client("Daniel", "DanielCosta.545@gmail.com");

        boolean result = client1.equals(client2);
        System.out.println(result ? (client1 + " | " + client2 +" São Iguais") : (client1 + " | " + client2 + " Não são iguais"));
    }
}

// == Compara referências de objetos (endereços na memória).
// .equals() Compara o conteúdo do objeto.
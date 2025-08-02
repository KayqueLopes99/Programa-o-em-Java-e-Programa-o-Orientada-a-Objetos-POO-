package lista6_7;
import java.util.Map;
import java.util.TreeMap;

public class Questao94ContadorDeLetras {
    public static void main(String[] args){
        String texto = "HELLO THERE";
        String textoProcessado = texto.toUpperCase();
        Map<Character, Integer> contagemDeLetras = new TreeMap<>();

        for (char letra : textoProcessado.toCharArray()) {
            if (Character.isLetter(letra)) { 
                contagemDeLetras.put(letra, contagemDeLetras.getOrDefault(letra, 0) + 1);
            }
        }

        System.out.println("Contagem de letras em Ordem alfabetica:");
        for (char letrasContadas: contagemDeLetras.keySet()) {
            System.out.println(letrasContadas + ": " + contagemDeLetras.get(letrasContadas));
        }
    }
}

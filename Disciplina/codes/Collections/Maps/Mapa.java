package Disciplina.codes.Collections.Maps;

import java.util.TreeMap;

public class Mapa {
    public static void main(String[] args) {
        TreeMap<String, Integer> mapa = new TreeMap<>();
        String texto = "Jose Kayque Lima Lopes is a boy beutiful";
        int qtd;
        String palavraMin;
        String[] palavras = texto.split(" ");
        // split = divide a string em partes, usando o espaço como delimitador;

        // for (para cada) percorre o array de palavras;
        for (String palavra : palavras) {
            // toLowerCase = converte a string para minúsculas;
            palavraMin = palavra.toLowerCase();
            if (mapa.containsKey(palavraMin)) {
                // get = obtém o valor associado à chave;
                qtd = mapa.get(palavraMin);
                // put = adiciona ou atualiza o valor associado à chave;
                mapa.put(palavraMin, qtd+1);
            } else {
               // A palavra "jose" é adicionada ao mapa com contagem 1. O mapa agora é: {jose=1}
                mapa.put(palavraMin, 1);
            }
        }
        // keySet = retorna um conjunto de chaves do mapa;
        for (String palavra : mapa.keySet()) {
            System.out.println(palavra + " " + mapa.get(palavra));
        }
    }
}


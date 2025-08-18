package Udemy.Aula_27_Arquivos.Codes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


// CÓDIGO 1
public class ReadFile {
    public static void main(String[] args) {

        // COLOCA O CAMINHO
        File file = new File("C:\\Users\\kaiqu\\OneDrive\\Imagens\\Programa-o-em-Java-e-Programa-o-Orientada-a-Objetos-POO-\\Udemy\\Aula_27_Arquivos\\Codes\\file.txt");
        
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);

            // VERIFICA SE TEM LINHA PREENCHIDAS NO ARQUIVO PARA IMPRESSÃO
            while (scanner.hasNextLine()) {

                System.out.println(scanner.nextLine());

            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (scanner != null){
            scanner.close();
            }
        }
    }
}

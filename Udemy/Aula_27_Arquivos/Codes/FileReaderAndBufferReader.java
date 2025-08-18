package Udemy.Aula_27_Arquivos.Codes;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class FileReaderAndBufferReader {
    public static void main(String[] args) {
        String path = "C:\\Users\\kaiqu\\OneDrive\\Imagens\\Programa-o-em-Java-e-Programa-o-Orientada-a-Objetos-POO-\\Udemy\\Aula_27_Arquivos\\Codes\\file.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();

            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        
        }
    }
}

package Udemy.Aula_27_Arquivos.Codes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndBufferWriter {
    public static void main(String[] args) {
        String lines[] = new String[] {"Good morning", "Good afernoon", "Good night"};
        String path = "C:\\Users\\kaiqu\\OneDrive\\Imagens\\Programa-o-em-Java-e-Programa-o-Orientada-a-Objetos-POO-\\Udemy\\Aula_27_Arquivos\\Codes\\out.txt";

        // Acrescenta os dados e não destruiu.
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

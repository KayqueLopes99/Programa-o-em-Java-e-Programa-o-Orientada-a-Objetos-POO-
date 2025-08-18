package Udemy.Aula_27_Arquivos.Codes;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastasArquivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a folder path:");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        // Somente diretorios e pastas
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("Folders: ");
        for (File folder : folders) {
            System.out.println(folder);

        }

        // somente aquivos
        File[] files = path.listFiles(File::isFile);

        System.out.println("Files: ");
        for (File file : files) {
            System.out.println(file);

        }

        File subdir = new File(strPath, "subdir"); // junta corretamente os caminhos
        boolean success = subdir.mkdir(); // cria a pasta

        if (success) {
            System.out.println("Subpasta criada com sucesso: " + subdir.getAbsolutePath());
        } else {
            System.out.println("Falha ao criar a subpasta.");
        }

        scanner.close();
    }
}

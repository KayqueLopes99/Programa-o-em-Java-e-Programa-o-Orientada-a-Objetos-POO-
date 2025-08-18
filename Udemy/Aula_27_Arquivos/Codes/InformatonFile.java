package Udemy.Aula_27_Arquivos.Codes;

import java.io.File;
import java.util.Scanner;

public class InformatonFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a folder path:");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        // nome do arquivo
        System.out.println("getName: " + path.getName());
        // dados do caminho sem o nome do arquivo
        System.out.println("getParent: " + path.getParent());
        // tudo
        System.out.println("getPath: " + path.getPath());


        scanner.close();
    }
}

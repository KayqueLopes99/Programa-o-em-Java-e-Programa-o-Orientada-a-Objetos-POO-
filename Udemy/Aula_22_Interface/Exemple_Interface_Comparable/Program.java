package Udemy.Aula_22_Interface.Exemple_Interface_Comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Employe> listEmployes = new ArrayList<>();
        String path = "C:\\Users\\kaiqu\\OneDrive\\Imagens\\Programa-o-em-Java-e-Programa-o-Orientada-a-Objetos-POO-\\Udemy\\Aula_22_Interface\\Exemple_Interface_Comparable\\file.csv";
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeCsv = br.readLine();
            while (employeCsv != null) {
                String vectorDatas[] = employeCsv.split(",");

                listEmployes.add(new Employe(vectorDatas[0], Double.parseDouble(vectorDatas[1])));
                employeCsv = br.readLine();
            }
            Collections.sort(listEmployes);
            for (Employe emp : listEmployes) {
                System.out.println(emp);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
package Udemy.Code.Interfacess.Contracts.aplication;

import java.util.Scanner;


import Udemy.Code.Interfacess.Contracts.src.models.entities.Contract;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Contract.registerContract(scanner);
        scanner.close();
    }
}

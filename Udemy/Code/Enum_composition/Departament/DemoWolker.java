package Udemy.Code.Enum_composition.Departament;

import java.util.Scanner;

public class DemoWolker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Worker worker = Worker.registerWorker(scanner);
        Worker.removeContractsFromWorker(worker, scanner);
        worker.listContracts();
        worker.improve(worker, scanner);

        scanner.close();
    }
}

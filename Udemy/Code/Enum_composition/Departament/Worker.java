package Udemy.Code.Enum_composition.Departament;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;
    private Departament departament;
    private List<HourContract> listHourContracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public static Worker registerWorker(Scanner scanner) {
        WorkerLevel level = null;
        System.out.print("Enter department's name: ");
        String departamentName = scanner.nextLine();

        Departament departament = new Departament(departamentName);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Base salary: ");
        double baseSalary = scanner.nextDouble();
        scanner.nextLine();

        while (level == null) {
            System.out.print("Level of the worker (JUNIOR, MID_LEVEL, SENIOR): ");
            String input = scanner.nextLine().toUpperCase();
            try {
                level = WorkerLevel.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Level invalid! try again.");
            }
        }

        Worker worker = new Worker(name, level, baseSalary, departament);

        System.out.print("How many contracts to this worker? ");
        int quantityContractForAdd = scanner.nextInt();
        scanner.nextLine();
        int indexContract = 1;

        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (quantityContractForAdd != 0) {
            System.out.println("Enter #" + indexContract + " contract data:");

            LocalDate datecontract = null;

            while (datecontract == null) {
                System.out.print("Date (DD/MM/YYYY): ");
                String datecontractStr = scanner.nextLine();
                try {
                    datecontract = LocalDate.parse(datecontractStr, formater);
                } catch (DateTimeParseException e) {
                    System.out.println("Data inválida! Use o formato DD/MM/YYYY.");
                }
            }

            System.out.println("Value per hour: ");
            double valueperHour = scanner.nextDouble();

            System.out.println("Duration (hours): ");
            int duration = scanner.nextInt();
            scanner.nextLine();

            HourContract hourContract = new HourContract(datecontract, valueperHour, duration);

            worker.addContract(hourContract);
            quantityContractForAdd--;
            indexContract++;

        }

        worker.listContracts();

        return worker;
    }

    public void addContract(HourContract contract) {
        boolean sucess = listHourContracts.add(contract);
        if (sucess) {
            System.out.println("Contrato adicionado na lista com sucesso.");
        } else {
            System.out.println("ERRO: não foi possível adicionar o contrato na lista.");
        }
    }

    public void removeContractByIndex(int index) {
        listContracts();
        if (index >= 0 && index < listHourContracts.size()) {
            listHourContracts.remove(index);
            System.out.println("Contrato removido.");
        } else {
            System.out.println("Índice inválido. Nenhum contrato removido.");
        }
    }

    public static void removeContractsFromWorker(Worker worker, Scanner scanner) {
        System.out.println("Remove some contracts (YES/NO)?");
        String response1 = scanner.nextLine().toUpperCase();

        if (response1.equals("YES")) {
            while (true) {
                worker.listContracts();

                System.out.print("Contract index to remove: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Digite um número válido.");
                    scanner.next();
                    System.out.print("Contract index to remove: ");
                }

                int index = scanner.nextInt();
                scanner.nextLine();

                worker.removeContractByIndex(index);

                System.out.print("Exit? (YES/NO): ");
                String response2 = scanner.nextLine().toUpperCase();

                if (response2.equals("YES")) {
                    break;
                }
            }
        }
    }

    public void listContracts() {
        int index = 0;
        if (!listHourContracts.isEmpty()) {
            System.out.println("----  CONTRACTS OF WORKER LIST ----");
            for (HourContract contract : listHourContracts) {
                System.out.println("Indice[" + index + "]: " + contract);
                index++;
            }
        } else {
            System.out.println("Nenhum contrato cadastrado na lista.");
        }
    }

    public void improve(Worker worker, Scanner scanner) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
        YearMonth monthYear = null;

        while (monthYear == null) {
            System.out.print("Enter month and year to calculate income (MM/YYYY): ");
            String input = scanner.nextLine();
            try {
                monthYear = YearMonth.parse(input, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido! Use MM/YYYY.");
            }
        }
        String departamentNameInput = "";
        String workerNameInput = "";

        while (true) {
            System.out.print("Enter department's name: ");
            departamentNameInput = scanner.nextLine();

            System.out.print("Enter worker's name: ");
            workerNameInput = scanner.nextLine();

            if (departament.getName().equals(departamentNameInput)
                    && worker.getName().equals(workerNameInput)) {
                break; 
            } else {
                System.out.println("Departamento ou trabalhador não correspondem. Tente novamente.");
            }
        }

        double sum = 0.0;
        YearMonth monthYearContract = null;
        for (HourContract contract : listHourContracts) {
            LocalDate dateContract = contract.getDate();
             monthYearContract = YearMonth.from(dateContract);
            

            if (monthYearContract.equals(monthYear)) {
                sum += contract.totalValue();
            }

        }

        double result = this.baseSalary + sum;

        System.out.println("Income for " + monthYearContract + ": " + result);
    }

}

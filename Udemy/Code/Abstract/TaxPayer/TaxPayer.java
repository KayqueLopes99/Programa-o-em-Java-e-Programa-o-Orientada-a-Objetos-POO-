package Udemy.Code.Abstract.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class TaxPayer {
    private String name;
    private double AnualIncome;

    private static List<TaxPayer> listTaxPayers = new ArrayList<>();

    public TaxPayer(String name, double AnualIncome) {
        this.name = name;
        this.AnualIncome = AnualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnualIncome() {
        return AnualIncome;
    }

    public void setAnualIncome(double AnualIncome) {
        this.AnualIncome = AnualIncome;
    }

    @Override
    public String toString() {
        return "TaxPayer [name=" + name + ", AnualIncome=" + AnualIncome + "]";
    }

    public abstract double tax();

    public static void registerTaxPayers(Scanner scanner) {

        System.out.print("Enter the number of tax payers: ");
        int quantityPlayersForAdd = scanner.nextInt();
        scanner.nextLine();
        int indexPlayers = 1;

        while (quantityPlayersForAdd != 0) {
            System.out.println("Tax payer #" + indexPlayers + "  data:");

            System.out.print("Name: ");
            String nameEmployees = scanner.next();

            System.out.print("Anual income: ");
            double AnualIncome = scanner.nextInt();

            scanner.nextLine();
            String response1 = "";

            while (!(response1.equals("INDIVIDUAL") || response1.equals("COMPANY"))) {
                System.out.print("Individual or company (INDIVIDUAL/COMPANY)? ");
                response1 = scanner.nextLine().toUpperCase();
            }

            if (response1.equals("INDIVIDUAL")) {
                System.out.print("Health expenditures: ");
                double healthExpenditures = scanner.nextDouble();

                TaxPayer.addTaxPayer(new Individual(nameEmployees, AnualIncome, healthExpenditures));

            } else if (response1.equals("COMPANY")) {
                System.out.print("Number of employees: ");
                int numberOfEmployees = scanner.nextInt();
                TaxPayer.addTaxPayer(new Company(nameEmployees, AnualIncome, numberOfEmployees));

            }
            quantityPlayersForAdd--;
            indexPlayers++;

        }

        TaxPayer.listTaxAndName();

    }

    public static void addTaxPayer(TaxPayer player) {
        boolean sucess = listTaxPayers.add(player);
        if (sucess) {
            System.out.println("Passageiro adicionado na lista com sucesso.");
        } else {
            System.out.println("ERRO: não foi possível adicionar o Passageiro na lista.");
        }
    }

    public static void listTaxAndName() {
        double sum = 0.0;
        if (!listTaxPayers.isEmpty()) {
            for (TaxPayer payer : listTaxPayers) {
                System.out.printf("%s: $ %.2f\n", payer.getName(), payer.tax());
                sum += payer.tax();
            }
            System.out.printf("\nTOTAL TAXES: $ %.2f", sum);

        } else {
            System.out.println("List is empty!");
        }

    }

}

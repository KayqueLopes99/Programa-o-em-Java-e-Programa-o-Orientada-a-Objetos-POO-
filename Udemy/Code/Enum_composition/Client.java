package Udemy.Code.Enum_composition;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Client {
    private String name;
    private String email;
    private LocalDate bithDate;

    public Client(String name, String email, LocalDate bithDate) {
        this.name = name;
        this.email = email;
        this.bithDate = bithDate;
    }

    public static Client registerClient(Scanner scanner) {
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        LocalDate birthDate = null;

        while (birthDate == null) {
            System.out.print("Birth date (DD/MM/YYYY): ");
            String birthDateStr = scanner.nextLine();
            try {
                birthDate = LocalDate.parse(birthDateStr, formater);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida! Use o formato DD/MM/YYYY.");
            }
        }

        Client client = new Client(name, email, birthDate);

        System.out.println("Cliente cadastrado:");
        System.out.println("Nome: " + client.getName());
        System.out.println("Email: " + client.getEmail());
        System.out.println("Data de nascimento: " + client.getBithDate());

        return client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBithDate() {
        return bithDate;
    }

    public void setBithDate(LocalDate bithDate) {
        this.bithDate = bithDate;
    }

    @Override
    public String toString() {
        return "\nName: " + name + ", email: " + email + ", bithDate: " + bithDate + ".";
    }

}

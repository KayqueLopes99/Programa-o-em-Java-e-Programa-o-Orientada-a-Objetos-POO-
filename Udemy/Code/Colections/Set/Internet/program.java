package Udemy.Code.Colections.Set.Internet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<LogEntry> listLogEntries = new HashSet<>();
        LogEntry.writeFile(scanner, listLogEntries);
        scanner.close();
    }
}

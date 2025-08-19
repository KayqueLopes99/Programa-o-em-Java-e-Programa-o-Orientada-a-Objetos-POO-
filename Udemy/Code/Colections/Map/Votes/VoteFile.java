package Udemy.Code.Colections.Map.Votes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class VoteFile {

    public static void main(String[] args) throws ParseException{
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> votes = new LinkedHashMap<>();
        writeFile(scanner, votes);
        scanner.close();
    }
    public static void writeFile(Scanner scanner, Map<String, Integer> votes) throws ParseException{
        System.out.print("Enter file full path: ");
        String path = scanner.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if (votes.containsKey(name)) {
					int quantityVotes = votes.get(name);
					votes.put(name, count + quantityVotes);
				}
				else {
					votes.put(name, count);
				}
				
                line = bufferedReader.readLine();
            }
            for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
 
    }
    
}

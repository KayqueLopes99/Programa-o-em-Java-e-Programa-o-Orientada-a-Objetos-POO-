package Udemy.Code.Colections.Set.Internet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.time.Instant;
import java.util.Set;

public class LogEntry {
    private String userName;
    private Date moment;

    public LogEntry(String userName, Date moment) {
        this.userName = userName;
        this.moment = moment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public String toString() {
        return "LogEntry [userName=" + userName + ", moment=" + moment + "]";
    }

    public static void writeFile(Scanner scanner, Set<LogEntry> userslist){
        System.out.print("Enter file full path: ");
        String path = scanner.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                String[] fields = line.split(" ");
                String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));

                userslist.add(new LogEntry(username, moment));
                line = bufferedReader.readLine();
            }
            System.out.println("Total users: " + userslist.size());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
 
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((userName == null) ? 0 : userName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LogEntry other = (LogEntry) obj;
        if (userName == null) {
            if (other.userName != null)
                return false;
        } else if (!userName.equals(other.userName))
            return false;
        return true;
    }

    


    
}


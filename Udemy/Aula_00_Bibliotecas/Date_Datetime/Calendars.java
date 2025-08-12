package Udemy.Aula_00_Bibliotecas.Date_Datetime;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Calendar;

public class Calendars {
    public static void main(String[] args) {

        // Somando uma unidade de tempo
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));
        Calendar cal = Calendar.getInstance();
        cal.setTime(d); // passando a data

        cal.add(Calendar.HOUR_OF_DAY, 4); // horas do dia
        d = cal.getTime();
        System.out.println(sdf.format(d));

        // Obtendo uma unidade de tempo
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);
        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);
    }
}

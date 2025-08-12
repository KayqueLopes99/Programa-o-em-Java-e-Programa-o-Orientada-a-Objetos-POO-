package Udemy.Aula_00_Bibliotecas.Date_Datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;
import java.util.Date;

public class Code {
    public static void main(String[] args) {
        // Data, hora e data-hora atuais no fuso do sistema
        LocalDate date = LocalDate.now();
        LocalTime horary = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        // Data/hora atual em UTC
        Instant date2 = Instant.now();

        // Criando datas e horários fixos a partir de Strings (padrão ISO 8601)
        LocalDate date3 = LocalDate.parse("2025-07-07"); // Apenas data
        LocalDateTime date4 = LocalDateTime.parse("2025-07-07T23:40:45"); // Data e hora

        // Data/hora fixa no formato UTC (Z = zero offset)
        Instant date5 = Instant.parse("2025-07-07T20:40:45Z");

        // Data/hora fixa com fuso horário de -03:00 (3 horas a menos que UTC)
        Instant date6 = Instant.parse("2025-07-07T20:40:45-03:00");

        // Criando formatadores para padrões personalizados
        DateTimeFormatter formater1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formater2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Parsing usando formatadores personalizados
        LocalDate date7 = LocalDate.parse("22/12/2004", formater1);
        LocalDateTime date8 = LocalDateTime.parse("22/12/2004 01:20", formater2);

        // dia, mês, ano, [horário] ➞ Data-hora local
        LocalDate date9 = LocalDate.of(2025, 8, 22);
        // dia mes ano hora minuto
        LocalDateTime date10 = LocalDateTime.of(2025, 8, 22, 14, 23);

        // Data/hora atuais
        System.out.println("Data: " + date);
        System.out.println("Horário: " + horary);
        System.out.println("Data e Horário: " + dateTime);
        System.out.println("Date Londres (UTC): " + date2);

        // Datas/hora personalizadas
        System.out.println("Data personalizada: " + date3);
        System.out.println("Data e Horário personalizada: " + date4);
        System.out.println("Data e Horário personalizada Londres (UTC): " + date5);
        System.out.println("Data e Horário personalizada Outro país: " + date6);

        // Datas/hora com formato customizado
        System.out.println("Data personalizada com formato: " + date7);
        System.out.println("Data e Horário personalizada com formato: " + date8);

        // Passando o parâmetros
        System.out.println("Data personalizada atribuindo diretamente os valores: " + date9);

        System.out.println("Data personalizada atribuindo diretamente os valores: " + date10);

        // Outros:
        System.out.println("Data com format: " + date.format(formater1));
        System.out.println("Data com format: " + dateTime.format(formater2));

        // Formatador com data e hora, dia/mês/ano e horas/minutos/segundos pegando a
        // propria região, o duso horário.
        DateTimeFormatter formater3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")
                .withZone(ZoneId.systemDefault());

        // Formatando um Instant para o fuso horário local
        String dateFormatted = formater3.format(date2);
        System.out.println("Instant formatado (Local TimeZone): " + dateFormatted);

        // ISO_DATE_TIME com fuso horário local
        DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_DATE_TIME.withZone(ZoneId.systemDefault());

        /*
         * ISO_DATE_TIME é um formatador pronto (DateTimeFormatter.ISO_DATE_TIME)
         * fornecido pelo Java que segue o padrão ISO 8601 para representar data e hora
         * com fuso horário.
         * 
         * Esse padrão é amplamente usado em APIs, bancos de dados e sistemas que
         * precisam trocar informações de data-hora de forma padronizada.
         * 
         * 📌 Formato
         * Copiar
         * Editar
         * 2025-08-11T19:55:30-03:00
         * Que significa:
         * 
         * 2025-08-11 → Ano, mês e dia
         * 
         * T → Separador entre data e hora
         * 
         * 19:55:30 → Hora, minutos e segundos
         * 
         * -03:00 → Fuso horário (neste caso, Brasília)
         */
        String isoFormatted = isoFormatter.format(date2);
        System.out.println("Instant em ISO_DATE_TIME (Local TimeZone): " + isoFormatted);

        // Convertendo data-hora global para local obs: segue a mesma lógica para
        // demais.
        // Data-hora global (UTC)
        Instant globalTime = Instant.now();
        System.out.println("Data-hora global (UTC): " + globalTime);

        // Converter para data-hora local no fuso horário do sistema
        LocalDateTime localTimeSystem = LocalDateTime.ofInstant(globalTime, ZoneId.systemDefault());
        System.out.println("Data-hora local (Sistema): " + localTimeSystem);

        // Converter para data-hora local de um fuso específico (ex.: Japão)
        LocalDateTime localTimeJapan = LocalDateTime.ofInstant(globalTime, ZoneId.of("Asia/Tokyo"));
        System.out.println("Data-hora local (Japão): " + localTimeJapan);

        // Captação do dados:
        LocalDateTime dataHora = LocalDateTime.now();

        int day = dataHora.getDayOfMonth();
        int month = dataHora.getMonthValue();
        int year = dataHora.getYear();
        int huor = dataHora.getHour();
        int minutes = dataHora.getMinute();

        System.out.println(day + "/" + month + "/" + year + " HORA:" + huor + " MINUTOS: " + minutes);

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis()); // data atual.
        Date x3 = new Date(0L); // Passando o milisegundos:resulta numa data com redução ou aumento de horas segunda a comparação com a do seu país.
        Date x4 = new Date(1000L * 60L * 60L * 5L); // 5 horas em milisegundos

        try {
            Date y1 = sdf1.parse("25/06/2018");
            Date y2 = sdf2.parse("25/06/2018 15:42:07");
            System.out.println("y1: " + y1);
            System.out.println("y2: " + y2);
            System.out.println("y1: " + sdf2.format(y1));
            System.out.println("y2: " + sdf2.format(y2));
            System.out.println("y1: " + sdf3.format(y1));
            System.out.println("y2: " + sdf3.format(y2));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);
        System.out.println("x4: " + x4);

        System.out.println("y3: " + y3);
        System.out.println("-------------");
        System.out.println("x1: " + sdf2.format(x1));
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("x3: " + sdf2.format(x3));
        System.out.println("x4: " + sdf2.format(x4));

        System.out.println("y3: " + sdf2.format(y3));
        System.out.println("-------------");
        System.out.println("x1: " + sdf3.format(x1));
        System.out.println("x2: " + sdf3.format(x2));
        System.out.println("x3: " + sdf3.format(x3));
        System.out.println("x4: " + sdf3.format(x4));

        System.out.println("y3: " + sdf3.format(y3));

    }
}

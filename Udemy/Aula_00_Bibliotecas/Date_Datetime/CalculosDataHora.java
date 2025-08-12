package Udemy.Aula_00_Bibliotecas.Date_Datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {
    public static void main(String[] args) {

        // Data-hora inicial
        LocalDateTime dataHora = LocalDateTime.of(2025, 8, 11, 20, 0);
        System.out.println("Data-hora inicial: " + dataHora);

        // ----- 1. Adicionar e subtrair tempo -----
        // minus = - e plus = +
        LocalDateTime mais5Dias = dataHora.plusDays(5); // +5 dias
        LocalDateTime menos3Horas = dataHora.minusHours(3); // -3 horas
        Instant date1 = Instant.parse("2025-07-23T01:30:26Z");

        System.out.println("Data-hora +5 dias: " + mais5Dias);
        System.out.println("Data-hora -3 horas: " + menos3Horas);

        Instant pastWeekInstant = date1.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = date1.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant:" + pastWeekInstant);
        System.out.println("nextWeekInstant:" + nextWeekInstant);

        // ----- 2. Calcular duração entre duas datas-horas -----
        LocalDateTime outraDataHora = LocalDateTime.of(2025, 8, 20, 10, 30);

        Duration duracao = Duration.between(dataHora, outraDataHora);

        System.out.println("Duração em dias: " + duracao.toDays());
        System.out.println("Duração em horas: " + duracao.toHours());
        System.out.println("Duração em minutos: " + duracao.toMinutes());


        // DATE -> LOCALDATETIME: atStartOfDay()
    }
}

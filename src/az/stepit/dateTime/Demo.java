package az.stepit.dateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Demo {

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm")
                .withZone(ZoneId.of("UTC"));
        Date date = new Date();  //not recommended
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        Instant instant = Instant.now();

        System.out.println(date);
        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(instant);

        System.out.println(dateTimeFormatter.format(instant));

    }
}

package ua.lviv.lgs.max;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class App {
    public static void main(String[] args) {
     Date date = new Date();
        System.out.println(returnLocalDate(date));
        System.out.println(returnLocalTime(date));
        System.out.println(returnLocalDateTime(date));
    }

    public static LocalDate returnLocalDate(Date date){
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
    public static LocalTime returnLocalTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
    }

    public static LocalDateTime returnLocalDateTime(Date date){
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }

}

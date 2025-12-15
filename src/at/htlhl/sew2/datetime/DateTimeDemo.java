package at.htlhl.sew2.datetime;

import java.time.LocalDate;

public class DateTimeDemo {
    static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);
        LocalDate dob = LocalDate.of(2009, 11, 13);
        System.out.println(dob.getDayOfWeek());
    }
}

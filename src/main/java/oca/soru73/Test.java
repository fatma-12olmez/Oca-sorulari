package oca.soru73;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2012,1,30);
        date.plusDays(10);
        System.out.println(date);
    }
}

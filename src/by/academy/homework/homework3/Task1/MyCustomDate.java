package by.academy.homework.homework3.Task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MyCustomDate {
    private Day day;
    private Month month;
    private Year year;
    private LocalDate localDate;

    public MyCustomDate() {
        super();
    }

    public MyCustomDate(String date) {
        super();
        setDate(date);
    }

    public MyCustomDate(int d, int m, int y) {
        super();
        day = new Day(d);
        month = new Month(m);
        year = new Year(y);
        localDate = LocalDate.of(y, m, d);
    }

    public int getYear() {
        return year.year;
    }

    public void setYear(int year) {
        this.year.year = year;
    }

    public int getMonth() {
        return month.month;
    }

    public void setMonth(int month) {
        this.month.month = month;
    }

    public int getDay() {
        return day.day;
    }

    public void setDay(int day) {
        this.day.day = day;
    }

    public void setDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        localDate = LocalDate.parse(date, formatter);

        day = new Day(localDate.getDayOfMonth());
        month = new Month(localDate.getMonthValue());
        year = new Year(localDate.getYear());
    }

    public LocalDate getDate() {
        return localDate;
    }

    public String dayOfWeek() {
        switch (localDate.getDayOfWeek()) {
            case SUNDAY:
                return Week.SUNDAY.getName();
            case MONDAY:
                return Week.MONDAY.getName();
            case TUESDAY:
                return Week.TUESDAY.getName();
            case WEDNESDAY:
                return Week.WEDNESDAY.getName();
            case THURSDAY:
                return Week.THURSDAY.getName();
            case FRIDAY:
                return Week.FRIDAY.getName();
            case SATURDAY:
                return Week.SATURDAY.getName();
            default:
                return "ERROR";
        }
    }

    enum Week {
        MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"), THURSDAY("Четверг"),
        FRIDAY("Пятница"), SATURDAY("Суббота"), SUNDAY("Воскресенье");

        private String value;

        Week(String value) {
            this.value = value;
        }

        public String getName() {
            return value;
        }
    }

    public String isLeapYear() {
        if ((year.year % 4 == 0 && year.year % 100 != 0) || (year.year % 400 == 0)) {
            return "Год високосный";
        } else {
            return "Год не високосный";
        }
    }

    public static long daysBetween(LocalDate date1, LocalDate date2) {
        return ChronoUnit.DAYS.between(date1, date2);
    }

    static class Day {
        int day;

        public Day() {
            super();
        }

        public Day(int day) {
            super();
            this.day = day;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }
    }

    static class Month {
        int month;

        public Month() {
            super();
        }

        public Month(int month) {
            this.month = month;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }
    }

    static class Year {
        int year;

        public Year() {
            super();
        }

        public Year(int year) {
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }

}
package Bai_2;

import java.util.Scanner;

public class Date {
    private short day;
    private short month;
    private short year;

    public Date() {
    }

    public Date(short day, short month, short year) {
        if (Check(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public short getDay() {
        return day;
    }

    public void setDay(short day) {
        this.day = day;
    }

    public short getMonth() {
        return month;
    }

    public void setMonth(short month) {
        this.month = month;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    private int getDayMax(int month, int year) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
                    return 28;
                else
                    return 29;
            default:
                return 31;
        }
    }

    public boolean Check(int day, int month, int year) {
        if (year < 0 || day < 0 || month < 0)
            return false;
        else if (month > 12 || day > getDayMax(month, year))
            return false;
        else
            return true;
    }

    public void Input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\tNgày: ");
        setDay(scan.nextShort());
        System.out.print("\tTháng: ");
        setMonth(scan.nextShort());
        System.out.print("\tNăm: ");
        setYear(scan.nextShort());
    }

    public void Output() {
        System.out.println("Ngày " + getDay() + " Tháng " + getMonth() + " Năm " + getYear());
    }
}

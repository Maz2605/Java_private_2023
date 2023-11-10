public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
            }
            if (hour == 24) {
                hour = 0;
            }
        }
    }

    public void previousSe() {
        second--;
        if (second == 0) {
            second = 60;
            minute--;
            if (minute == 0) {
                minute = 60;
                hour--;
            }
            if (hour == 0) {
                hour = 24;
            }
        }
    }
    public void Display(){
        System.out.println(hour+" : "+minute+" : "+second);
    }
}

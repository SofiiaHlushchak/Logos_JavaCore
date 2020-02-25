package ua.lviv.lgs.movie_project;

public class Time {
    private int min;
    private int hour;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public Time(int min, int hour) throws IllegalAccessException {
        if ((min > 0 && min < 60) && (hour > 0 && hour < 24)) {
            this.min = min;
            this.hour = hour;
        } else {
            throw new IllegalAccessException();
        }

    }

    public int compareTo(Time o) {
        return (hour * 60 + min) - (o.getHour() * 60 + o.getMin());
    }

    public static Time sumTime(Time time1, Time time2) throws IllegalArgumentException, IllegalAccessException {
        int hour = time1.getHour() + time2.getHour();
        int min = time1.getMin() + time2.getMin();

        return new Time(hour, min);
    }
}

public class TimeDifferents {

    int seconds;
    int minutes;
    int hours;

    public TimeDifferents(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public static void main(String[] args) {
        TimeDifferents start = new TimeDifferents(12, 34, 55),
                stop = new TimeDifferents(8, 12, 15),
                diff;

        diff = difference(start, stop);

        System.out.printf("Time Difference: %d:%d:%d - ", start.hours, start.minutes, start.seconds);
        System.out.printf("%d:%d:%d ", stop.hours, stop.minutes, stop.seconds);
        System.out.printf("= %d:%d:%d\n", diff.hours, diff.minutes, diff.seconds);
    }

    public static TimeDifferents difference(TimeDifferents start, TimeDifferents stop) {
        TimeDifferents diff = new TimeDifferents(0, 0, 0);

        if (stop.seconds > start.seconds) {
            --start.minutes;
            start.seconds += 60;
        }

        diff.seconds = start.seconds - stop.seconds;
        if (stop.minutes > start.minutes) {
            --start.hours;
            start.minutes += 60;
        }

        diff.minutes = start.minutes - stop.minutes;
        diff.hours = start.hours - stop.hours;

        return (diff);
    }
}
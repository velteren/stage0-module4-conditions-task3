package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month < 1 || month >= 13) {
            System.out.println("wrong number!");
        } else if (month == 12 || month <= 2) {
            System.out.println("Winter");
        } else if (month >= 9) {
            System.out.println("Autumn");
        } else if (month >= 6) {
            System.out.println("Summer");
        } else {
            System.out.println("Spring");
        }
    }
}

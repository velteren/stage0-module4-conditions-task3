package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        int[] array = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month < 1 || month > 12) {
            System.out.println("wrong number!");
        } else System.out.println(array[month - 1]);
    }
}

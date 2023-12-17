package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        int[] array = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println(array[month - 1]);
    }
}

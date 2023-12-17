package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double result = salary;
        if (salary < 0) {
            System.out.println("wrong input!");
        } else if (salary <= 10000) {
            result *= 0.85;
        } else if (salary <= 20000) {
            result *= 0.82;
        } else {
            result *= 0.8;
        }
        System.out.println(result);
    }
}

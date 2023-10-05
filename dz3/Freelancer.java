public class Freelancer extends Employee {

    public Freelancer(String name, String surName, int age, double salary) {
        super(name, surName, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary * 20;
    }

    @Override
    public int ageSort() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s - %d; Фриланс; Среднемесячная заработная плата %.2f",
                surName, name, age, salary);
    }
}

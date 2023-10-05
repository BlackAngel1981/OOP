import java.util.Arrays;
import java.util.Random;

public class Program {

    private static Random random = new Random();

    public static Employee generateEmployee() {
        String[] names = new String[]{"Сергей", "Пётр", "Евгений", "Артем", "Рауль", "Дмитрий", "Егор", "Виктор", "Василий", "Тимофей"};
        String[] surNames = new String[]{"Терещенко", "Мартиросян", "Петров", "Иванов", "Сидоров", "Попов", "Ситников", "Переляев", "Бородин", "Слабаков"};

        int ageNumber = random.nextInt(25, 55);
        int salaryIndex = random.nextInt(200, 500);

        if (random.nextBoolean()) {
            return new Worker(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], ageNumber,
                    100 * salaryIndex);
        } else {
            return new Freelancer(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], ageNumber,
                    100 * salaryIndex);
        }

    }

    public static Employee[] generateEmployees(int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++) {
            employees[i] = generateEmployee();
        }
        return employees;
    }

    public static void main(String[] args) {
        Employee[] employees = generateEmployees(12);

        Arrays.sort(employees, new AgeComparator());
        System.out.println();

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}

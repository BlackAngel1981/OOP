import observer.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", VacancyType.values()[getIndex()].toString(), jobAgency, 150000);
        Company yandex = new Company("Yandex", VacancyType.values()[getIndex()].toString(), jobAgency, 130000);
        Company geekBrains = new Company("GeekBrains", VacancyType.values()[getIndex()].toString(), jobAgency, 110000);

        Student student1 = new Student("Petrov");
        Specialist specialist1 = new Specialist("Sidorov");
        Master master1 = new Master("Ivanov");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(specialist1);
        jobAgency.registerObserver(master1);

        List<Observer> workers = Arrays.asList(student1, specialist1, master1);

        for (int i = 0; i < 10; i++) {
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();

            workers.forEach(worker1 -> {
                if (!worker1.isWorkerStatus()) {
                    jobAgency.removeObserver(worker1);
                }
            }
            System.out.printf("Итерация %d\n\n", i);
        }

        System.out.println("Работу нашли:");
        workers.forEach(worker2 -> {
            if (!worker2.isWorkerStatus()) {
                System.out.printf("%s %s %s %d\n", worker2.getName(),
                        worker2.getVacancyWorker(),
                        worker2.getCompanyName(),
                        worker2.getSalary());
            }
        }
    }

    static int getIndex() {
        return new Random().nextInt(VacancyType.values().length);
    }
}

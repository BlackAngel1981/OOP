package observer;

public class Student implements Observer {

    private final String name;
    private final String vacancyWorker = "Development";
    private int salary = 20000;
    private String companyName;
    private boolean studentStatus = true;
  
    public Student(String name) {
        this.name = name;
    }

    public String getVacancyWorker() {
        return vacancyWorker;
    }

    public String getName() {
        return name;
    }

    public boolean isWorkerStatus() {
        return studentStatus;
    }

    public int getSalary() {
        return salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public void receiveOffer(String nameCompany, String companyVacancy, int salary) {
        if (this.salary <= salary && this.vacancyWorker.equals(companyVacancy)) {
            System.out.printf("Студент %s %s: Мне нужна эта работа! (компания: %s, вакансия: %s, заработная плата: %d)\n",
                    vacancyWorker, name, nameCompany, companyVacancy, salary);
            this.salary = salary;
            companyName = nameCompany;
            studentStatus = false;
        } else {
            System.out.printf("Студент %s %s: Я найду работу получше! (компания: %s, вакансия: %s, заработная плата: %d)\n",
                    vacancyWorker, name, nameCompany, companyVacancy, salary);
        }
    }
}

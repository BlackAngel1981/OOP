package observer;

import java.util.Random;

public class Company {

    private final Random random = new Random();
    private final String name;
    private String companyVacancy;
    private final Publisher jobAgency;
    private int maxSalary;

    public Company(String name, String companyVacancy, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.companyVacancy = companyVacancy;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

    public void needEmployee() {
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, companyVacancy, salary);
    }


}

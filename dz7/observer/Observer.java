package observer;

public interface Observer {

    void receiveOffer(String nameCompany, String companyVacancy, int salary);

    boolean isWorkerStatus();

    String getName();

    String getVacancyWorker();

    String getCompanyName();

    int getSalary();

}

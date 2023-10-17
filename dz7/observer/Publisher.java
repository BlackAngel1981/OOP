package observer;

public interface Publisher {

    void sendOffer(String companyName, String companyVacancy, int salary);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

}

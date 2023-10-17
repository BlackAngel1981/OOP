package observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void sendOffer(String companyName, String companyVacancy, int salary) {
        if (!observers.isEmpty()) {
            for (Observer observer : observers) {
                if (observer.getVacancyWorker().equals(companyVacancy)) observer.receiveOffer(companyName, companyVacancy, salary);
                else System.out.println("Нет подходящих вакансий!");
            }
        } else System.out.println("Все соискатели нашли работу.");
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}

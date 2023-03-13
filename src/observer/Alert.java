package observer;

import java.util.ArrayList;
import java.util.List;

public class Alert {

    private List<Observer> observers = new ArrayList<>();
    private Situation situation;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public Situation getSituation() {
        return situation;
    }

    public void setSituation(Situation situation) {
        this.situation = situation;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(situation);
        }
    }
}
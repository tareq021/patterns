package observer;

import static observer.Situation.BOGEY;
import static observer.Situation.CIVILIAN;

public class ObserverPatternExample {
    public static void main(String[] args) {
        Alert alert = new Alert();

        GroundObserver groundObserver = new GroundObserver();
        AirborneObserver airborneObserver = new AirborneObserver();

        alert.attach(groundObserver);
        alert.attach(airborneObserver);

        alert.setSituation(BOGEY);

        alert.detach(airborneObserver);
        alert.setSituation(CIVILIAN);
    }
}
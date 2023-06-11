package observer;

import static observer.Situation.BOGEY;
import static observer.Situation.CIVILIAN;

public class ObserverPatternExample {
    public static void main(String[] args) {
        Observer observer = new Observer();

        GroundForce groundForce = new GroundForce();
        AirForce airForce = new AirForce();

        System.out.println("======= Intruder detected in the sky ===========");
        observer.setSituation(BOGEY);
        observer.engage(groundForce);
        observer.engage(airForce);
        observer.notifyAllForces();

        System.out.println("\n======= Civilian detected on the ground ========");
        observer.setSituation(CIVILIAN);
        observer.disengage(airForce);
        observer.notifyAllForces();
    }
}
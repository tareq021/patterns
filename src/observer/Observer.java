package observer;

import java.util.ArrayList;
import java.util.List;

public class Observer {

    private List<Force> forces = new ArrayList<>();
    private Situation situation;

    public void engage(Force force) {
        this.forces.add(force);
    }

    public void disengage(Force force) {
        this.forces.remove(force);
    }

    public Situation getSituation() {
        return situation;
    }

    public void setSituation(Situation situation) {
        this.situation = situation;
    }

    public void notifyAllForces() {
        for (Force force : this.forces) {
            force.update(situation);
        }
    }
}
package observer;

public class AirForce implements Force {

    @Override
    public void update(Situation situation) {
        switch (situation){
            case BOGEY -> System.out.println("AirForce :  Response: ETA 1 minute");
            case CIVILIAN -> System.out.println("AirForce :  nothing to do");
        }

    }
}
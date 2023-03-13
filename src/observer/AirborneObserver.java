package observer;

public class AirborneObserver implements Observer {

    @Override
    public void update(Situation situation) {
        switch (situation){
            case BOGEY -> System.out.println("AirborneObserver :  Response: ETA 1 minute");
            case CIVILIAN -> System.out.println("AirborneObserver :  nothing to do");
        }

    }
}
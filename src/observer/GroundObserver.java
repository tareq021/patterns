package observer;

public class GroundObserver implements Observer {
    @Override
    public void update(Situation situation) {
    switch (situation){
        case BOGEY -> System.out.println("GroundObserver :  Response: Target Locked !!!");
        case CIVILIAN -> System.out.println("GroundObserver :  Guard on foot to talk");
    }
    }
}
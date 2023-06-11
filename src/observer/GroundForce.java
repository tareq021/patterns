package observer;

public class GroundForce implements Force {
    @Override
    public void update(Situation situation) {
    switch (situation){
        case BOGEY -> System.out.println("GroundForce :  Response: Target Locked !!!");
        case CIVILIAN -> System.out.println("GroundForce :  Guard on foot to talk");
    }
    }
}
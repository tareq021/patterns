package decorator;

public class Cannon extends TankDecorator {
    public Cannon(Tank decoratedTank) {
        super(decoratedTank);
    }

    @Override
    public double getCost() {
        return super.getCost() + 25000.00;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with 2A82-1M 125 mm Cannon as Primary armament, ";
    }
}

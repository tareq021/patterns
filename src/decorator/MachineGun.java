package decorator;

public class MachineGun extends TankDecorator {
    public MachineGun(Tank decoratedTank) {
        super(decoratedTank);
    }

    @Override
    public double getCost() {
        return super.getCost() + 10000.00;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with 12.7 mm Machine gun as secondary armament, ";
    }
}

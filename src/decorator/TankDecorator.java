package decorator;

public abstract class TankDecorator implements Tank{
    protected Tank decoratedTank;

    TankDecorator(Tank decoratedTank) {
        this.decoratedTank = decoratedTank;
    }

    public double getCost() {
        return decoratedTank.getCost();
    }

    public String getDescription() {
        return decoratedTank.getDescription();
    }
}

package decorator;

public class SimpleTank implements Tank{

    @Override
    public double getCost() {
        return 1000000.00;
    }

    @Override
    public String getDescription() {
        return "Simple T-14 Armata, ";
    }
}

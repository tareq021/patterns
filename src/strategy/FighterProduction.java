package strategy;

public class FighterProduction implements WarPlaneProductionStrategy {

    private final int numberOfMissiles;
    private final int numberOfPilots;
    private final boolean isStealth;

    public FighterProduction(int numberOfMissiles, int numberOfPilots, boolean isStealth) {
        this.numberOfMissiles = numberOfMissiles;
        this.numberOfPilots = numberOfPilots;
        this.isStealth = isStealth;
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public int getNumberOfPilots() {
        return numberOfPilots;
    }

    public boolean isStealth() {
        return isStealth;
    }

    @Override
    public void produce() {
        System.out.println("Fighter sent to production");
    }
}

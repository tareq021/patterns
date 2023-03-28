package strategy;

public class FighterProduction implements WarPlaneProductionStrategy {

    private final int numberOfLongRangeMissiles;
    private final int numberOfShortRangeMissiles;
    private final int numberOfPilots;
    private final boolean isStealth;

    public FighterProduction(int numberOfLongRangeMissiles, int numberOfShortRangeMissiles, int numberOfPilots, boolean isStealth) {
        this.numberOfLongRangeMissiles = numberOfLongRangeMissiles;
        this.numberOfShortRangeMissiles = numberOfShortRangeMissiles;
        this.numberOfPilots = numberOfPilots;
        this.isStealth = isStealth;
    }

    public int getNumberOfLongRangeMissiles() {
        return numberOfLongRangeMissiles;
    }

    public int getNumberOfShortRangeMissiles() {
        return numberOfShortRangeMissiles;
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

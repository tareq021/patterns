package strategy;

public class DroneProduction implements WarPlaneProductionStrategy {

    private final int numberOfMissiles;
    private final boolean longRangeRadar;
    private final boolean nightVision;

    public DroneProduction(int numberOfMissiles, boolean longRangeRadar, boolean nightVision) {
        this.numberOfMissiles = numberOfMissiles;
        this.longRangeRadar = longRangeRadar;
        this.nightVision = nightVision;
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public boolean isLongRangeRadar() {
        return longRangeRadar;
    }

    public boolean isNightVision() {
        return nightVision;
    }

    @Override
    public void produce() {
        System.out.println("Drone sent to production");
    }
}

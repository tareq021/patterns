package strategy;

public class StrategyPatternExample {
    public static void main(String[] args) {
        Production production = new Production();

        production.start(new DroneProduction(6, true, true));
        production.start(new FighterProduction(6, 2, true));
    }
}

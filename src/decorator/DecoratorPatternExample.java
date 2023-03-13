package decorator;

public class DecoratorPatternExample {

    public static void main(String[] args) {
        Tank tank = new SimpleTank();
        System.out.println("Cost: " + tank.getCost() + ", Description: " + tank.getDescription());

        tank = new Cannon(tank);
        System.out.println("Cost: " + tank.getCost() + ", Description: " + tank.getDescription());

        tank = new MachineGun(tank);
        System.out.println("Cost: " + tank.getCost() + ", Description: " + tank.getDescription());
    }
}

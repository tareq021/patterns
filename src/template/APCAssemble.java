package template;

public class APCAssemble extends ArmoredVehicleAssemble{
    @Override
    void getChassis() {
        System.out.println("APC: Chassis received");
    }

    @Override
    void setWheels() {
        System.out.println("APC: wheels are installed");
    }

    @Override
    void setSteering() {
        System.out.println("APC: Steering installed");
    }

    @Override
    void setArmor() {
        System.out.println("APC: Body armor set");
    }

    @Override
    void putWiring() {
        System.out.println("APC: Fully Wired");
    }

    @Override
    void test() {
        System.out.println("APC: Test Passed :)");
    }
}

package template;

public class IMVAssemble extends ArmoredVehicleAssemble{
    @Override
    void getChassis() {
        System.out.println("IMV: Chassis received");
    }

    @Override
    void setWheels() {
        System.out.println("IMV: wheels are installed");
    }

    @Override
    void setSteering() {
        System.out.println("IMV: Steering installed");
    }

    @Override
    void setArmor() {
        System.out.println("IMV: Body armor set");
    }

    @Override
    void putWiring() {
        System.out.println("IMV: Fully Wired");
    }

    @Override
    void test() {
        System.out.println("IMV: Test failed !!!");
    }
}

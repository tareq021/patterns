package template;

public abstract class ArmoredVehicleAssemble {

    abstract void getChassis();

    abstract void setWheels();

    abstract void setSteering();

    abstract void setArmor();

    abstract void putWiring();

    abstract void test();

    public final void assemble() {
        getChassis();
        setWheels();
        setSteering();
        setArmor();
        putWiring();
        test();
    }
}

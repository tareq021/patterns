package template;

public class TemplatePatternExample {
    public static void main(String[] args) {
        ArmoredVehicleAssemble vehicleAssemble = new APCAssemble();
        vehicleAssemble.assemble();
        System.out.println();
        System.out.println();
        vehicleAssemble = new IMVAssemble();
        vehicleAssemble.assemble();
    }
}

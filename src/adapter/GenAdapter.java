package adapter;

public class GenAdapter implements FifthGenF22Raptor {
    private final FourthGenF22Raptor fourthGenF22Raptor;

    public GenAdapter(FourthGenF22Raptor fourthGenF22Raptor) {
        this.fourthGenF22Raptor = fourthGenF22Raptor;
    }

    @Override
    public void setLongRangeMissileGuidance() {
        System.out.println("Electronic Guidance system installed in Long Range missiles");
    }

    @Override
    public void setShortRangeMissileGuidance() {
        System.out.println("Electronic Guidance system installed in Short Range missiles");
    }

    @Override
    public void setStealth() {
        System.out.println("Stealth functionality installed");
    }
}

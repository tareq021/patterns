package adapter;

public class AdapterPatternExample {
    public static void main(String[] args) {
        FourthGenF22Raptor fourthGenF22Raptor = new FourthGenF22Raptor(2, 6);
        FifthGenF22Raptor fifthGenF22Raptor = new GenAdapter(fourthGenF22Raptor);
        fifthGenF22Raptor.setLongRangeMissileGuidance();
        fifthGenF22Raptor.setShortRangeMissileGuidance();
        fifthGenF22Raptor.setStealth();
    }
}
package adapter;

public class FourthGenF22Raptor {

    private int longRangeMissilesCount;
    private int shortRangeMissilesCount;

    public FourthGenF22Raptor(int longRangeMissilesCount, int shortRangeMissilesCount) {
        this.longRangeMissilesCount = longRangeMissilesCount;
        this.shortRangeMissilesCount = shortRangeMissilesCount;
    }

    public int getLongRangeMissilesCount() {
        return longRangeMissilesCount;
    }

    public void setLongRangeMissilesCount(int longRangeMissilesCount) {
        this.longRangeMissilesCount = longRangeMissilesCount;
    }

    public int getShortRangeMissilesCount() {
        return shortRangeMissilesCount;
    }

    public void setShortRangeMissilesCount(int shortRangeMissilesCount) {
        this.shortRangeMissilesCount = shortRangeMissilesCount;
    }
}

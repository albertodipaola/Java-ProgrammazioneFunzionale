public class Thermometer {
    private int externalTemp;
    private int internalTemp;

    public Thermometer(int externalTemp, int internalTemp) {
        this.externalTemp = externalTemp;
        this.internalTemp = internalTemp;
    }
    
    public int getExternalTemp() {
        return externalTemp;
    }
    public void setExternalTemp(int externalTemp) {
        this.externalTemp = externalTemp;
    }
    public int getInternalTemp() {
        return internalTemp;
    }
    public void setInternalTemp(int internalTemp) {
        this.internalTemp = internalTemp;
    }
}
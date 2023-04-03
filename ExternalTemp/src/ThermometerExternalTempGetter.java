public class ThermometerExternalTempGetter implements PropertyGetter {

    @Override
    public double getDoubleProperty(Object object) {
        Thermometer therm = (Thermometer)object;
        return therm.getExternalTemp();
    }
    
}

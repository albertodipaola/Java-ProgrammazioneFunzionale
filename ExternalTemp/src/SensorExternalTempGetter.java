public class SensorExternalTempGetter implements PropertyGetter {

    @Override
    public double getDoubleProperty(Object object) {
        Sensor sensor = (Sensor)object;
        return sensor.getExternalTemp();
    }
    
}

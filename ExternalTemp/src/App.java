public class App {
    public static void main(String[] args) throws Exception {
        Sensor[] sensors = new Sensor[]{
            new Sensor(23, 26),
            new Sensor(12, 18),
            new Sensor(19, 25),
            new Sensor(8, 13),
            new Sensor(25, 31)
        };

        Thermometer[] therms = new Thermometer[] {
                new Thermometer(23, 26),
                new Thermometer(12, 18),
                new Thermometer(19, 25),
                new Thermometer(8, 13),
                new Thermometer(25, 31)
        };

        //PropertyGetter pGetterSensor = (Object obj) -> ((Sensor) obj).getExternalTemp();
        //PropertyGetter pGetterTherm = (Object obj)->((Thermometer) obj).getExternalTemp();

        System.out.println("Temperatura media sensori: " + avgExternalTemperature(sensors, (Object obj) -> ((Sensor) obj).getExternalTemp()));
        System.out.println("Temperatura media termometri: " + avgExternalTemperature(therms, (Object obj) -> ((Thermometer) obj).getExternalTemp()));
    }

    public static<T> double avgExternalTemperature(T[] sensors, PropertyGetter pGetter) {
        double sum = 0;
        for (T sensor : sensors) {
            sum += pGetter.getDoubleProperty(sensor);
        }
        return sum/sensors.length;
    }
}


public class AverageBrand implements SensorBrand{
   

    @Override
    public TemperatureSensor createTemperatureSensor() {
        return new AverageTemperatureSensor();
    }

    @Override
    public HumiditySensor createHumiditySensor() {
        return new AverageHumiditySensor();
    }
    @Override
    public LightSensor createLightSensor() {
        return new AverageLightSensor();
    }
}
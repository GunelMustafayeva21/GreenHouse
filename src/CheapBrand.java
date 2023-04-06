
public class CheapBrand implements SensorBrand {
   

    @Override
    public TemperatureSensor createTemperatureSensor() {
        return new CheapTemperatureSensor();
    }

    @Override
    public HumiditySensor createHumiditySensor() {
        return new CheapHumiditySensor();
    }
    @Override
    public LightSensor createLightSensor() {
        return new CheapLightSensor();
    }
}

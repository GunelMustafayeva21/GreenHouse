
public class BestBrand implements SensorBrand {
   

    @Override
    public TemperatureSensor createTemperatureSensor() {
        return new BestTemperatureSensor();
    }

    @Override
    public HumiditySensor createHumiditySensor() {

        return new BestHumiditySensor();
    }

    @Override
    public LightSensor createLightSensor(){
        return  new BestLightSensor();
    }
}


public class AverageHumiditySensor implements TemperatureSensor, SensorAlarm, HumiditySensor {
    

    static final String description = "The Average Light Sensor for the GreenHouse";

    @Override
    public String getDescription() {
        return description;
    }
    public void triggered(){
        Message message= new HumidityMessageAdapter(new HumidityMessage());
        System.out.println("Humidity Sensor Produced by AverageBrand");
        message.sendMessage("Humidity is increasing dangerously. ");

        CoolingSystem coolingSystem = new CoolingSystem();
        StartCoolingSystemCommand turnOn = new StartCoolingSystemCommand(coolingSystem);
        turnOn.execute();

        ExecutiveObject execFile = new ExecutiveObject();
        execFile.showMessage("execFile : HIGH HUMIDITY");
    }
}

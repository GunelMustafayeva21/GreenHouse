
public class CheapTemperatureSensor implements SensorAlarm,TemperatureSensor {
    

    static final String description = "The Cheap Temperature Sensor for the GreenHouse";

    @Override
    public String getDescription() {
        return description;
    }
    public void triggered(){
        Message message= new TemperatureMessageAdapter(new TemperatureMessage());
        System.out.println("Temperature Sensor Produced by CheapBrand");
        message.sendMessage("Temperature is increasing dangerously. ");

        CoolingSystem coolingSystem = new CoolingSystem();
        StartCoolingSystemCommand turnOn = new StartCoolingSystemCommand(coolingSystem);
        turnOn.execute();

        ExecutiveObject execFile = new ExecutiveObject();
        execFile.showMessage("execFile : HIGH TEMPERATURE");
    }
}


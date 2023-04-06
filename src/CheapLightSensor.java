
public class CheapLightSensor implements TemperatureSensor,SensorAlarm, LightSensor{
   

    static final String description = "The Cheap Light Sensor for the GreenHouse";

    @Override
    public String getDescription() {
        return description;
    }
    public void triggered(){
        Message message =  new LightMessageAdapter(new LightMessage());
        System.out.println("Light Sensor Produced by CheapBrand");
        message.sendMessage("Light level is increasing dangerously. ");
        DarknessSystem darknessSystem = new DarknessSystem();
        StartDarknessCommand turnOn = new StartDarknessCommand(darknessSystem);
        turnOn.execute();

        ExecutiveObject execFile = new ExecutiveObject();
        execFile.showMessage("execFile : UNUSUAL LIGHT ");
    }
}

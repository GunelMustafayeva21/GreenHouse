
public class MainProject {
	 public static void main(String[] args) {
		
	        ExecutiveObject execFile = ExecutiveObject.getInstance();

	      
	        SensorBrand brand;
	        brand = new BestBrand();

	        CoolingSystem alarm= new CoolingSystem();
	        DarknessSystem darkAlarm =  new DarknessSystem();

	        TemperatureSensor temperatureSensor = brand.createTemperatureSensor();
	        HumiditySensor humiditySensor = brand.createHumiditySensor();
	        LightSensor lightSensor = brand.createLightSensor();

	        //when the sensors are triggered, notifying the farmers
	        SensorSystem sensorSystem = new SensorSystem();
	        sensorSystem.register((SensorAlarm) temperatureSensor );
	        sensorSystem.register((SensorAlarm) humiditySensor);
	        sensorSystem.register((SensorAlarm) lightSensor);
	        sensorSystem.notifyFarmers();

	        //Calling the commands for the Command pattern.
	        GreenhouseControlRemote remote = new GreenhouseControlRemote();
	        remote.setCommand(new StopCoolingSystemCommand(alarm));
	        remote.buttonPressed();

	        remote.setCommand(new StopDarknessCommand(darkAlarm ));
	        remote.buttonPressed();

	 }
}

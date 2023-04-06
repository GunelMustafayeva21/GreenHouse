
public class StopCoolingSystemCommand implements Command{
   

    CoolingSystem alarm;

    public StopCoolingSystemCommand(CoolingSystem alarm){
        super();
        this.alarm= alarm;
    }
    public void execute(){
        System.out.println("Stopping the Cooling System...");
        alarm.stop();
    }


}

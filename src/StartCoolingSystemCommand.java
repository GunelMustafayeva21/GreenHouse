
public class StartCoolingSystemCommand implements Command{
    
    CoolingSystem alarm;

    public StartCoolingSystemCommand(CoolingSystem alarm){
        super();
        this.alarm= alarm;
    }

    public void execute(){
        System.out.println("Starting the Cooling System...");
        alarm.start();
    }
}

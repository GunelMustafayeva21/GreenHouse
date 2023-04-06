
public class StopDarknessCommand implements Command{
   
    DarknessSystem alarm;
    public StopDarknessCommand(DarknessSystem alarm){
        super();
        this.alarm= alarm;
    }
    public void execute(){
        System.out.println("Stopping  darkness over the greeenhouse...");
        alarm.stop();
    }
}

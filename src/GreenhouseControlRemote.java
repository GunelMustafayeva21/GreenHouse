
public class GreenhouseControlRemote {
    

    Command command;

    public void setCommand(Command command){
        this.command= command;
    }

    public void buttonPressed(){
        command.execute();
    }
}


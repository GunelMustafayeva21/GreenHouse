
public class TemperatureMessageAdapter implements Message{
   
    private TemperatureMessage adaptee;
    public TemperatureMessageAdapter(TemperatureMessage tempMessage){
        this.adaptee= tempMessage;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Message from Temperature Adapter : " +message);
    }
}


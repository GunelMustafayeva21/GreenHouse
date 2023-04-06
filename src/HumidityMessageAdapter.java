
public class HumidityMessageAdapter implements Message{
   


    private HumidityMessage adaptee;

    public HumidityMessageAdapter(HumidityMessage humMessage){
        this.adaptee = humMessage;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Message from Humidity Adapter : " + message);
    }
}

public class LightMessageAdapter implements Message {
    

    private LightMessage adaptee;

    public LightMessageAdapter(LightMessage lightMessage){
        this.adaptee = lightMessage;
    }
    @Override
    public void sendMessage(String message) {
        System.out.println("Message from Light Adapter : " + message);
    }

}


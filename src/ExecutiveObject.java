
public class ExecutiveObject {
    

    // uses Singleton Pattern because there must be single executive file
    private static ExecutiveObject instance;

    ExecutiveObject(){ }

    public static ExecutiveObject getInstance(){
        return instance;
    }

    //function that makes sure that the object is created only once
    public void showMessage(String message){

            System.out.println(message + " detected.");

    }
}


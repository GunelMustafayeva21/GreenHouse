
import java.util.Enumeration;
import java.util.Vector;

public class SensorSystem {
    private Vector farmers = new Vector();

    public void register(SensorAlarm sensorAlarm){
        farmers.addElement(sensorAlarm);
    }

    public void notifyFarmers(){
        for(Enumeration e = farmers.elements();e.hasMoreElements();){
            ((SensorAlarm) e.nextElement()).triggered();
        }
    }
}


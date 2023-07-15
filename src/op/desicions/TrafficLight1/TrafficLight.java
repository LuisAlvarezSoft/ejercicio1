package op.desicions.TrafficLight1;
public class TrafficLight {
    public boolean state;
    public String color;

    public boolean showStatus(){
        return state;
    }
    public String showtraffic(){
        if(color.equals("Green")){
            return "Go..";
        }else if(color.equals("Red")){
            return "Stop..";
        }else if(color.equals("Yellow")){
            return "Start accelerating..";
        }else{
            return "The traffic light it´s broken";
        }
    }
}
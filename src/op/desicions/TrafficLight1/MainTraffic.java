package op.desicions.TrafficLight1;

public class MainTraffic {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.color = "Green";
        trafficLight.state = true;
        if(trafficLight.showStatus()){
            System.out.println("message "+ trafficLight.showtraffic());
        }
    }
}

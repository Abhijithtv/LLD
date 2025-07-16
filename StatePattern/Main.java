package StatePattern;

public class Main {
    public static void main(String[] args){
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.initState();
        trafficLight.printLight();
        trafficLight.nextState();
        trafficLight.printLight();
        trafficLight.nextState();
        trafficLight.printLight();
        trafficLight.nextState();
        trafficLight.printLight();
    }

}

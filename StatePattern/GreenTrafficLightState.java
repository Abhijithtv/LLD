package StatePattern;

public class GreenTrafficLightState implements ITrafficLightState {

    @Override
    public String getLight() {
        return "green";
    }

    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new RedTrafficLightState());
    }
}

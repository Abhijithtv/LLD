package StatePattern;

public class RedTrafficLightState implements ITrafficLightState {

    @Override
    public String getLight() {
        return "red";
    }

    @Override
    public void next(TrafficLight trafficLight) {
        ITrafficLightState redLightState = new GreenTrafficLightState();
        trafficLight.setState(redLightState);
    }
}

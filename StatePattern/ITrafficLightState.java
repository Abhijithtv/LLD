package StatePattern;

public interface ITrafficLightState {
    String getLight();
    void next(TrafficLight trafficLight);
}

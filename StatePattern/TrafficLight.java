package StatePattern;

public class TrafficLight {
    ITrafficLightState trafficLightState;

    public TrafficLight(){
    }

    public void setState(ITrafficLightState state){
        trafficLightState = state;
    }

    public void initState(){
        setState(new RedTrafficLightState());
    }

    public void nextState(){
        trafficLightState.next(this);
    }

    public void printLight(){
        System.out.println("Light ="+trafficLightState.getLight());
    }

}

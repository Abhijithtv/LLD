package MomentoPattern;

public class SnapShot implements ISnapShot{
    String state;

    public SnapShot(String state){
        this.state = state;
    }

    @Override
    public void takeSnap(String change) {
        this.state += change;
    }

    @Override
    public String getSnapInfo() {
        return state;
    }
}

package CommandPattern;

public class Remote {
    int volume;
    int channel;

    public Remote(){
        volume = 0;
        channel = 0;
    }
    public void  IncVolume(){
        volume++;
    }

    public void  DecVolume(){
        volume--;
    }

    public void FwdChannel(){
        channel++;
    }

    public void BackChannel(){
        channel--;
    }


}



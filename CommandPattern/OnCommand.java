package CommandPattern;

public class OnCommand implements ICommand{
    Remote remote;

    public OnCommand(Remote remote){
        this.remote = remote;
    }

    @Override
    public void execute() {
        this.remote.IncVolume();
        this.remote.IncVolume();
        this.remote.FwdChannel();
    }
}

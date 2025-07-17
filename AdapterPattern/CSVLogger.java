package AdapterPattern;

public class CSVLogger implements ILogger{
    @Override
    public void log(String msg) {
        System.out.println("Logged to csv - msg " + msg);
    }
}

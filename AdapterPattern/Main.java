package AdapterPattern;

public class Main {
    public static void main(String[] args){
        IJsonLogger jsonLogger = new JSONToCSVAdapter(new CSVLogger());
        jsonLogger.logAsJSON("OK:lol");
    }
}

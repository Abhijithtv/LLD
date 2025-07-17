package AdapterPattern;

public class JSONToCSVAdapter implements IJsonLogger{
    CSVLogger csvLogger;

    public JSONToCSVAdapter(CSVLogger csvLogger){
        this.csvLogger = csvLogger;
    }

    @Override
    public void logAsJSON(String jsonMsg) {
        System.out.println("Converting json to csv" );
        csvLogger.log("ConvertedToCSVMsg="+jsonMsg);
    }
}

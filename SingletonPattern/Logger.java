package SingletonPattern;

public class Logger {
    private static volatile Logger logger;
    private Logger(){}

    public static Logger GetInstance(){
        if(logger != null) return logger; //reduce wait period in sync block
        synchronized(Logger.class){
            if(logger == null){ //prevent reinitialization since there can be
                                // threads waiting for the sync block
                logger = new Logger();
            }
        }
        return logger;
    }

    public void log(String str){
        System.out.println("msg:"+str);
    }
}

public abstract class LogProcessor {

    public static int INFO = 1;
    public static int DEBUG = 1;
    public static int ERROR = 1;

    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(int logLevel, String message){
        if(nextLogProcessor != null){
            nextLogProcessor.log(logLevel, message);
        }
    }
}

public class FileLogger {
    private static FileLogger logger;

    // prevents clients from using the constructor
    private FileLogger() { }

    public static FileLogger getFileLogger() {
        if(logger == null)
            logger = new FileLogger();
        return logger;
    }

    public synchronized void log(String msg) {
        FileUtil fUtil = new FileUtil();
        fUtil.writeToFile("log.txt", msg, true, true);
    }
}
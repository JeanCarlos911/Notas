public class FileLogger {
    // the synchronized word allows that only one thread use the method at every moment
    public synchronized void log(String msg) {
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(
                    new FileOutputStream("log.txt", true));
            dos.writeBytes(msg);
            dos.close();
        } catch (FileNotFoundException ex) {
            //
        } catch (IOException ex) {
            //
        }
    }
}
package interfaces.learning;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("File logged: " + message);
    }
}

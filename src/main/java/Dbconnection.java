import org.example.DatabaseConnection;

public class Dbconnection {
    public static void main(String[] args) {
        DatabaseConnection d1=DatabaseConnection.getInstance();
        d1.connect();
    }
}

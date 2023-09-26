package ra.examle;
import static ra.examle.WebConfig.*;

import java.sql.Connection;

public class ConnectionDB {
    public static void main(String[] args) {
        System.out.println(DRIVER);
        System.out.println(URL);
    }
}

package Main;

import java.io.*;

public class FileHandler {
    public static void saveOrder(String orderInfo) throws IOException {
        FileWriter writer = new FileWriter("orders.txt", true);
        writer.write(orderInfo + "\n");
        writer.close();
    }
}
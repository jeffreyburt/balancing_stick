import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class main {

    private static File csv_file = new File("C:\\Users\\Jeffrey Burt\\Desktop\\test_csv.csv");

    public static void main(String[] args) throws IOException {

        BufferedReader csvReader = new BufferedReader(new FileReader(csv_file));
        String row;
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            for (String string:
                 data) {
                System.out.println(Double.parseDouble(string));
            }
        }
        csvReader.close();

    }
}

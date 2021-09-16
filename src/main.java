import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class main {

    private static ArrayList<Motor_data_point> motorDataPoints;

    private static File csv_file = new File("C:\\Users\\Jeffrey\\Desktop\\Falcon500MotorCurveData (2).csv");

    public static void main(String[] args) throws IOException {

        motorDataPoints = new ArrayList<>();

        BufferedReader csvReader = new BufferedReader(new FileReader(csv_file));
        String row;
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");

            Motor_data_point motor_data_point = new Motor_data_point(c2d(data[0]),c2d(data[1]), c2d(data[2]),
                    c2d(data[3]), c2d(data[4]), c2d(data[5]), c2d(data[6]));

            motorDataPoints.add(motor_data_point);
        }
        csvReader.close();


        double total_torque = 0;
        double total_current = 0;
        for (Motor_data_point point:
             motorDataPoints) {
            total_torque += point.torque;
            total_current += point.current;
        }

        System.out.println("Torque Constant: " + total_torque/total_current );

    }


    //converts a string to a double
    private static double c2d(String string){
        return Double.parseDouble(string);
    }
}

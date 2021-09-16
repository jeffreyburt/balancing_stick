import java.util.ArrayList;

public class Simulator {

    private double timeStep_seconds = 0.001;
    private double ratio_step = 1;
    private ArrayList<Motor_data_point> motor_data;

    public Simulator(ArrayList<Motor_data_point> motor_data){
        this.motor_data = motor_data;
    }

    //higher indexs are of higher rpms
    //returns an estimated torque based off of any rpm within the motor range
    //returns 0 when max torque rpm is reached
    //assumes that the motor is always speeding up
    private double rpm_regression (int index_num, double desired_rpm){
        return 0;
    }



}

import java.util.ArrayList;

public class Simulator {

    private double timeStep_seconds = 0.001;
    private double ratio_step = 1;
    private double angle_step;
    private ArrayList<Motor_data_point> motor_data;

    public Simulator(ArrayList<Motor_data_point> motor_data){
        this.motor_data = motor_data;
    }

    private void sim_controller(){

        //gear ratio loop
        double gear_ratio = 30;
        while (true){


            //displacement loop
            double angle = 0;
            while (true){
                if(!simulate(gear_ratio, angle)){
                    angle -= angle_step;
                    break;
                }
                angle += angle_step;
            }

            System.out.println("A gear ratio of: " + gear_ratio +":1 can recover from a displacement of: "
            + angle + " degrees");


            gear_ratio -= ratio_step;
            if(gear_ratio <= 0){
                break;
            }
        }

    }

    private boolean simulate(double gear_ratio, double angle){

        double angular_velocity = 0;
        double motor_rpm = 0;

        double motor_torque = motor_data.get(0).torque;
        while (angular_velocity >= 0){

        }
        return true;
    }

    //higher indexs are of higher rpms
    //returns an estimated torque based off of any rpm within the motor range
    //returns 0 when max torque rpm is reached
    //assumes that the motor is always speeding up
    private double rpm_regression (int index_num, double desired_rpm){
        return 0;
    }



}

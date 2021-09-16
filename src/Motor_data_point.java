public class Motor_data_point {


    public final double speed;
    public final double torque;
    public final double current;
    public final double supplied_power;
    public final double output_power;
    public final double efficiency;
    public final double power_loss;

    public Motor_data_point(double speed, double torque, double current, double supplied_power, double output_power, double efficiency, double power_loss){

        this.speed = speed;
        this.torque = torque;
        this.current = current;
        this.supplied_power = supplied_power;
        this.output_power = output_power;
        this.efficiency = efficiency;
        this.power_loss = power_loss;
    }
}

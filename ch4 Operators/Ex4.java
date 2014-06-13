// Exercise 4

class VelocityCalculator
{
    static float Velocity (float dis, float time)
    {
        if(time == 0) return 0f;
        else return dis/time;
    }
}

public class Ex4
{
    public static void main(String[] args)
    {
        float distance = 3.0f;
        float time = 5.0f;
        System.out.println("distance: "+ distance + " time: "+time);
        System.out.println("velocity:"+ VelocityCalculator.Velocity(distance, time));

    }
}

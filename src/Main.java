
public class Main {
    public static void main(String[] args) {

        System.out.println(Eular_method(0,1,2,0));

    }




    public static double Eular_method(double y_initial, double x_initial, double numStep, double xFind)
    {
        double stepSize = (xFind - x_initial)/numStep;
        double delta_y = 0;
        double slope = 0;
        double y = y_initial;
        double x = x_initial;
        for (int i = 0; i < numStep; i++)
        {
            x += stepSize;
            slope = slope_calc(x, y);
            y += slope * stepSize;
        }
        return y;

        /*if(x_initial>xFind)
        {
            for(double i = x_initial; i > xFind; i+= stepSize)
            {
                slope = slope_calc(i,y);

                y += (slope*stepSize);

            }
            return y;

        }
        else
        {
            for(double i = x_initial; i <xFind; i+= stepSize)
            {
                slope = slope_calc(i,y);
                y += slope*stepSize;

            }
            return y;


        }
        */
    }

    public static double slope_calc(double x, double y)
    {
        return 1-y;
    }


}
package codes;

import java.text.DecimalFormat;

public class Aula_04 {
    public static void main(String[] args){

            double kmph = 0.0, mps, mph, fps;

            System.out.println("k/h\tm/s \tmph \tpps");
            while (kmph <= 50.0) {
                mps = 0.2778*kmph;
                mph = 0.6214*kmph;
                fps = 0.9113*kmph;
                
                
                //if (kph < 10) System.out.print("0");
                //System.out.printf("%.2f\t", kph);
                //if (mps < 10) System.out.print("0");
                ///System.out.printf("%.2f\n", mps);
                //kph+=0.5;
                
            

                System.out.print(new DecimalFormat("00.00").format(kmph) + "\t");
                System.out.print(new DecimalFormat("00.00").format(mps) + "\t");
                System.out.print(new DecimalFormat("00.00").format(mph) + "\t");
                System.out.println(new DecimalFormat("00.00").format(fps));

                kmph+=0.5;









            }
    }

}
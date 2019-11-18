package com.essa.jumic.generator;

public class BodyMassIndex {

    /** Write function bmi that calculates body mass index (bmi = weight / (height ^ 2)). 
     * if bmi <= 18.5 return "Underweight"  *
     * <p>  * if bmi <= 25.0 return "Normal" *
     * if bmi <= 30.0 return "Overweight"  *
     * if bmi > 30 return "Obese"  */

    public static void main (String [] anything){

        BodyMassIndex x = new BodyMassIndex();
        System.out.println(x.calculateBMI(500.0,8.0));


    }



    private String calculateBMI(double weight, double height){

         double bmi = weight/ (height * height);

         if(bmi<=18.5) return "Under weight";
         if (bmi<=25.0) return "Normal";
         if(bmi<=30) return "Overweight";
         return "Obese";

    }


}

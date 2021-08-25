package com.alfabank.work16;
import com.alfabank.work133.*;


public class Runner {
    public void run(){
//        int a = 10;
//        int b = 0;
//        try {
//            System.out.println(devisionInt(a,b));
//        }catch (ArithmeticException exp){
//            System.out.println("Error => " + exp);
//        }
//
//        double aa = 10.0;
//        double bb = 0.0;
//
//        try {
//            System.out.println(devisionDouble(aa,bb));
//        }catch (ArithmeticException exp){
//            System.out.println("Error => " + exp);
//        }
//
//
//        Person person = new Person();
//        person.setFirstName("Ihor");
//        person.setLastName("Android");
//        try{
//            person.setAge(-1);
//        }catch (InvalidAgeException exp){
//            System.out.println("Error => " + exp.getMessage());
//        }
        try{
            Shape shape = Shape.parseRectangle("Circle:BLACK:10");
        }   catch (InvalidShapeStringException ex){
            System.out.println("Error = " +  ex.getMessage());
        }
    }
    public int devisionInt(int a,int b){
 //       try {
            return a / b;
 //       }catch (ArithmeticException exp){
        //          System.out.println("Error: " + exp.getMessage());
  //          return 0;
       // }
    }
    public int devisionDouble(double a,double b){
        if (b == 0.0)
        {
            throw new ArithmeticException("Error -> zero double");
        }
        return (int)(a / b);

    }
}

package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(true, 1));    // true
        System.out.println(shouldWakeUp(false, 2));   // false
        System.out.println(shouldWakeUp(true, 8));    // false
        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if(clock < 0 || clock > 23){
            return  false;
        }

        if ( isBarking && (clock > 20 || clock < 8 )){
            return true;
        }else {
            return false;
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if ((firstAge > 13 && firstAge < 19) || (secondAge > 13 && secondAge < 19) || (thirdAge > 13 && thirdAge < 19)) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean isCatPlaying(boolean isSummer, int temp) {
     if(temp < 35 && temp >25 && !isSummer ){
         return true;
     }
     else if( isSummer && temp < 45 && temp > 25){
        return true;
            }
     else {
         return false;
     }

    }

    public static double area(double width, double height) {
       if (width < 0 || height < 0){
           return -1;
       } else {
           return height * width;
       } }

    public static double area(double radius) {
       if(radius<0){
           return -1;
       }
       else {
       return radius*radius*Math.PI;
       }
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(isBarking){
            if (clock >= 8 && clock <=20) {
                return false;
            }else if (clock >= 0 && clock <=23){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       if(firstAge <= 19 && firstAge >= 13){
           return true;
       }else{
           if(secondAge<=19 && secondAge >= 13){
               return true;
           }else{
               if(thirdAge<=19 && thirdAge >= 13) {
                   return true;
               }else{
                   return false;
               }
           }
       }

    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(isSummer){
            if (temp > 25 && temp < 45){
                return true;
            }else{
                return false;
            }
        }else{
            if (temp > 25 && temp <= 35){
                return true;
            }else{
                return false;
            }
        }
    }

    public static double area(double width, double height) {
       if(width < 0 || height < 0){
           double i = -1;
           return i;
       }else{
           double sonuc = width * height;
           return sonuc;
       }
    }

    public static double area(double radius) {
        if(radius < 0){
            return -1.0;
        }
       double sonuc = radius* radius * Math.PI;
       return sonuc;

    }
}

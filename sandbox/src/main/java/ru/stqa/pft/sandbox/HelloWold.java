package ru.stqa.pft.sandbox;

public class HelloWold {

	public static void main (String[] args) {
        hello("world");
        hello("user");
        hello("Natali");


        double l = 5;
        System.out.println("Ploshchad kvardata so storonoi" + 1 + "=" + area(l));

        double a=4;
        double b=6;

        System.out.println("Ploshchad preamougolnika so storonami" + a + "i" + b + "=" + area(a, b));
    }
    public  static void hello (String somebody ) {
        System.out.println("Hello,"+somebody + "!");
    }
     public static double area (double len){
         return len * len;
     }
   public static double area (double a, double b){
    return a * b;
   }
}


public class test {
   return u + (a * t);
}

public static void main(String[] args) {
    double u = 10.0; // mass in kilograms
    double a = 5.0; // height in meters
    double t = 5.0; 


    double v = velocity(u, a, t);
       System.out.println("final velocity (v) " + v);
}

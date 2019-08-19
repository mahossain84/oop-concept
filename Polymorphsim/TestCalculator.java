package Polymorphsim;

public class TestCalculator {

    public static void main(String[] args) {
        LandCalculator l = new LandCalculator();
       int i =  l.areaOfLand(10,15);
        System.out.println(i);

        ModernCalcultor m = new ModernCalcultor();
      int n =   m.areaOfLand(10,15);
        System.out.println(n);
    }
}

package Polymorphsim;

public class ModernCalcultor extends LandCalculator {

    @Override
    public int areaOfLand(int a, int b){
        int total = a+b-1;
        return total;
    }
}

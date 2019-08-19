package OopConcept;

public class TestCar {
    public static void main(String[] args) {

        Car corolla  = new Toyata ();
        corolla.Shape();
        corolla.Start();
        corolla.Stop();

        Toyata lexus = new Toyata();
        lexus.Shape();
        lexus.Start();
        lexus.Stop();
        lexus.Energy();


        MotorCar model = new Toyata();
        model.hybridEngine();
        model.driver();



    }
}

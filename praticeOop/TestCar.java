package praticeOop;

public class TestCar {

    public static void main(String[] args) {
       Car mycar = new Bmw();
       mycar.Start();
       mycar.Stop();
       mycar.Remote();

       Bmw b1 = new Bmw();
       b1.Start();
       b1.Stop();
       b1.Remote();
       b1.Fly();
       b1.Pilot();

       Lexas l1 = new Bmw();
       l1.Pilot();

       Carola c1 = new Lexas();
       c1.Display();
       c1.Wifi();



    }
}

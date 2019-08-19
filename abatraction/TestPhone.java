package abatraction;

public class TestPhone {

    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone() {
            @Override
            public void touchScreen() {

            }
        };
        sp.call();

    }
}

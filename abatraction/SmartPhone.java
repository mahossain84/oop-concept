package abatraction;

public abstract class SmartPhone implements Phone {


    public abstract void touchScreen();

    public void browser(){

    }


    public void call() {
        System.out.println("call by siri");


    }


    public void text(String message) {
        System.out.println("text : " + message);

    }
}

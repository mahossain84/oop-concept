package Encapsulation;

public class StudentDataBase {

    public static void main(String[] args) {
      Student st1 = new Student();
        st1.setStName("Alamgir");
        st1.setStId(123);
        st1.setStDob("1985");
        System.out.println(st1.getStName() + " " +st1.getStId() + " " + st1.getStDob());

        Student st2 = new Student();
        st2.setStName("Ayaat");
        st2.setStId(234);
        st2.setStDob("2019");

       //        System.out.println();


    }
}

package Encapsulation;

public class Student {

    private String stName;
    private int stId;
    private String stDob;

    public Student(){

    }

    public Student(String stName, int stId, String stDob) {
        this.stName = stName;
        this.stId = stId;
        this.stDob = stDob;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public int getStId() {
        return stId;
    }

    public void setStId(int stId) {
        this.stId = stId;
    }

    public String getStDob() {
        return stDob;
    }

    public void setStDob(String stDob) {
        this.stDob = stDob;
    }










}

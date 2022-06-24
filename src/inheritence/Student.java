package inheritence;

public class Student extends Person {

    private int grade;

    public Student(String name, int age, String address, int grade) {
        super(name, age, address);
        this.grade = grade;
    }

    public int getGrade() {

        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

package xyz;

public class Person {

    private long salary;
    private String name;
    private int bankPass;

    public Person(long salary, String name, int bankPass) {
        System.out.println("in parameterized constructor");
        this.salary = salary;
        this.name = name;
        this.bankPass = bankPass;
    }

    public Person() {
        System.out.println("in constructor");
        System.out.println(name +" " + salary + " " + bankPass);
    }



    public long getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getBankPass() {
        return bankPass;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBankPass(int bankPass) {
/*//        if(oldPass == 1234){
            System.out.println("success");*/
            this.bankPass = bankPass;
/*
        } else System.out.println("not authorized");
*/

    }
}
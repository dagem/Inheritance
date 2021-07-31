package Inheritance;

public class Parent extends Person{
    static int parentNumber;
    public Parent(){
        super();
       ++parentNumber;
    }
    public Parent(String first, String middle, String last, String age, String gender){
        super(first,middle,last,age,gender);
    }
}

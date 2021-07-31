package Inheritance;

public class Child extends Person {
    Person parent1, parent2;
    public Child(){
        super();
        parent1 = new Person();
        parent2 = new Person();
    }
    public Child(String first, String middle, String last, String age, String gender, Parent a, Parent b){
        super(first,middle,last,age,gender);
        setParent1(a);
        setParent2(b);
    }

    public Person getParent1() {
        return parent1;
    }

    public void setParent1(Person a) {
        this.parent1 = a;
    }

    public Person getParent2() {
        return parent2;
    }

    public void setParent2(Person b) {
        this.parent2 = b;
    }
    private String fullName(Person a){
        return a.getfirstName() + " " + a.getlastName();
    }
    @Override
    public String toString() {
        return "\nChild " + recordNumber + "\n--------------------" +
               "\nName: "  + getfirstName() + " " + getlastName() +
               "\nAge : "  + getAge() +
               "\nParents: " + getParent1().getfirstName() + " and " + getParent2().getfirstName();
    }
}

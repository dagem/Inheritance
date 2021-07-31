package Inheritance;

public class Person {
    String firstName, middleName, lastName, age, gender;
    static int recordNumber;
    public Person(){
        this.firstName = "";
        this.middleName = "";
        this.lastName = "";
        this.age = "";
        this.gender = "";
        ++recordNumber;
    }
    public Person(String first, String middle, String last, String age,String gender){
        setfirstName(first);
        setMiddleName(middle);
        setlastName(last);
        setAge(age);
        setGender(gender);
    }
    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = nullChecker(firstName);
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        if(middleName.equals(null) || middleName.equals(" ")){
            this.middleName = "";
        }
        else{
            this.middleName = middleName;
        }
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = nullChecker(lastName);
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = nullChecker(age);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = nullChecker(gender);
    }

    public String nullChecker(String input){
        if(input.equals(null)){
            throw new IllegalArgumentException("input cannot be null");
        }
        return input;
    }
    @Override
    public String toString() {
        return "Parent \n " + "------------------------" + "\n" +
               "Name: " + getfirstName() + " " + getlastName() + "\n" +
               "Age: "  + getAge() + "\n";
    }
}

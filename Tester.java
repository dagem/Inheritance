package Inheritance;

public class Tester extends Child{
    private boolean sameParents(Child a, Child b){
        return a.getParent1() == b.getParent2() || a.getParent2() == b.getParent1();
    }
    private boolean sameAge(Child a, Child b){
        return a.getAge() == b.getAge();
    }
    private boolean sameFirstName(Child a, Child b){
        return a.getfirstName() == b.getfirstName();
    }
    private boolean sameLastName(Child a, Child b){
        return a.getlastName() == b.getlastName();
    }
    private boolean areTwins(Child a, Child b) {
        return sameParents(a,b) && sameAge(a,b);
    }
    private boolean samePerson(Child a, Child b){
        return areTwins(a,b) && sameFirstName(a,b);
    }
    private boolean singleParent(Child a){return a.getParent1() == null && a.getParent2() != null || a.getParent1() != null && a.getParent2() == null;}
    private boolean isOrphan(Child a){return a.getParent1() == null && a.getParent2() == null;}

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Tester newTest = new Tester();
        Parent Tom = new Parent("Tom", "", "Sawyer", "36", "Male");
        Parent Martha = new Parent("Martha", "Maiden", "Sawyer", "32", "Female");
        Child Lucas = new Child("Lucas","", "Sawyer","22","Male",Tom,Martha);
        Child Tobias = new Child("Tobias","", "Sawyer","22","Male",Tom,Martha);
        Child Tomas = new Child("Tomas", "", "Twist", "10", "Male", Martha);
        Child Oliver = new Child("Tomas", "", "Twist", "10", "Male");
        System.out.println("Are they related? " + newTest.sameParents(Lucas,Tobias) + "\nAre they the same age? " + newTest.sameAge(Tobias,Lucas)
                + "\nDo they have the same last name? " + newTest.sameLastName(Lucas,Tobias)
                + "\nAre they twins? " + newTest.areTwins(Lucas,Tobias));
        System.out.println(Tobias.toString());
        System.out.println(Lucas.toString());
        System.out.println("\nSame person test: " + newTest.samePerson(Lucas,Tobias));
        System.out.println("\nSingle parent test: " + newTest.singleParent(Tomas));
        System.out.println("\nOrphan test (Oliver): " + newTest.isOrphan(Oliver));
        System.out.println("\nOrphan test (Lucas): " + newTest.isOrphan(Lucas));

    }
}

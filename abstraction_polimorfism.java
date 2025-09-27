// ENCAPSULATION 
// INHERITENCE
// ABSTRACTION
public class abstraction_polimorfism {
    public static void main(String args[]){
        
        // it is a global variable
        // int i = 0;
        Student s1 = new Student();
        System.out.println(s1.give_roll());
        System.out.println(s1.give_name());
    }
    
}

class Student{
    // these are encapsulation and can only be accessed in this class only 
    private int roll_no;
    private String Name;
    int give_roll(){
        return roll_no;
    }
     String give_name(){
        return Name;
    }
}
// we inherit student class in teacher class now all the things of students are accessible to teacher class

class teacher extends Student{
    void talk(){
        System.out.println("this is the methods from teacher of ");
    }
}
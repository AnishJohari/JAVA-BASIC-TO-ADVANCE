// ENCAPSULATION 
// INHERITENCE

import java.util.Scanner;
public class abstraction_polimorfism {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        // it is a global variable
        // int i = 0;
        input.close();
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

class teacher extends Student{
    void talk(){
        System.out.println("this is the methods from teacher of ");
    }
}
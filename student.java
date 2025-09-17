public class student {
    public static void main(String[] args) {
       Student_data s1 = new Student_data();
       s1.setname("Anish");
       s1.setroll(077);
       System.out.println(s1.name());
       System.out.println(s1.roll_no());
    }
}

class Student_data{
    private int roll_number;
    private String name;
    public void setroll(int roll_number){
        this.roll_number=roll_number;
    }
    public void setname(String name){
        this.name=name;
    }
    public int roll_no(){
        return roll_number;

    }
    public String name(){
        return name;
    }
}

class teachers extends Student_data{
    private int salary;
    private String location;

}
class c{}
// multiple inheritence
public Student_data extends teachers impliments c {

    
}
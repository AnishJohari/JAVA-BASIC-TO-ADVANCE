public class non_primitive_datatype {
    public static void main(String args[]){
        //NON PRIMITIVE DATA TYPE
        /*
         * String 
         * Array
         * 
         */
        //Always use new keyword while working with non primitive datatype

        String name=new String("Aman and Shalu");
        
        String name2=new String("are good friends");
        
        System.out.println("ORIGINAL STRING IS : "+name);
        
        // for length
        
        System.out.println("Length of the string is : "+name.length());
        
        //concatination
        
        System.out.println("concatination of strings and result are : "+name+" "+name2);
        
        //charat finds character at given position
        
        System.out.println("the character present at 0 index is : "+ name.charAt(0));   
        
        //replace will help in replacing given element to new one
        
        System.out.println("the replaced element string is : "+ name.replace('a','b'));     
        
        //substring will let u get a small string from the original one
        
        System.out.println("the substring of original strong is : " +name.substring(0,3));

    }   
}

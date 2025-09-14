public class string_output {
    public static void main(String args[]){

        String str1="    java is awesome";
        // String str2="prgramming";
        // System.out.println(str1.concat(str2));


        // System.out.print("THE HASH CODE IS : ");
        // System.out.print(str1.hashCode());
        // System.out.println();

        // System.out.print("THE HASH CODE IS : ");
        // System.out.print(str1.compareToIgnoreCase(str1));
        // System.out.println();

        // System.out.print("THE LEGTN IS : ");
        // System.out.print(str1.length());
        // System.out.println();
        
        // System.out.print("AFTER TRIM THE STRING IS : ");
        // System.out.print(str1.trim());
        // System.out.println();
        
        // System.out.print("AFTER COMPARISON THE ANSWER IS : ");        
        // System.out.print(str1.compareTo(str2));
        // System.out.println();
        
        // System.out.print("AFTER USING equals THE OUTPUT IS : ");        
        // System.out.print(str1.equals(str2));
        // System.out.println();
        
        // System.out.print("THE SUBSTRING IS : ");        
        // System.out.print(str2.substring(2,4));
        // String s= str1.join(str1+"-","welcome"+" to");
        // System.out.println(s);
        System.out.println(str1.replaceAll("java","Python"));
        System.out.println(str1.lastIndexOf("java"));
    }
}

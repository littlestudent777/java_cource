import java.util.ArrayList;
import java.util.StringJoiner;
 
public class Task2 {
    public static void main(String[] args) {
        // Creating an empty ArrayList of string type
        ArrayList<String> al = new ArrayList<>();
 
        // Adding elements to above List
        al.add("Ram");
        al.add("Shyam");
        al.add("Alice");
        al.add("Bob");
 
        StringJoiner sj1 = new StringJoiner(",");
 
        // Using setEmptyValue() method
        sj1.setEmptyValue("sj1 is empty");
        System.out.println(sj1); //sj1 is empty
 
        // Using add() method
        sj1.add(al.get(0)).add(al.get(1));
        System.out.println(sj1); //Ram,Shyam
 
        // Using length() method
        System.out.println("Length of sj1 : " + sj1.length()); // Length of sj1 : 9
 
        StringJoiner sj2 = new StringJoiner(":");
        sj2.add(al.get(2)).add(al.get(3));
 
        // Using merge() method
        sj1.merge(sj2);
 
        // Using toString() method
        System.out.println(sj1.toString());  // Ram,Shyam,Alice:Bob
 
        System.out.println("Length of new sj1 : " + sj1.length()); // Length of new sj1 : 19
    }
}

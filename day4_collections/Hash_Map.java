
import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args){
        HashMap<Integer,String> student= new HashMap<>();
    student.put(12,"Mayank");
    student.put(22,"Arush");
    student.put(32,"Saket");
    student.put(42,"Atul");
    student.put(62,"Nikhil");
    System.out.println(student.get(12));
    student.remove(22);
    System.out.println(student);
    }


}

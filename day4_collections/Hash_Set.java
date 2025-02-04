import java.util.HashSet;

public class Hash_Set {
public static void main(String[]args){
    HashSet<String> city=new HashSet<String>();
    city.add("Kolkata");
       city.add("Hyderabad");
       city.add("Pune");
       city.add("Pune");
       city.add("Noida");
       System.out.println(city);
       String key="Noida";
       if(city.contains(key)){
        System.out.println("Key City exists in the set");
       }

       city.remove("Pune");
       System.out.println(city);

   }
   

}

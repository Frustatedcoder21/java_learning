
import java.util.ArrayList;

class Array_List{
    public static void main(String[] args){
        ArrayList<Integer>arr=new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);
        arr.remove(2);
        arr.set(1, 8);
        for(Integer a:arr){
            System.out.println(a);
        }
    }
}
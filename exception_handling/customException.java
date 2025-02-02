import java.util.Scanner;
class abc{

 public static void main (String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter age");
    try{
  int age=sc.nextInt();
  if(age>50){
    throw new MyException("age out of requirement");
  }
    }catch(Exception e){
     System.out.println(e);
    }
 }
}
class MyException extends Exception{
    MyException(String s){
      super(s);
    }
}
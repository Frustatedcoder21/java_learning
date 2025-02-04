class abc{

    public static void main (String[] args){
        int a[]=null;
        try{
        System.out.println(a[0]);
        }catch(Exception e){
            System.out.println("Null value is present");
        }finally{
            System.out.println("Hello World !!");
        }
    }
}
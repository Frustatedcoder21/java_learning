class abc{

    public static void main (String[] args){
        int [] a={1,2,3};
        try{
        System.out.println(a[4]);
        }catch(Exception e){
            System.out.println("accessing out of bound value");
        }finally{
            System.out.println("Hello World !!");
        }
    }
}
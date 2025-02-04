
class item{
String title;
String author;
int publication_year;
    
}
class book extends item{
String genre;
void showBookDetails(){
    System.out.println(title+"|"+author+"|"+publication_year+"|"+genre);
}
}
class magazine extends item{
String issue_no;
void showMagDetails(){
    System.out.println(title+"|"+author+"|"+publication_year+"|"+issue_no);
}
}
class abc{
    public static void main(String[]args){
        book b1=new book();
        b1.title="Hello Java!";
        b1.author="Mayank Pandey";
        b1.publication_year=2001;
        b1.genre="science";
        b1.showBookDetails();
        magazine m1=new magazine();
        m1.title="Meet new sensation";
        m1.author="Mayank Pandey";
        m1.publication_year=2001;
        m1.issue_no="i1245";
        m1.showMagDetails();
    }

}
class Passport{
    int passport no;
    String nationality;
    Passport(int passport no, String nationality){
        this.passport no=passport no;
        this.nationality=nationality;
    }
}
class Person{
    int person id;
    String name;
    Passport pass;
    Person(int person id, String name, Passport pass){
        this.person id=person id;
        this.name=name;
        this.pass=p;
    }
}
public class ManyToMany{
    public static void main(String[] args){
        Passport p=new Passport(12345, "Indian");
        Passport m=new Person(1, "suprith", p);
        System.out.println(m.pass.passport no);
        System.out.println(m.pass.nationality);
        
    }
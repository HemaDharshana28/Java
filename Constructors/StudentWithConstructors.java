class student{
    int id;
    String name;
    int age;
    student(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
public class StudentWithConstructors{
    public static void main(String[] args){
        student s=new student(21,"Hema",20);
        s.display();
    }
}
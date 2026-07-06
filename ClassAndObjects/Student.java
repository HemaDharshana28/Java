class studentData {
        int id;
        String name;
        int age;
    }
    
public class Student {
    public static void main(String[] args){
        studentData s1=new studentData();
        studentData s2=new studentData();
        studentData s3=new studentData();
        studentData s4=new studentData();
        studentData s5=new studentData();
        s1.id=1;
        s1.name="Hema";
        s1.age=20;
        s2.id=2;
        s2.name="Dharshana";
        s2.age=21;
        s3.id=3;
        s3.name="Priya";
        s3.age=22;
        s4.id=4;
        s4.name="Karthik";
        s4.age=23;
        s5.id=5;
        s5.name="Swetha";
        s5.age=24;
        System.out.println(s1.id+" "+s1.name+" "+s1.age);
        System.out.println(s2.id+" "+s2.name+" "+s2.age);
        System.out.println(s3.id+" "+s3.name+" "+s3.age);
        System.out.println(s4.id+" "+s4.name+" "+s4.age);
        System.out.println(s5.id+" "+s5.name+" "+s5.age);
    }
}
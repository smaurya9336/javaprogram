public class Inheritance {
    public static void main(String[] args) {
        Student s1=new Student("Yash",22,34);
        System.out.println(s1.numberOfStudent);
        Student s2=new Student("Sachin", 22, 23);
        System.out.println(s2.numberOfStudent);
        System.out.println(s1.name+" "+s1.age +" " + s1.rno);
        Student s3=new Student("Sachin", 22, 23);
        System.out.println(s3.numberOfStudent);
    //    System.out.println(Student.numberOfStudent);
    }
}

class Person{
    String name;
    int age;
}
class Student extends Person{
    int rno;
  static int numberOfStudent;
    Student(String name, int age,int rno){
        this.name=name;
        this.age=age;
        this.rno=rno;
        numberOfStudent++;
    }
}

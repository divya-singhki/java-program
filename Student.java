public class Student {
    int id;
    String name;
    int age;
    Student(int i,String n,int age){
id=i;
name=n;
this.age=age;
    }
    void display(){
        System.out.println("id="+id+" name="+name+" age="+age);
    }
    public static void main(String args[]){
Student s1=new Student(1,"divya",18);
Student s2=new Student(2,"shrestha",19);
//System.out.println(s1.id+" "+s1.name); 
//System.out.println(s2.id+" "+s2.name);
s1.display();
s2.display();
    }
}  
 

public class Main extends Object{
    public static void main(String[] args) {
         Student max=new Student("nikhil",22);
         System.out.println(max.toString());
         PrimarySchool p=new PrimarySchool("Nithin",20,"narayana");
         System.out.println(p);
    }

}
class Student
{
   private String name;
   private int age;
   Student(String name,int age)
   {
     this.name=name;
     this.age=age;
   }
//

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class PrimarySchool extends Student
{
    private String ParentName;
    PrimarySchool(String name,int age,String ParentName)
    {
        super(name,age);
        this.ParentName=ParentName;
    }

    @Override
    public String toString() {
        return ParentName+" is the father "+super.toString();
    }
}

class Student{
    int id;
    String name;
    String email;
    Student(int id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
    void getStudentDetail(){
        System.out.println("Student Details : ");
        System.out.println("ID: "+id+" Name: "+name+" E-Mail ID: "+email);
    }
}
class Teacher{
    int id;
    String name;
    String email;
    String Occupation;
    Teacher(int id,String name,String email,String Occupation){
        this.id=id;
        this.name=name;
        this.email=email;
        this.Occupation=Occupation;
    }
    void getTeacherDetail(){
        System.out.println("Teacher Details : ");
        System.out.println("ID: "+id+" Name: "+name+" E-Mail ID: "+email+" Occupation :"+Occupation);
    }
}
public class MultipleClass{
    public static void main(String args[]){
        Student[] student={
            new Student(1,"John Cena","johncena1@gmail.com")
        };
        Teacher[] teacher={
            new Teacher(1,"Mohan Singh","mohansingh1@gmail.com","Phd CSE")
        };
        for(Student s:student) s.getStudentDetail();
        for(Teacher s:teacher) s.getTeacherDetail();

    }
}
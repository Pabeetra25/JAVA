package np.edu.asc.classnobject;

public class Student {
    int id;
    String name;
    int classLevel;
    String college;

public Student(){
    System.out.println("a student is created");
}

    public Student(int id,String name,int classLevel,String college) {
        //when both class variable/property and method/constructor have same variable with same datatype
        //then first priority goes to the variable inside method scope or its arguments/parameters
        this.id = id;
        this.name = name;
        this.classLevel=classLevel;
        this.college=college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classLevel=" + classLevel +
                ", college='" + college + '\'' +
                '}';
    }

    public static void main(String[] args) {

            Student ram=new Student(1,"Ram",7,"Arjun Boarding");
            Student sham=new Student(2,"Sham",5,"Siddhababa");
        System.out.println(ram);
        System.out.println(sham);
    }
}

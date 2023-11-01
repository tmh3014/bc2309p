public class StudentA extends Person { // child class
    
    // private String name;

    // private int age;

    private String studentID;

    public StudentA() {
        
    }

    // All-args constructor
    public StudentA(String studentID) {
        super(); // calling parent class constructor
        this.studentID = studentID;
    }

    public StudentA(String name, int age, String studentID) {
        super(name, age);
        this.studentID = studentID;
        
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public static void main(String[] args) {
        StudentA student = new StudentA();
        student.setAge(20);
        student.setName("John");

        Person person = new Person();
        person.setAge(40);
        person.setName("Mary");

        StudentA student2 = new StudentA("John", 12, "1234");
        System.out.println(student2.getAge());
        System.out.println(student2.getName());
        System.out.println(student2.getStudentID());
        
        System.out.println(Person.x); // hello (best way to call)
        // System.out.println(Student.x); // hello
        // System.out.println(student2.x); // hello //但不應該用object取class資料

        System.out.println(Person.getY()); // 10 (best way)
        // System.out.println(Student.getY()); // 10
        System.out.println(person.getY()); // 10
        System.out.println(student2.getY()); // 10

        System.out.println(student2.s); // 0
    }

   
    }



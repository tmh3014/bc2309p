public class Teacher extends Person { // child class
    
    // private String name;

    // private int age;

    public String toString() {
        return "name=" + super.getName() + " " + ", age=" + super.getAge();
    }
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setAge(10);
        teacher.setName("Peter");
        System.out.println(teacher.toString());

        System.out.println(teacher.getAge());
        System.out.println(teacher.getName());
    }

   
}

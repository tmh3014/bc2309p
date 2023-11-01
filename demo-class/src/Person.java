public class Person {
    
    int age;

    char gender; // 'M' or 'F'

    String firstName;

    String lastName;

    int hkid;

    public Person() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isElderly() {
        if (this.age > 65) 
            return true;
            return false;

    public boolean isMale() {
        if (this.gender == "M")
        return true;
        return false;
    }



    public String fullName() {
        return this.fullName + " " + this.lastName;
    }
        
    }
    public static void main(String[] args) {
    Person person = new Person();
    person.setAge(66);
    System.out.println(person.isElderly()); // false
    person.setGender('F');
    
    if (person.isElderly() && !person.isMale()) {
        System.out.println("this is female elderly");
    }
}

    public void setName(String string) {
    }
}

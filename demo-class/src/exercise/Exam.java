package exercise;

// Summary (5-Oct)
// - static variable
// - default empty constructor
// - static method can call static variable
// - instance method can call static variable
// - can static method call instance variable?? why??
// - instance method can call instance variable (getter, setter)
// - what is meaning of "no setter" ?
// - what is private ?
// - use "final"

public class Exam {
    
    // Access Modifier: public, private, protected, package-private (default)
    // public -> class, attribute, method, constructor
    // private -> attribute, method, constructor
    // protected -> attribute, method
    // package-private -> class, attribute, method, constructor
    private Subject[] subjects;

    private static int size = 0;

    private static final int noOfDayOfAWeek = 7; // Camel Case


    public Exam(Subject subjects) {
        this.subjects = new Subject[100];
        this.subjects[0] = subject;
        size++; // constructor can change the static variable
       //  noOfDayOfAWeek = 8; can't change the value in run time anymore
    }

    public static int getNoOfDayOfAWeek() {
        return noOfDayOfAWeek;
    }

    public boolean delete(Subject subject) {
        for (int i = 0; i < this.subjects.length; i++) {
            if (this.subjects[i] != null
                && this.subjects[i].getDescription()
                    .equals(subject.getDescription())) {
                this.subjects[i] = null;
                size--;
                return true;
                    }
        }
        return false;
    }

    public void add(Subject subject) {
        for (int i = 0; i < this.subjects.length; i++) {
            if (this.subjects[i] != null) {
                this.subjects[i] = subject;
                size++; // instance method can change the static variable
                return;
            }
        }
        System.out.println("end of add()");
    }

    // Use a static variable to replace the function of size()

    public int size() {
        int count = 0;
        for (int i = 0; i < this.subjects.length; i++) {
            if (this.subjects[i] != null)
            count++;
        }
        return count;
    }

    public double average() {
        int sum = 0;
        for (int i = 0; i < this.subjects.length; i++) {
            if (this.subjects[i] != null)
            sum += this.subjects[i].getScore();
        }
        return (double) sum / this.size(); // int / int -> int, double / int -> double
    }
    public static int getSize() {
        return size;

        public static void main(String[] args) {
            Subject subject = new Subject("ABC", 89);

        }
    }
}

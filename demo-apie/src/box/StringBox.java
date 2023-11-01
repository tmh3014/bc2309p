package box;

public class StringBox { // Encapsulation

    private char[] arr;

    // constructor
    public static StringBox valueOf(String s) {
        return new StringBox(s);

    }



    private StringBox (String s) {
        // or this.arr = s.toCharArray();
        this.arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            this.arr[i] = s.charAt(i);
        }
    }

    public StringBox append(String s) {
        // array size is fixed: s.length()
        // new a new char array
        int pos = 0;
        char[] newArr = new char[this.arr.length + s.length()];
        for (int i = 0; i < this.arr.length; i++) {
            newArr[i] = arr[i];
            pos = i;
        }
        // s -> newArr
        for(int i = 0; i < s.length(); i++) {
            newArr[++pos] =  s.charAt(i);
        }
        // this.arr (object reference -> char[] "sample")
        // newArr (object reference -> char[] "samplesample")
        this.arr = newArr; // 
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(this.arr);
    }

    public StringBox substring(int fromIndex, int toIndex) {
        // String str = "";
        StringBuilder str = new StringBuilder("");
        for (int i = fromIndex; i < toIndex; i++) {
            str.append(this.arr[i]);
        }
        // str (StringBuilder) -> StringBox
        return new StringBox(str.toString());
    }
    
    public int length() {
        return this.arr.length;
    }

    public char charAt(int index) {
        return this.arr[index];
    }

    public static void main(String[] args) {
        StringBox stringBox = new StringBox("sample");
        System.out.println(stringBox.length()); // 6
        System.out.println(stringBox.charAt(2)); // m
        System.out.println(stringBox.substring(1, 3).toString());
        System.out.println(stringBox.append("sample").toString()); // samplesample

        StringBox stringBox2 = StringBox.valueOf("hello world");
        StringBox stringBox3 = stringBox2.substring(2, 4);
        stringBox3.append("!!!!!");
        System.out.println(stringBox3.toString());
        System.out.println(stringBox2.toString());

        // System.out.println(StringBox.valueOf("hello world").substring(2, 4)
        //   .append("!!!!!").toString());
    }
    
}

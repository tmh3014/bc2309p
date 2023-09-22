public class test {
    public static void main (String[] args) {
        int x = 3;
        int result = (x++ + 3) * ++x;
        System.out.println(result);
    }
}

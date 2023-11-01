import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleTest {
    public static void main(String[] args) {
        double d1 = 0.1;
        double d2 = 0.2;
        System.out.println(d1 + d2);
        System.out.println(0.3 - 0.1);

        // BigDecimal bd = new BigDecimal("0.3"); // bd -> object reference, new ... -> object
        // BigDecimal bd2 = new BigDecimal("0.1"); // 要用string -> 加“ ”
        BigDecimal bd = new BigDecimal(String.valueOf(0.3));
        BigDecimal bd2 = new BigDecimal(String.valueOf(0.1));
        BigDecimal result = bd.subtract(bd2);
        System.out.println(result.doubleValue());
        BigDecimal result2 = bd.add(bd2);
        System.out.println(result2);
        BigDecimal result3 = bd.multiply(bd2);
        System.out.println(result3);
        BigDecimal result4 = bd.divide(bd2);
        System.out.println(result4);
        int comparison = bd.compareTo(bd2);
        if(comparison > 0) {
            System.out.println("bd is greater than bd2.");
        } else if(comparison < 0) {
            System.out.println("bd is smaller than bd2.");
        } else {
            System.out.println("bd is same as bd2.");
        }
        
        System.out.println(BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1))); //this way no need to convert to String first
        
        // choose anyone to use: new or valueOf()
        BigDecimal bd5 = BigDecimal.valueOf(10.45678).setScale(3, RoundingMode.DOWN);
        System.out.println(bd5);
        BigDecimal bd6 = bd5.multiply(BigDecimal.valueOf(2)).setScale(2, RoundingMode.UP);
        System.out.println(bd6);

        if(bd5.equals(bd6)) {
            System.out.println("bd5 equal to bd6");
        } else {
            System.out.println("bd5 is not equal to bd6");
        }
    
    }
}

public class Testloop {
    public static void main (String [] args) {
        int x =2;
        x *= 2;
        x *= 2;
        x *= 2;
        x *= 2;
        x *= 2;
        x *= 2;
        x *= 2;
        System.out.println(x); // 256
        
        // loop -> for loop, while loop, do-while loop
        x = 2;
        // for ( 第一part counter; continue criteria; update)
        // Step 1: int i = 0 ;
        // Step 2: check if i < 7;
        // Step 3: x = x * 2;
        // Step 4: i++; -> i become 1;
        // Step 5: check if i < 7;
        // Step 6: x = x * 2;
        // Step 7: i++; i become 2;
        // ...
        // Step n: i++; i become 6;
        // Step n+1: check if i < 7;
        // Step n+2: x = x * 2;
        // Step n+3: i++; -> become 7;
        // Step n+4: check if i < 7 -> false -> exit loop
        for (int i = 0; i < 7; i++) { //想數7次，每次x加1，所以寫7，因為由零開始  // check i -> 行 x = x * 2 -> 行i++ -> check下一次
            x = x * 2;
            System.out.println(x); // print 7次
        }
        System.out.println(x); // 256
    }
}

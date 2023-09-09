public class TestNestedLoop {
    public static void main (String [] args) {
        for (int i = 0; i < 5; i++) { // i
            // i = 0
            for (int j = 0; j < 5; j++)  { // j
            // when i = 0,
            // Enter Another Loop ( J counter)
            // i = 0, j = 0, print i -> 0
            // j++
            // i = 0, j = 1, print i -> 0
            // j++
            // ...
            // i = 0, j = 4, print i -> 0



                System.out.println("i=" + i + ", j=" + j);
            } // j
        
        } // i
        // i -> 1-10
        // j -> 11-20
        // print the statement, when i & j are both even number
        // One more condition: j < 15
        for (int i = 1; i <= 10; i++) { // outer loop
            for (int j = 11; j <= 20; j++) { // inner loop
                if (j >= 15) {
                    break; // break the inner loop
                }
                if (i % 2 == 0 && j % 2 == 0) {
                System.out.println("i=" + i + ", j=" + j);
                } 
            }
        }
        // Approach 2:
        for (int i = 1; i <= 10; i++) {
            for (int j = 11; j <= 20; j++) {
         if ( j < 15 && i % 2 == 0 && j % 2 == 0) { // 較嚴謹的條件放前面，可以更早離開
                System.out.println("i=" + i + ", j=" + j);
    }
}
        }
    }
}

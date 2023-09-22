/**
 * 
 * When target = 'c', the expected output:
 * We found 3 character c in the String.
 * 
 * When target = 'z', the expected output:
 * Not Found.
 */
// Count the target of character in a String.
public class JavaQuest5 {
  public static void main(String[] args) {
    String str = "Welcome to the coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic
    int count = 0;
    
    // Use a loop to count the target of character in a String.
    // code here
    for (int i = 0; i < str.length(); i++) {
      
      if (target == str.charAt(i)) {
        count++;
      }
      } 
      if (count != 0) {
        System.out.println("We found " + count + " character "+ target + " in the String." );
      } else if (count == 0) {
        System.out.println("Not found.");
      }
  
    // if found, print "We found 3 character c in the String."
    // if not found, print "Not Found."
    // code here
    
  }

  
  }


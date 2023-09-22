import java.util.Scanner;

public class JavaQuest3 {
  /**
   * Expected Output of Examples:
   * 
   * Input a month number: 2
   * Input a year: 2016
   * February 2016 has 29 days
   * 
   * Input a month number: 12
   * Input a year: 2014
   * December 2014 has 31 days
   */
  // Program to print the number of days that the month of a year has.

  public static void main(String[] strings) {

    Scanner input = new Scanner(System.in);
    
    int number_Of_DaysInMonth = 0;
    String MonthOfName = "Unknown";

    System.out.print("Input a month number: ");
    int month = input.nextInt();

    System.out.print("Input a year: ");
    int year = input.nextInt();
    input.close();
    
    // Complete the switch statement
    switch (month) {
        case 1:
        MonthOfName = "January"; {
          System.out.println(number_Of_DaysInMonth = 31);
        }
        case 2:
        MonthOfName = "February";
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
          System.out.println(number_Of_DaysInMonth = 29);
        } else {
            System.out.println(number_Of_DaysInMonth = 28);
          }
        
        break;
        case 3:
        MonthOfName = "March"; {
          System.out.println(number_Of_DaysInMonth = 31);
        }
        break;
        case 4:
        MonthOfName = "April"; {
          System.out.println(number_Of_DaysInMonth = 30);
        }
        break;
        case 5:
        MonthOfName = "May"; {
          System.out.println(number_Of_DaysInMonth = 31);
        }
        break;
        case 6:
        MonthOfName = "June"; {
          System.out.println(number_Of_DaysInMonth = 30);
        }
        break;
        case 7:
        MonthOfName = "July"; {
          System.out.println(number_Of_DaysInMonth = 31);
        }
        break;
        case 8:
        MonthOfName = "August"; {
          System.out.println(number_Of_DaysInMonth = 31);
        }
        break;
        case 9:
        MonthOfName = "September"; {
          System.out.println(number_Of_DaysInMonth = 30);
        }
        break;
        case 10:
        MonthOfName = "October"; {
          System.out.println(number_Of_DaysInMonth = 31);
        }
        break;
        case 11:
        MonthOfName = "November"; {
          System.out.println(number_Of_DaysInMonth = 30);
        }
        break;
        case 12:
        MonthOfName = "December"; {
          System.out.println(number_Of_DaysInMonth = 31);
        }
        break;
        // Leap Year -> 29 days in February, otherwise 28.
        // Definition: If a year is divisible by 4 and not divisible by 100, 
        // but include the year divisible by 400.

        // Complete the other months
    }

    
    System.out.println(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days");

    
  }
}


<<<<<<< HEAD
/** Class that determines whether or not a year is a leap year.*
<<<<<<< HEAD
 *  @author Dali Wang *
=======
 *  @author Dali Wang *
>>>>>>> c803a12c7c638820f74607f7c5fe5e2f0fb9d9c1
 */
public class LeapYear {

    /** determin if the given year is a leap year
    * @param year to be analyzed
     */
    public static boolean isLeapYear(int year){
        rerturn (year % 400 == 0 ) || (year % 4 == 0 && year % 100 != 0)
    }
    
    
    /**Calls isLeapYear to print correct statement.
=======
/** Class that determines whether or not a year is a leap year.
 *  @author YOUR NAME HERE **
 */
public class LeapYear {

    /** Calls isLeapYear to print correct statement.
>>>>>>> 2abf6beddc5a8c13cf343e0e4385acae7a290a8c
     *  @param  year to be analyzed*
     */
    private static void checkLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.printf("%d is a leap year.\n", year);
        } else {
            System.out.printf("%d is not a leap year.\n", year);
        }
    }

    /** Must be provided an integer as a command line argument ARGS. */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter command line arguments.");
            System.out.println("e.g. java Year 2000");
        }
        for (int i = 0; i < args.length; i++) {
            try {
                int year = Integer.parseInt(args[i]);
                checkLeapYear(year);
            } catch (NumberFormatException e) {
                System.out.printf("%s is not a valid number.\n", args[i]);
            }
        }
    }
}


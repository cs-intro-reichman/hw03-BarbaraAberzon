/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		for (int month = 1 ; month <= 12 ; month++ ){
		System.out.println("Month " + month + " has " + nDaysInMonth(month, year) + " days"); 
		}		
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
		boolean leapYear = true ;
	    leapYear = (year%400 == 0) ;
		leapYear = leapYear || (((year%4) == 0) && ((year%100) !=0)) ;
		return leapYear;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) {
		int days = 0 ;
	 if ( month == 4 || month == 6 || month == 9 || month == 11 ){
		days = 30 ; 
	 }
	 else if (month == 2 && isLeapYear(year) == false){
		days = 28 ;
	 }
	 else if (month == 2 && isLeapYear(year) == true){
		days = 29 ;
	 }
	 else {
		 days = 31 ; 
	 }
			return days;
	}
	
}


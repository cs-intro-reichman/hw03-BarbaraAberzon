/** 
 * Prints the calendar of given year.
 */
public class Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January

	
	/** 
	 * caunt the calendars of all the years from 1990 till the given year
     * print it only in the given year 	 
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0;
		int y = Integer.parseInt(args[0]); // getting year from user
	 	while ( year < y ) {
				advance();
				debugDaysCounter++;
		}
		
		while ( year == y ) {
				System.out.print(dayOfMonth + "/" + month + "/" + year );
				if (dayOfWeek == 1 ) {
					System.out.print( " Sunday" );
					}
				System.out.println();
				advance();
				debugDaysCounter++;
		}
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		 if (dayOfMonth < nDaysInMonth(month,year)){
			 dayOfMonth++ ;
		 }
		 else {
			  dayOfMonth = 1 ;
			  if (month < 12 ) {
				  month ++ ; 
			  }
			  else {
				  month = 1 ;
				  year ++ ;
			  }
		 }
	
		 dayOfWeek++ ;
			 if ( dayOfWeek == 8 ){
				 dayOfWeek = 1 ;
			 }


	 }		 
	 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    boolean leapYear = true ;
	    leapYear = (year%400 == 0) ;
		leapYear = leapYear || (((year%4) == 0) && ((year%100) !=0)) ;
		return leapYear;
	}
	 
	// Returns the number of days in the given month and year.
	private static int nDaysInMonth(int month, int year) {
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

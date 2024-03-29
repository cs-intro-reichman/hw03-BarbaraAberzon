/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
		int length = s.length(); 
		char currentDigit ; 
		String sFinal = "" ;
		
        for (int i = 0 ; i < length ; i++){
			currentDigit = s.charAt(i);
			if (sFinal.indexOf(currentDigit) == -1 || currentDigit== ' ' ){
				sFinal = sFinal + currentDigit ;
			}
			else {
				sFinal = sFinal ; 
			}
		}
        return sFinal;
    }
}

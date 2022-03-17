package brocodemetodosprafrente;

public class Printf {

	public static void main(String[] args) {
		// printf() = an optional method to control, format, and display text to the console window
		// 			  two arguments = format string + (object/variable/ value)
		//			  % [flags] [precision] [width] [conversion-character]

		System.out.printf("This is a format string %d", 123);
		System.out.println();
		System.out.printf("%d This is a format string \n", 123);
		
		System.out.println("__________________________________________ \n");
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Davi";
		int myInt = 23;
		double myDouble = 1.83;
		
		System.out.printf("%b \n", myBoolean);
		System.out.printf("%c \n", myChar);
		System.out.printf("%s \n", myString);
		System.out.printf("%d \n", myInt);
		System.out.printf("%f \n", myDouble);
		
	}

}

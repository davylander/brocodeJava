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
		double myDouble = 1000.00;
		
		System.out.printf("%b \n", myBoolean);
		System.out.printf("%c \n", myChar);
		System.out.printf("%s \n", myString);
		System.out.printf("%d \n", myInt);
		System.out.printf("%f \n", myDouble);
		
		System.out.println("_____________________WIDTH_____________________ \n");
		// [width]
		// minimum number of characters to be written as output
		System.out.printf("Hello %10s", myString);
		
		
		System.out.println("\n_____________________PRECISION_____________________ \n");
		// [precision]
		// sets number of digits of precision when outputting floating-point values
		System.out.printf("You have this much money %.2f", myDouble);
		
		System.out.println("\n_____________________FLAGS_____________________ \n");
		// [flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000
		
		System.out.printf("You have this much money %,f", myDouble);
		
	}

}

import FormatIO.*;


public class Ex1 {
   public static void main(String[] arg)
   {
	   //FOR FIRST NAME
	   System.err.println("Please enter your first name");
	   Console con = new Console();
	   String firstName = con.readLine();
	   System.out.println("Your first name is " + firstName);
	   
	   //FOR LAST NAME
	   System.out.println("Please enter your last name");
	   Console con2 = new Console();
	   String lastName = con2.readLine();
	   System.out.println("Your last name is " + lastName);
	   
	   //FOR FULL NAME
	   System.out.printf("Your full name is: ");
	   System.out.println(firstName + " " + lastName);
	  
   }
}

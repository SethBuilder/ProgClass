import FormatIO.*;

//how was this printed to console fout.println("radius = 7 metres ");

public class Ex3 {
   public static void main(String[] arg)
   {     
      
      FileOut fout = new FileOut("Lab2out.txt");
      fout.println("radius = 7 metres ");
      
      FileIn fin = new FileIn("..\\Lab2Ex2\\Lab2out.txt");
      String wholeString = fin.readLine();
      
      StringIn str = new StringIn(wholeString);
      
      String str1 = str.readWord();
      String str2 = str.readWord();
      Double doub = str.readDouble();
      
      
      Console con = new Console();
      
      con.print("The correct area is: " + Math.PI * doub * doub);
  
   }
}
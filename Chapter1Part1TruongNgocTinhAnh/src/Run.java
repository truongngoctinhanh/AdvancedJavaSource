import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Run {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		Task1SuperlativeEquation t = new Task1SuperlativeEquation();
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter a: ");
        try{
        int a = Integer.parseInt(input.readLine());
        System.out.println("Enter b: ");
        int b = Integer.parseInt(input.readLine());
        
        if(t.calculate() == 999999)
			System.out.println("The equation infinitely many root");
		else if (t.calculate() == -999999)
			System.out.println("The equation has no root");
		else
			System.out.println("The equation has 1 root x = " + t.calculate());

        }catch(IOException | NumberFormatException | ArithmeticException ex){
        	System.out.println("Error: " + ex.getMessage());        	
        }
        
	}

}

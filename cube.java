import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class WorkAtTech
{
	public static void main (String[] args) throws 
		java.lang.Exception
	{
		// your code goes here
		Scanner scan  = new Scanner(System.in);
		int a = scan.nextInt();
		int surface_area = 6*(a*a);
	int 	volume = (a*a*a);
		System.out.print(surface_area + " "+volume);
	}
}

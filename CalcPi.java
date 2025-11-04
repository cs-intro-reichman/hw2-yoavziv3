// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    double pi = Math.PI;
		double total = 1;
		int number = Integer.parseInt(args[0]);
		Boolean flag = true;
		double j = 3;

		for(int i=0; i<number-1; i++)
		{
			if(flag == true)
			{
				total = total - (1/j);
				flag = false;
			}
			else			
			{
				total = total + (1/j);
				flag = true;
			}
			j= j + 2;
		}
		System.out.println("pi according to Java: " + pi);
		System.out.println("pi, approximated: " + total*4);
	}
}

// Demonstrates the Collatz conjecture.
public class Collatz {
	
	public static void col(int num, String letter)
	{
		int count = 1;

		if (letter.equals("v")) 
		{
			System.out.print(num + " ");
			if (num == 1)
			{
				num = num * 3 + 1;
				System.out.print(num + " ");
				count++;
			}
			while (num != 1)
			{
				if (num % 2 == 0)
				{
					num = num / 2;
					System.out.print(num + " ");
					count++;
				}
				else
				{
					num = num * 3 + 1;
					System.out.print(num + " ");
					count++;
				}
			}
			System.out.println("(" + count + ")");

		}
	}
	public static void main(String args[]) {
		int number = Integer.parseInt(args[0]);
		String type = args[1];
		for (int i=0; i<number; i++)
		{
			col(i+1, type);
		}
		System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");

	}
}

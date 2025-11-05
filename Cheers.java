public class Cheers {
        public static void main(String[] args) {
	String word = args[0];
        int num = Integer.parseInt(args[1]);
        word = word.toUpperCase();

        for(int i=0; i<word.length(); i++)
        {
                if(word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'F' || word.charAt(i) == 'H' || word.charAt(i) == 'I' || word.charAt(i) == 'L' || word.charAt(i) == 'M' || word.charAt(i) == 'N' || word.charAt(i) == 'O' || word.charAt(i) == 'R' || word.charAt(i) == 'S' || word.charAt(i) == 'X')
                {
                        System.out.println("Give me an " + word.charAt(i) + ": " + word.charAt(i) + "!");
                }
                else
                {
                        System.out.println("Give me a " + word.charAt(i) + ": " + word.charAt(i) + "!");

                }
        }
        System.out.println("What does that spell?");
        for(int i=0; i<num; i++)
        {
                System.out.println(word + "!!!");
        }
        }
}

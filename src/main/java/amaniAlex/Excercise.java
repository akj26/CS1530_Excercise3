/*This program is for excericse 3 of CS1530*/

package amaniAlex;
public class Excercise{
	public static void main(String[] args){
		//System.out.println("Please enter a integer");

		//Scanner userInput = new Scanner(System.in);
		

		if(args.length == 0 || args == null){
           		System.out.println("You need to enter a number on the cmd line for this to work");
           		System.exit(1);
           	}

        else{
			try{
	           // System.out.print("Enter an integer: ");

	           


	        	int triangle = triangle(Integer.parseInt(args[0]));
	        	int lazy = lazy(Integer.parseInt(args[0]));
	        	System.out.println("Tri(n) = " + triangle);
	         	System.out.println("Lazy(n) = " + lazy);

	        }
	        catch (NumberFormatException ex) {
	            System.out.println("So yeah,. (" +
	                    "Incorrect input: an integer is required).   Good Bye");
	            System.exit(1);
	            }
	    	}

        }

        public static int triangle(int number){
        //Triangle number calcualtion
         int triangle = (number*(number+1))/2;
         return triangle;

        }

        public static int lazy(int number){
       	//	Lazy number calculation 
         int lazy = ((number * number) + number + 2)/2;
         return lazy;

        }
}
package program;
//package JuniorInterview;

public class ProblemQuestion7 {

// Question 3a What kind of basic java functionality is this?
// Question 3b Find and correct the deliberate errors to print "Strawberry"
// Question 3c The following method has no option to print "Mint" flavour ice cream, please correct this. 
	
	public static void main (String[] Args){
		String iceCreamColour = "Mint";
		
		switch (iceCreamColour){
		case "brown":
			System.out.println("Chocolate");
			break;
		case "yellow":
			System.out.println("Vanilla");
			break;
		case "Pink":
			System.out.println("Strawberry");
			break;
		case "Mint":
			System.out.println("colour");
			break;

		}
		
	}
	
}

import java.util.Scanner;
public class whereToGo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String vacationType;
		int groupSize;
		String travSug = null;
		String goHere;
		
		
		System.out.println("What type of vacation are you looking for? Musical, tropical, or adventurous? ");
		vacationType = scan.nextLine();
		System.out.println("Thank you.");
		System.out.println("Now, how many people will be travelling? ");
		groupSize = scan.nextInt();
		System.out.println("Your input is greatly appreciated.");
		
		if (groupSize <= 0) {
			travSug = "frig off";
			System.out.println("Preposterous!");
			}	else if (groupSize <= 2) {
				travSug = "first class";
					}	else if (groupSize <= 5) {
						travSug = "helicopter";
						}	else if (groupSize >=6) {
							travSug = "charter flight, yo";
		}
		
		if (vacationType.contentEquals("musical")) {
			 goHere = "New Orleans, bro,";
			}	else if (vacationType.contentEquals("adventurous"))	{
				 goHere = "whitewater rafting in the Grand Canyon, dude,";	
				}	else if (vacationType.contentEquals("tropical")) {
					 goHere = "beach vacation in Mexico, bro,";
					}	else {
					     goHere = "somewhere boring, bruh,";
					}
		
		String result = "Okay, so I think the most big brain strat for a " + vacationType + " trip with " + groupSize + " bros would be: " + goHere +
				" by way of " + travSug + ".  Love you, bro.";
		System.out.println(result);
		
	
	}
	}

package learnJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegex {
	public static void main(String[] args) {

		// Regex (Regular Expressions) are a sequence of characters that forms a search
		// pattern;
		// We can use Regex to search for data in a text;
		// Regex can be a single character or a complicated pattern;
		// Regex belongs in the java.util package
		// Regex package has 3 classes: Pattern, Matcher and the PatternSyntaxException
		// The pattern class defines the class; The Matcher class is used for the
		// pattern; and The PatternSyntaxException indicates syntax erro

		// How do we create a regex and use
		
		//STEP 1: Let's first create a pattern using Pattern.compile method, and then save it as a pattern and give it a name of myPattern
		// The first parameter indicates which pattern is being searched for and 
		// the second parameter has a flag to indicates that the search should be case-insensitive. The second parameter is optional.

		Pattern myPattern = Pattern.compile("Hallelujah", Pattern.CASE_INSENSITIVE);
		
		//STEP 2: The matcher() method is used to search for a pattern in a string; so let's use that on our saved pattern 
		
		Matcher myMatcher = myPattern.matcher("Hallelujah, hallelujah, Hallelujah, hallelujah");
		
		//STEP 3: The find() method is used to find whether the pattern was found in the string or NOT. 

		boolean myResult = myMatcher.find();
		
		//STEP 4: Let's print out a "Match Found" message when the pattern is found, and "Match not found" if it is not found. 

		if (myResult) {
			System.out.println("Match Found");
		} else {
			System.out.println("Match not found");
		}

	}
}

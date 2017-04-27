
public class MagpiePt2
{
	/** Get a default greeting @return a greeting*/
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/** getResponse() method
	 * ===========================================
	 * 	Gives a response to a user statement
	 *  @param statement (the user statement)
	 * 	@return a response based on the rules given */
	public String getResponse(String statement)
	{
		
		String response = "";
		statement = statement.toLowerCase().trim();		
		if(statement.length() == 0) 
		{
			return "Say something, please.";
		}
		
		

		/** Exercise_01:
		 * ==================================================
		 * 	Code that asks the user "Say something, please."
		 * 	if you enter nothing, or if you accidentally hit
		 * 	enter. Think to yourself: "What is the length of
		 * 	an empty String?" */


		/** To be completed in Exercise_02:
		 * 	Modify the following code to use the findKeyword
		 * 	Method (details in "Exercise_02" below. */
		
		else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
	//error: forgot "else" part of else if  
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}

	else if (findKeyword(statement, "I want to", 0) >= 0)
	{
		response = transformIWantToStatement(statement);
	}
	else if (findKeyword(statement, "I want", 0) >= 0)
		{
			response = transformIWantStatement(statement);
		}

	
	else 
	{
		// Look for a two word (you <something> me)
		// pattern
		int psn = findKeyword(statement, "you", 0);


		if (psn >= 0
			&& findKeyword(statement, "me", psn) >= 0)
		{
			response = transformYouMeStatement(statement);
		}
		else
	{
				//  Part of student solution
				// Look for a two word (I <something> you)
				// pattern
				psn = findKeyword(statement, "i", 0);

				if (psn >= 0
						&& findKeyword(statement, "you", psn) >= 0)
				{
					response = transformIYouStatement(statement);
				}
		else
		{
			response = getRandomResponse();
		}
	 }
	}
	return response; 
}

/**
* Take a statement with "I want to <something>." and transform it into
* "What would it mean to <something>?"
* @param statement the user statement, assumed to contain "I want to"
* @return the transformed statement
*/
private String transformIWantToStatement(String statement)
{
	
  /**
   * trim the statement
   * variable lastChar = last character in statement
   * if lastChar is a period...
   *        remove the last character from statement
   *
   * Set new int psn to the result from...
   *        findKeyword() method @param statement, goal is "I want to "
   * Set new String restOfStatement to the rest of statement after the
   * "I want to ".
   * /
   * return "What would it mean to" + restOfStatement; **/
   statement = statement.trim();		
   string lastChar = statement.substring(statement.length() - 1);
   if(lastChar = ".")
   {
	   statement.substring(0, statement.length()-1);
	   //what I originally put: statement = statement.substring(statement.length) - lastChar;
   } 
   int psn = findKeyword(goal, "I want to", 0);
   String restOfStatement = statement.substring(psn + 9).trim();
		return "What would it mean to " + restOfStatement + "?";
}


/**
* Take a statement with "you <something> me" and transform it into
* "What makes you think that I <something> you?"
* @param statement the user statement, assumed to contain "you" followed by "me"
* @return the transformed statement
*/
private String transformYouMeStatement(String statement)
{
  /**
   * trim the statement
   * Set new String lastChar to the last character in statement
   * if lastChar is a period...
   *        remove the period
   *
   * Set new int psnOfYou to the result of findKeyword
   *        @param statement and "you"
   * Set new int psnOfMe to the result of findKeyword
   *      @param statement, "me", and psnOfYou + 3
   * Set new String restOfStatement to the rest of statement after "You" + 3,
   * and before "me".
   *
   * return "What makes you think that I " + restOfStatement + "you?"
   * */
   statement = statement.trim();		
   String lastChar = statement.substring(statement.length() - 1);
   
   if(lastChar.equals("."))
   {
	   statement = statement.substring(statement.length()- 1);
   } //statement.substring(0, statement.length()-1)
   
   int psnOfYou = findKeyword(statement, "you", 0);
   int psnOfMe = findKeyword(statement, "me", psnOfYou + 3);
   String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
	return "What makes you think that I " + restOfStatement + "you?"; 
}

private String transformIYouStatement(String statement)
{
	statement = statement.trim();		
   String lastChar = statement.substring(statement.length() - 1);
   
   if(lastChar.equals("."))
   {
	   statement.substring(0, statement.length()-1);
   } 
   
   int psnOfYou = findKeyword(statement, "you", 0);
   int psnOfI = findKeyword(statement, "I", psnOfI);
   String restOfStatement = statement.substring(psnOfI + 1, psnOfYou).trim();
	return "Why do you " + restOfStatement + "me?"; 
}

	
	private int findKeyword(String statement, String goal, int startPos)
	{			
				//redundantly recalled startPos as int 
				startPos = 0;
				String phrase = statement.trim();
				int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
				
		
				while (psn >= 0)
				{
					String before = " ";
					String after = " ";
				
					if(psn > 0)
					{
						before = phrase.substring(psn-1, psn).toLowerCase();
					}	
				/*check if yowise
					set afteru can fit goal into the rest of phrase - no need to
				proceed other = the slot in phrase after psn + length of goal */

				//=====> code here
					if (psn + goal.length() < phrase.length())
					{
						after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
					}
				/* if before and after are not letters (compare before to "a"
					and after to "z")
						--return psn
					
				Otherwise, search for goal in phrase from psn + 1 forward */
					if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))&&((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
					{
						return psn;
					}

					psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
				
				}
			
				return -1;
	}
	//brackets were placed incorrectly 

	/** Override - this method is used if there are only 2 parameters...*/
	private int findKeyword(String statement, String goal)
	{
		//set startPos to 0 if not specified
		return findKeyword(statement, goal, 0);
	}

	/** getRandomResponse() method
	 * =============================================================*/
	/** Pick a default response to use if nothing else fits.
	 * 	@return a non-committal string*/
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
}

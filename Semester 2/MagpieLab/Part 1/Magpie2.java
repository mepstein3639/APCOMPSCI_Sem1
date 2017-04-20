public class Magpie2
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	public String getResponse(String statement)
	{
		String response = "";

		if (statement.length() == 0)
		{
			response = "Say something, please.";
		}

		else if (findKeyword(statement, "no", 0) >= 0)
		{
			response = "Why so negative?";
		}

		else if (findKeyword(statement, "mother", 0) >= 0
				|| findKeyword(statement, "father", 0) >= 0
				|| findKeyword(statement, "sister", 0) >= 0
				|| findKeyword(statement, "brother", 0) >= 0)
		{
			response = "Tell me more about your family.";
		}

		else if (findKeyword(statement, "dog", 0) >= 0
				|| findKeyword(statement, "cat", 0) >= 0
				|| findKeyword(statement, "fish", 0) >= 0
				|| findKeyword(statement, "turtle", 0) >= 0)
		{
			response = "Tell me more about your pet.";
		}
		
		else if (findKeyword(statement, "Robinette", 0) >= 0)
		{
			response = "He sounds like a dank teacher.";
		}
		
		else if (statement.trim().length() == 0)
		{
			response = "Say something, please";
		}

		else
		{
			response = getRandomResponse();
		}
		return response;
	}
	
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.toLowerCase().trim();
		goal = goal.toLowerCase();
	
		int psn = phrase.indexOf(goal, startPos);

		String before = "";
		String after = "";
		
		while(psn >= 0)
		{
			if(psn > 0)
			{
				before = String.valueOf(phrase.charAt(psn - 1));
			}
			
			if(goal.length() <= phrase.length() - (psn + 1))
			{
				after = String.valueOf(phrase.charAt(psn + goal.length()));
			}

			if(((before.compareTo("a") < 0) || (before.compareTo("z") >0))
				&& ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
			{
				return psn;
			}
	
			else
			{
				psn = phrase.indexOf(goal, psn + 1);
			}
		}
		return -1;
	}

	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

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
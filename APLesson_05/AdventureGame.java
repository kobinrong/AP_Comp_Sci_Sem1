import java.util.Scanner;
public class AdventureGame
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Your alarm goes off. Today you decided to not snooze through your alarm and get out of bed. You roll out of bed to find out that your entire room, including yourself, is blanketed in dust. The window is cracked open; you could probably crawl out of it. But, your door is shut. Do you " +
							"\n 1. Crawl out of the window" +
							"\n 2. Attempt to open the door" +
							"\n 3. Search the room");
		int firstcase = kb.nextInt();
		if( firstcase == 1)
		{
			System.out.println("You crawled out of the window, but one of the glass shards cuts your feet. You successfully manage to crawl out of the window and stand on your roof. Your familiar blue sky is a dusty tan. The roads are worn down, but there is your car, paint faded and glass faded. There are also a few other cars around; it looks like they've been parked there recently. You still want to know what's going on and think about going into the house . Do you:" +
						"\n 1. Go to your old car. You like the familiarity and want to see old Betsy go" +
						"\n 2. Try to enter your house from the front door. Something happened and you need to find out what happened and where everyone went. Plus, you need the keys to Betsy.");
			int Window1 = kb.nextInt();
			if( Window1 == 1)
			{
				System.out.println("You walk to your old car cautiously because you're scared and unsure. The pavement that you used to play basketball on has been weathered to the bare earth. You approach old Betsy when you hear the door of your house slam open.");
				System.out.println("\"Who's that? Stop right there! Get em!\"");
				System.out.println("You frantically try to open Betsy's door but you realize that you didn't have the keys. You idiot. The raiders grab you and throw you into a sack. They threw you too roughly. You ded.");
			}
			else 
			{
				System.out.println("You gingerly slide down the roof and attempt to land gently onto the ground. Ouch! The cut on your foot stings, yet you still carry on to the front door. \n It's ajar, but of course, you don't just party on in. You can hear some talking in the kitchen, but whoever is in the kitchen won't be able to hear you creep to the nearby drawer with the keys and such.");
				System.out.println("\n You take your keys, but look down and see that your cut has left a bloody footprint trail.");
				System.out.println("\n \"Wait, I smell something... Smells like human blood. What's going on..\" and then you hear shuffling of feet and chairs being pushed back. ");
				System.out.println("\n Oh no, what do we do?? You look around and see that maybe you could hide in the biggest drawer. Or you could get the heck out of there. Do you: " +
								"\n 1. Hide. It seems like the easiest thing to do. Your foot hurts." +
								"\n 2. Run. Maybe you can make it!");
				int hide = kb.nextInt();
				if(hide == 1)
				{
					System.out.println("You quickly shove yourself into the small closet space and close the door. There's a little peephole. You try to calm your breathing, but your foot also really hurts.");
					System.out.println("\n You can sense the individuals near the blood footprint path you left. They might go outside...");
					System.out.println("\n \"Knock knock~ I smell a human\" Your little closet door is swung off the hinges and so are you as you are hoisted into the maw of the creature. You ded");
				}
				else
				{
					System.out.println("You run. Dang it, you just run. And thank goodness, more cars appear!!!??");
					System.out.println("Uniformed individuals jump out of the cars. \"Is there anyone else that needs assistance? Are you the only captive?\" You simply nod and hop into the cars and speed off to safety. You're safe!");
				}
			}	
		}			
		else if(firstcase == 2)
			{
				System.out.println("You attempt to open the door. You succeed, but it seems like some people were waiting for you to open the door. You are met by grotesque figures with large mouths gaping open for their next meal. You ded.");
			}
		else
			{
				System.out.println("You search around the room and you end up finding an teleporting device with a note on it. \n \"Press the button on the teleporter to be transported back to the base. We'll explain later.\" Without much of a choice, you press the button and are whisked to a galactic space station. Who knows what will happen next?");
			}

		
		
	}
}

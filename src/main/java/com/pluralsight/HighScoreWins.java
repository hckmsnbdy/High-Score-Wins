package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

/*Step 1
Prompt the user for a game score.
The user will input a score in the following format:
Home:Visitor|21:9
Based on the user input, you should determine which team had the higher score
and display the name of the winning team.
Hint: You will have to split the user input multiple times to get all of the
information
- one split will be on the pipe ( | )
- one split will be on the colon ( : )
A sample trace of your program output is shown below. Bolded code is what the
user entered.
Please enter a game score: Home:Visitor|21:9↵
Winner: Home
A different trace would be:
Please enter a score: Slytherin:Gryffindor|23:59↵
Winner: Gryffindor
**/
public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game score:");
        String score = scanner.nextLine();

        //Home:Visitor|21:9
        String[] partName = score.split(Pattern.quote("|"));
        String partName2 = partName[0];
        String[] partName3 = score.split(Pattern.quote(":"));

        //Home:Visitor|21:9
        String[] partScore = score.split(Pattern.quote(":"));
        String partScore2 = partScore[0];
        String[] partScore3 = score.split(Pattern.quote(":"));


        System.out.println("partName[1]:" + partName[1]);
        System.out.println("partName2:" + partName2);
        System.out.println("partName3[1]:" + partName3[1]);
        System.out.println("partScore[2]:" + partScore[2]);
        System.out.println("partScore2:" + partScore2);
        System.out.println(" partScore3[2]:" + partScore3[2]);




    }
}

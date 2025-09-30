package com.pluralsight;

import java.util.Scanner;

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

        // Splitting multiple parts at a time
        String[] partName = score.split("[|:]");

        // Converting strings to integers and defining  variables
        String team1 = partName[0];
        String team2 = partName[1];
        int score1 = Integer.parseInt(partName[2]);
        int score2 = Integer.parseInt(partName[3]);

        // Printing Teams And Scores
        System.out.println("Team1 :" + partName[0]);
        System.out.println("Team2 :" + partName[1]);
        System.out.println("Team1 Score :" + partName[2]);
        System.out.println("Team2 Score :" + partName[3]);

        //Deciding Who wins(Conditions) and Printing
        if (score2 > score1){
            System.out.println("Winner: " + team2);
        }
        else
            System.out.println("Winner: " + team1);
    }
}

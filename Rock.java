// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        Random generator = new Random();
        Scanner scan = new Scanner(System.in);
        personPlay = scan.next();
        personPlay = personPlay.toUpperCase();
        computerInt = generator.nextInt();
        if(computerInt == 0)
        {
            computerPlay = "R";
        } else if(computerInt == 1) {
            computerPlay = "P";
        } else {
            computerPlay = "S";
        }
        System.out.print(computerPlay);
    }
}
import java.util.Scanner;
public class JavaGuessDatNumber
{
   public static void main(String args[])
   {
     Scanner keyboard = new Scanner(System.in); 
     int answer = (int) (Math.random() * 10 + 1);
     // this is the random number//
     int userguess; 
     //the users input is stored as an integer//
     System.out.println("I am thinking of a number between 1 and 10. What is it?");
     userguess = keyboard.nextInt();     
     if(userguess != answer){
     //this if else statment is for when the user is incorrect
         if (userguess > answer){
             System.out.println("You guessed too high ya bozo! The answer was..... " +answer);
} else if(userguess < answer){
System.out.println("You guessed too low ya bozo! The answer was.... " +answer);
}
}
//this if statement is printed if the user's guess is correct
if (userguess == answer){
   System.out.println("Ding Ding Ding!!! You are correct!"); 
}
}
}

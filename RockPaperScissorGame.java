import java.util.Scanner;

import java.util.Random;

class RockPaperScissorGame
{
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    Random ran=new Random();

    int num;
    String UserChoice="";
    String ComputerChoice="";
    int UserWins=0;
    int ComputerWins=0;

    System.out.println("Welcome to Rock-Paper-Scissors Game");

      for(int i=0;i<3;i++)
      {
       System.out.println("\nchooose R)ock,P)aper, S)cissor ->");
       UserChoice=sc.nextLine();
       num=ran.nextInt(3);
         
       if(num==0){
          ComputerChoice="R";
       }
       else if(num==1){
         ComputerChoice="P";
       }
       else if(num==2){
         ComputerChoice="S";
       }
        
       if(ComputerChoice.equals("R")){
        System.out.println("The Computer chooses Rock");
       }
       else if(ComputerChoice.equals("P")){
        System.out.println("The Computer chooses Paper");
       }
       else if(ComputerChoice.equals("S")){
        System.out.println("The Computer chooses Scissor");
       }

       if(UserChoice.equals("R") && ComputerChoice.equals("S")){
         System.out.println("THE USER WON");
         UserWins++;
       }
       else if(UserChoice.equals("S")&&ComputerChoice.equals("R")){
        System.out.println("THE COMPUTER WON");
        ComputerWins++;
       }
       else if(UserChoice.equals("R")&&ComputerChoice.equals("P")){
        System.out.println("THE COMPUTER WON");
        ComputerWins++;
       }
       else if(UserChoice.equals("P")&&ComputerChoice.equals("R")){
        System.out.println("THE USER WON");
        UserWins++;
       }
       else if(UserChoice.equals("P")&&ComputerChoice.equals("S")){
        System.out.println("THE COMPUTER WON");
        ComputerWins++;
       }
       else if(UserChoice.equals("S")&&ComputerChoice.equals("P")){
        System.out.println("THE USER WON");
        UserWins++;
       }
       else if(UserChoice.equals(ComputerChoice)){
        System.out.println("IT'S A TIE");
       }
        
        System.out.println("USER WINS:- " +  UserWins  +" "  + " COMPUTER WINS:- "+  ComputerWins);}
      
        if(UserWins > ComputerWins)
      {
        System.out.println("\nTHE USER IS THE WINNER");
      }
       else if(ComputerWins > UserWins)
      {
        System.out.println("\nTHE COMPUTER IS THE WINNER");
      }
       else{
        System.out.println("TIE");
      } 
    
}}

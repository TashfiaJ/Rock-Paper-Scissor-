package com.company;
import java.awt.desktop.SystemEventListener;
import java.util.*;


public class RockPaperScissor {
    public static void main(String[] args) {
         Random rand=new Random();
         Scanner sc=new Scanner(System.in);
         int you=0,com=0;
        System.out.println("0->stands for rock, 1->stands for paper, 2->stands for scissor");
        for(int i=0;i<5;i++){
            int comp = rand.nextInt(3);
            System.out.println("Select among 0,1,2");
            int human=sc.nextInt();
            System.out.println("Computer selected "+comp);
            if(comp==0 && human==1){
                System.out.println("You Won!\n");
                you++;
            }
            else if(comp==0 && human==2){
                System.out.println("You Lose.\n");
                com++;
            }
            else if(comp==1 && human==0){
                System.out.println("You Lose\n");
                com++;
            }
            else if(comp==1 && human==2){
                System.out.println("You Won!\n");
                you++;
            }
            else if(comp==2 && human==0){
                System.out.println("You Won!\n");
                you++;
            }
            else if(comp==2 && human==1){
                System.out.println("You Lose\n");
                com++;
            }
            else{
                System.out.println("It's a tie.");
            }
        }
        if(com<you){
            System.out.println("You've won the game.");

        }
        else if(you<com){
            System.out.println("You lose. Better luck for next time.");
        }
        else
            System.out.println("It's a tie");
    }
}

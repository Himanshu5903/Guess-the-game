package com.company;
import java.util.Random;
import java.util.Scanner;
class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;
    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses=noOfGuesses;
    }
    Game(){
        Random rand=new Random();
        this.number= rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Enter Number");
        Scanner ob=new Scanner(System.in);
        inputNumber=ob.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==number){
            System.out.format("Yes u have guessed it right,it was %d /n U guessed it in %d attempt ",number,noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low..");
        }
        else if(inputNumber>number){
            System.out.println("Too high..");
        }
        return  false;

    }

}

public class Main {

    public static void main(String[] args) {
        //   System.out.println("hello");
	// write your code here
        Game g=new Game();
        boolean b=false;
        while(!b){
            g.takeUserInput();
            b= g.isCorrectNumber();
        }
    }
}

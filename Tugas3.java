/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas3;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Aria
 */
public class Tugas3 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner read = new Scanner(System.in);
Random randomNumber = new Random();

int input;
int correct = 0;
int randomOutput = (int)(Math.random()*100);
do
{

System.out.println("Enter your Guess: ");
input = read.nextInt();


    if(randomOutput == input)
    {
        System.out.println("Yes, the number is " + randomOutput);
        correct = 1;

    }

    if(input > randomOutput)
    {
        
        System.out.println("Your guess is too High");
        correct = 0;
    }

    if(input < randomOutput)
    {
        
        System.out.println("Your guess is too Low");
        correct = 0;
    }

}
while (correct == 0);

}
}
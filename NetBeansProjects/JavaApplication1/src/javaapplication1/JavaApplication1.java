/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
//import javaapplication1.JavaApplication1.practice.Game;
/**
 *
 * @author HP
 */
public class JavaApplication1 {

       static Scanner input = new Scanner(System.in);
        static class Game{
            int score = 20;
            public void Greetings(){
                System.out.println("Enter name");
                String name = input.nextLine();
                System.out.println("Good Morning " + name);
            }
        
    }
    public static void main(String[] args) {
        Game obj = new Game();
//        System.out.println("");
        obj.Greetings();
//        System.out.println();
        
    }
    
}

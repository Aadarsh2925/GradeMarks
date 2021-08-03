package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your marks:");
        int marks=scanner.nextInt();
        scanner.nextLine();
        String grade;
        if(marks>=80&&marks<=100){
            System.out.println("you got A grade with "+marks+" marks");
        }else if(marks>=73&&marks<80){
            System.out.println("you got B grade with "+marks+" marks");
        }else if(marks>=65&&marks<73){
            System.out.println("you got C grade with "+marks+" marks");
        }else if(marks>=55&&marks<65){
            System.out.println("you got D grade with "+marks+" marks");
        }else{
            System.out.println("you got grade F with "+marks+" marks");
        }
    }
}

import java.util.Scanner;
public class NumberGuess{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = (int)(Math.random()*101);
        System.out.println(" guess the number ");
        int i=0;
        while( i<3){
            int guess_number = scanner.nextInt();
            System.out.print("enter the guessed number ");
            if(number>guess_number)
                System.out.println("you guessed smaller number ");
            else if(number<guess_number){
                System.out.println(" you guessed larger number ");}
            else{
                System.out.println("you guessed the right number ");
                break;}
                i++;} scanner.close();}
                }
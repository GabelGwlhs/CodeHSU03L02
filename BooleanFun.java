
import java.util.Scanner;
public class BooleanFun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int myAge = input.nextInt();
        System.out.println("Current age: " + myAge);

        //convert these into something more complete using if statements

        if (myAge >= 25) {
            System.out.println("You can rent a car");

        }
        if(myAge < 25){
            System.out.println("You cannot rent a car :(");

        }

        if (myAge>=65){
            System.out.println("You can have a senior discount");
        }
        else {
            System.out.println("You cannot have a senior discount");
        }

        if (myAge<=12){
            System.out.println("You can order off the childrens menu");
        }
        else{
            System.out.println("You cannot order off the childrens menu");
        }
        int nextAge = myAge+1;
        System.out.println("On your next birthday out you will be: "+nextAge); //complete this code, don't do math in sout

        //further modification: prompt user for input and then print what they are able to do based on their age
        //and print their age on their next birthday

    }
}
